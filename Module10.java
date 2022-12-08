// Isaac Frett 12/7/2022 Module 10 Programming Assignment
// The purpose of this code is to write 4 methods that are the same in name but different in parameter datatype, they take in an array and return the average value


import java.util.Arrays;

public class Module10 {
    
    public static void main(String[] args) {
        // Initialize the arrays in different sizes and datatype
        short[] array1 = {5, 6, 65, 76, 34, 23};
        int[] array2 = {4, 6, 10, 67, 5};
        long[] array3 = {45, 342, 234};
        double[] array4 = {2.45, 2.32, 1.56, 2.76};

        // Output the arrays and the return value for the average of the arrays
        System.out.println();
        System.out.println("The average value in the array " + Arrays.toString(array1) + " is: " + average(array1));
        System.out.println();
        System.out.println("The average value in the array " + Arrays.toString(array2) + " is: " + average(array2));
        System.out.println();
        System.out.println("The average value in the array " + Arrays.toString(array3) + " is: " + average(array3));
        System.out.println();
        System.out.println("The average value in the array " + Arrays.toString(array4) + " is: " + average(array4));
        System.out.println();

    }


    // The four methods all with similar functions just with different data types
    public static short average(short [] array) {
        short average_value = 0;
        for (short element: array) {
            average_value += element;
        }
        average_value =  (short) (average_value / array.length);
        return average_value;
    }

    public static int average(int [] array) {
        int average_value = 0;
        for (int element: array) {
            average_value += element;
        }
        average_value =  average_value / array.length;
        return average_value;
    }

    public static long average(long [] array) {
        long average_value = 0;
        for (long element: array) {
            average_value += element;
        }
        average_value =  average_value / array.length;
        return average_value;
    }

    public static double average(double [] array) {
        double average_value = 0;
        for (double element: array) {
            average_value += element;
        }
        average_value =  average_value / array.length;
        return average_value;
    }

}
