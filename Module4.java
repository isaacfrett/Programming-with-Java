// Isaac Frett 11/04/2022 Module 4 Programming Assignment
// The purpose of this code is to have a user enter two strings and report if one of the strings is a substring of the other

import java.util.Scanner;

// This is the main class that takes in two strings and checks if either of the strings contain each other
public class Module4 {
    public static void main(String[] args) {
        try (Scanner inputs = new Scanner(System.in)) {
            System.out.println("Please enter a string:");
            String string1 = inputs.nextLine();
            System.out.println("Please enter a second string:");
            String string2 = inputs.nextLine();

            // Checks if strings contain each other or if they don't, outputs a repsonse
            if (string1.contains(string2)) {
                System.out.println(string2 + " is a substring of " + string1);
            }
            else if (string2.contains(string1)) {
                System.out.println(string1 + " is a substring of " + string2);
            }
            else {
                System.out.println("There is no substring of either of the entered strings.");
            }
        }

        catch (Exception e) {
            System.out.println("Something went wrong. Please try again.");
        }
    }

}
