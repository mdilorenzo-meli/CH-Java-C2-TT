package Ejercicio1;

public class Password {
    String pwd, regex;

    /* Ejemplo de regex: ^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\S+$).{8,}$
     (?=.*[0-9]) a digit must occur at least once
    (?=.*[a-z]) a lower case letter must occur at least once
    (?=.*[A-Z]) an upper case letter must occur at least once
    (?=.*[@#$%^&+=]) a special character must occur at least once
    (?=\\S+$) no whitespace allowed in the entire string
    .{8,} at least 8 characters
     */
    public Password(String regex){
        this.regex = regex;
    }

    public Password() {
    }

    void setValue(String pwd) throws Exception {
        if(pwd.matches(regex)){
            this.pwd = pwd;
        }else
            throw new Exception("Password poco segura o incorrecta");
    }
}
