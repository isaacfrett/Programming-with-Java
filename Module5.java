// Isaac Frett 11/11/2022 Module 5 Programming Assignment
// The purpose of this code is to display two outputs of two math operations of which one is in ascending order
// and the other is the same operation but in decensding order

public class Module5 {
    public static void main(String[] args) {
        // Establishes our varibales of the denominator and the final result of the operation
        double denominator = 3.0;
        double results = 0;

        // Our first while loop, checks if condition of denimoniator is within bounds of operation, if so prints the operation as a string and adds
        // calculation to the results running total. After last value is reached, the total is dispalyed following the operation. Everytime incremented by 2
        while(denominator < 100) {
            if (denominator > 98) {
                var operation = ("1/" + denominator + " = ");
                results += (1/denominator);
                System.out.print(operation + results);
            }
            else {
                var operation = ("1/" + denominator + " + "); 
                results += (1/denominator);
                System.out.print(operation);
            }
            denominator += 2;
        }

        // Prints new line to seperate the two operations and resets our varibales for the reverse order
        System.out.println("\n");
        denominator = 99.0;
        results = 0;

        //Similar loop to as above just done in a reverse order this time incremnting down from 99 until 3
        while(denominator > 2) {
            if (denominator < 4) {
                var operation = ("1/" + denominator + " = ");
                results += (1/denominator);
                System.out.print(operation + results);
            }
            else {
                var operation = ("1/" + denominator + " + "); 
                results += (1/denominator);
                System.out.print(operation);
            }
            denominator -= 2;
        }
    }
}
