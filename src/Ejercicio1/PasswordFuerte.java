package Ejercicio1;

public class PasswordFuerte extends Password{

    String regex;

    public PasswordFuerte() {
        this.regex = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";
    }

}
