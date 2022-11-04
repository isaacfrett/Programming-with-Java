// Isaac Frett 10/18/2022 Module 1 Programming Assignment
// The purpose of this code is to output two similar equations written differently to compare the outputs

// This establishes the class
public class Module1 {

// This is our main method that will hold two variables for our equations and print out strings with each variable's output
    public static void main(String[] args) {
        var set1 = 4 * ( 1.0 - 1.0 / 3.0 + 1.0 / 5.0 - 1.0 / 7.0 + 1.0 / 9.0 - 1.0 / 11.0 + 1.0 / 13.0 );
        var set2 = 4 * ( 1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 + 1 / 13 );
        System.out.println("The output of 4 * ( 1.0 - 1.0 / 3.0 + 1.0 / 5.0 - 1.0 / 7.0 + 1.0 / 9.0 - 1.0 / 11.0 + 1.0 / 13.0 ) is: " + set1);
        System.out.println("The output of 4 * ( 1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 + 1 / 13 ) is: " + set2);
    }
}

// The difference in two different outputs is because of the decimals in the first set which allows java to read those numbers as a float.
// Thus making the output a float as well. The set2 is considered integers so the calculations are rounded to the near whole number and so
// the outputs is a whole number too. Adding "f" behind every number in set2 would allow java to read the numbers as floats and would calculate similar to set1.
