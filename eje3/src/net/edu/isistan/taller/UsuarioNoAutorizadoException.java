package net.edu.isistan.taller;

public class UsuarioNoAutorizadoException extends Exception {
    private String nameFail;
    private String passFail;

    public UsuarioNoAutorizadoException(UserLogin userLogin) {
        super();
        this.nameFail = userLogin.getName();
        this.passFail = userLogin.getName();
    }

    public String getNameFail() {
        return nameFail;
    }

    public void setNameFail(String nameFail) {
        this.nameFail = nameFail;
    }

    public String getPassFail() {
        return passFail;
    }

    public void setPassFail(String passFail) {
        this.passFail = passFail;
    }
}
