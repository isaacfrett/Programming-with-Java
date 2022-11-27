// Isaac Frett 11/23/2022 Module 7 Programming Assignment
// The prupose of this code is to check if user's input String is a valid password given set rules. 

import java.util.Scanner;

public class Module7 {

    public static void main(String[] args) {

        // boolean for our while loop to keep the program running if password is invalid
        boolean repeat = true;

        // try/catch blocl to take user input and call methods to test the password validity
        while (repeat) {
            try {
                Scanner user_input = new Scanner(System.in);
                System.out.println("\nPlease enter a password"); 
                String user_password = user_input.nextLine();
                
                if (
                isLongenough(user_password) == true && 
                has_digit(user_password) == true &&
                has_letter(user_password) == true &&
                hasUpper(user_password) == true &&
                has_digit(user_password) == true &&
                hasLower(user_password) == true) {
                    System.out.println("Password is valid."); 
                    repeat = false;
                    user_input.close();
                }
                else{
                    System.out.println("Password invalid.");
                }
                user_input.reset();
            } 

            catch (Exception e) {
                System.out.println("Password invalid.");
            }
        }
    }

// method to check if the password is long enough
    private static boolean isLongenough(String user_password) {
        if (user_password.length() >= 8) {
            return true;
        }
        else {
            System.out.println("Password must be atleast 8 characters in length");
            return false;
        }
    }
    
// method to check if the password has atleast one letter
    private static boolean has_letter(String user_password) {
        for (int character = 0; character <= user_password.length() - 1; character++) {
            if (Character.isLetter(user_password.charAt(character))) {
                return true;
            }
            else {
                continue;
            }
        }
        System.out.println("Password must contain atleast one letter");
        return false;
    }

// method to check if the password has atleast one digit 
    private static boolean has_digit(String user_password) {
        for (int character = 0; character <= user_password.length() - 1; character++) {
            if (Character.isDigit(user_password.charAt(character))) {
                return true;
            }
            else {
                continue;
            }
        }
        System.out.println("Password must contain atleast one digit");
        return false;
    }

// method to check if the password has atleast one lowercase letter
    private static boolean hasLower(String user_password) {
        for (int character = 0; character <= user_password.length() - 1; character++){
            if (Character.isLowerCase(user_password.charAt(character))){
                return true;
            }
            else {
                continue;
            }
        }                
        System.out.println("Password must contain atleast one lowercase letter");
        return false;
    }

// method to check if the password has atleast one uppercase letter
    private static boolean hasUpper(String user_password) {
        for (int character = 0; character <= user_password.length() - 1; character++){
            if (Character.isUpperCase(user_password.charAt(character))){
                return true;
            }
            else {
                continue;
            }
        }                
        System.out.println("Password must contain atleast one uppercase letter");
        return false;
    }
}