package Ejercicio1;

public class PasswordIntermedia extends Password {
    String regex;

    public PasswordIntermedia() {
        this.regex =  "(?=.*[0-9])(?=.*[a-z])(?=\\S+$).{8,}";
    }
}
