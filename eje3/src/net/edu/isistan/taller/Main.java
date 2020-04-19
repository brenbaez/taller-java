package net.edu.isistan.taller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Map<String, String> usersAndPasswords = fulfillUserAndPassword();
        UserLogin userLogin = login();
        verifyUserAndPass(userLogin, usersAndPasswords);
        System.out.println("Bienvenido a Masun application");
	// write your code here
    }

    private static void verifyUserAndPass(UserLogin userLogin, Map<String, String> usersAndPasswords) {
        try {
            verify(userLogin, usersAndPasswords);
        } catch (UsuarioNoAutorizadoException e) {
            System.out.println("usuario que fallo: " + e.getNameFail() +
                    " y su pass fue: " + e.getPassFail());
            throw new IllegalArgumentException();
        }
    }

    private static void verify(UserLogin userLogin, Map<String, String> usersAndPasswords) throws UsuarioNoAutorizadoException {
        if (!usersAndPasswords.containsKey(userLogin.getName())
        || !usersAndPasswords.get(userLogin.getName()).equals(userLogin.getPassword()))
            throw new UsuarioNoAutorizadoException(userLogin);
    }

    private static UserLogin login() throws IOException {
        BufferedReader name = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader pass =  new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ingrese su nombre de usuario: ");
        String realName = name.readLine();
        System.out.println("ingrese su pass: ");
        String realPass = pass.readLine();
        System.out.println("nm: " + realName + ", pw: " + realPass);

        return new  UserLogin(realName, realPass);

    }

    private static Map<String, String> fulfillUserAndPassword() {
        Map<String, String> usersAndPasswords = new HashMap<>();
        usersAndPasswords.put("santi", "1234");
        usersAndPasswords.put("bren", "La202413");
        usersAndPasswords.put("tatto", "Miloco94");
        usersAndPasswords.put("culo", "culo");
        usersAndPasswords.put("fede", "pedazo-de-puto");

        return usersAndPasswords;
    }
}
