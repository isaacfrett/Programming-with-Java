// Isaac Frett 10/28/2022 Module 2 Programming Assignment
// The purpose of this code is to take inputs of water amount, initial and final temperatures and return the energy
// needed in order heat the water from the inital temperature to final temperature


// import Scanner to recieve user input
import java.util.Scanner;

// main class where we use the Scanner to take user input for our 3 variables, then plug variables into the assigned formula
// then output the answer in a constructed statement, using try and catch in case of errors 
public class Module2 {
    public static void main(String[] args) {
      
        try (Scanner inputs = new Scanner(System.in)) {
            System.out.println("Enter amount of water in kilograms: ");
            float amount_of_water = inputs.nextFloat(); 
            System.out.println("Enter the initial water temperature in celsius: ");
            float initial_temp = inputs.nextFloat();
            System.out.println("Enter the final water temperature in celsius: ");
            float final_temp = inputs.nextFloat();
            float joules = amount_of_water * (final_temp - initial_temp) * 4184;
            System.out.println("The energy needed to heat " + amount_of_water + " kilograms of water from " + initial_temp + 
            " degrees celsius to " + final_temp + " degress celsius is " + joules + " joules.");
        }

        catch (Exception e) {
            System.out.println("Something went wrong. Please try again");
        }
    }

}
