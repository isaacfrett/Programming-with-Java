// Isaac Frett 11/18/2022 Module 6 Programming Assignment
// The prupose of this code is to output a tree of patterned values with correct values, spacing, and line formats from a given example

public class Module6 {
        
    public static void main(String[] args) {

        // initilized our variables we will use throughout our loops
        int row;
        int column;
        int space;
    
        //nested loops to run through for every row in our tree
        for(row = 1; row <= 7; ++row) {

            // this variable will track the values that are outputed
            int number = 1;

            // this for loop creates spaces at the begining of rows 1-4
            for(space = 19; space > row; --space) {
                if (row <= 3)
                    System.out.print("  ");
            }

            // this for loop creates spaces for rows 5-7 since these rows have two digit values which throws off our spacing a bit
            for(space = 14; space > row; --space) {
                if (row >= 4 )
                    System.out.print("   ");
            }

            // this for loop creates our values on the left half of the tree and doubles the values for every row in the tree
            for(column = 1; column <= row ; column++) {
                System.out.print(number + " ");
                number*=2;                
            }

            // this for loop creates values on the right half of the tree and divides values by two for every row minus one in the tree
            for(column = row - 1; column >= 1; column--) { 
                number/=2;
                if (column >= row - 1)
                    number/=2;
                System.out.print(number + " "); 
            }

            // this for loop adds spacing for lines 1-4 for the rightmost part of the tree after values
            for(space = 8; space > row; --space) {
                if (row <= 4)
                    System.out.print("  ");
            }

            // this for loop adds spacing for lines 5-7 since again these are oddly spaced because of two digit values
            for(space = 7; space > row; --space) {       
                if (row >= 5)
                    System.out.print("   ");
            }

            // this outputs the @ symbol after the spacing and moves us onto the next row of our tree
            System.out.print("@");
            System.out.println();
        }
    }
}
