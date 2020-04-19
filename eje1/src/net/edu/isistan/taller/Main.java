package net.edu.isistan.taller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        List<String> nombres = new ArrayList<>();
        nombres.add("Bren");
        nombres.add("Santi");
        nombres.add("Juan");
        nombres.add("Bren");
        nombres.add("Santi");
        nombres.add("Santi");

        if(nombres.isEmpty())
            throw new EmptyListException("La lista esta vacia"); //para que lance la exception comentar los usarios
        Map<String, Integer> namesMap = new HashMap<>();
        for (String nombre: nombres) {
            if (namesMap.containsKey(nombre)) {
                int valor = namesMap.get(nombre);
                namesMap.put(nombre, ++valor);
            }
            else
                namesMap.put(nombre, 1);
            }

        namesMap.forEach((key, value) ->
                System.out.println("El nombre es: " + key + " y la cantidad de veces que aparece es: " + value));
        //dejo un comentario;;;
    }
}
