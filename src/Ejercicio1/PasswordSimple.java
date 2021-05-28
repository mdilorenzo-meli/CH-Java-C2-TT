package Ejercicio1;

public class PasswordSimple extends Password {
    String regex;

    public PasswordSimple() {
        this.regex =  "(?=.*[0-9])(?=.*[a-z]).{8,}";
    }
}
