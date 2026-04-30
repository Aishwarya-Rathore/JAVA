import java.util.*;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();

        boolean hasDigit = false, hasUpper = false, hasSpecial = false;

        for(char ch : password.toCharArray()) {
            if(Character.isDigit(ch)) hasDigit = true;
            else if(Character.isUpperCase(ch)) hasUpper = true;
            else if(!Character.isLetterOrDigit(ch)) hasSpecial = true;
        }

        String missing = "";

        if(password.length() < 8) missing += "length < 8, ";
        if(!hasDigit) missing += "digit, ";
        if(!hasUpper) missing += "uppercase, ";
        if(!hasSpecial) missing += "special character, ";

        if(missing.equals("")) {
            System.out.println("Strong Password");
        } else {
            missing = missing.substring(0, missing.length() - 2);
            System.out.println("Weak Password: Missing " + missing);
        }

        sc.close();
    }
}