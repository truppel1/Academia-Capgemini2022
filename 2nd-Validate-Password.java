package com.company;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
        public static boolean Validatepassord(String password) {

            String regex = "^(?=.*[0-9])"
                    + "(?=.*[a-z])(?=.*[A-Z])"
                    + "(?=.*[!@#$%^&*()-+])"
                    + "(?=\\S+$).{6}$";

            Pattern p = Pattern.compile(regex);

            if (password == null) {
                return false;
            }

            Matcher m = p.matcher(password);

            return m.matches();
        }

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Password: ");
            String password = scanner.next();


            if(password.length() < 6){
                int sum = 6 - password.length();
                System.out.print("You can turn your password more safe adding " + sum + " characters.");
            }
            else if(password.length() >= 6) {
                if (Validatepassord(password) != false)
                System.out.println("Approved password");
            }
        }
}
