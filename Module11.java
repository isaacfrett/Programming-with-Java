// Isaac Frett 12/9/2022 Module 11 Progamming Assignment
// The purpose of this code is to pass 2D Arrays into methods to return the index of their largest and smallest elements

import java.util.Arrays;

public class Module11 {
    
    public static void main(String[] args) {

        // First 2D array table of integer arrays and method calls to find smallest and largest element index locations
        int[][] arraytable1 = new int [2][];
        arraytable1[0] = new int[] {4, 23, 12, 54, 16};
        arraytable1[1] = new int[] {76, 43, 21, 77, 42};
        System.out.println();
        System.out.println("The largest elements of the lists " + Arrays.toString(arraytable1[0]) + " and " + Arrays.toString(arraytable1[1]) + " are at index locations " + Arrays.toString(locateLargest(arraytable1)) + " respectively.");
        System.out.println("The smallest elements of the lists " + Arrays.toString(arraytable1[0]) + " and " + Arrays.toString(arraytable1[1]) + " are at index locations " + Arrays.toString(locateSmallest(arraytable1)) + " respectively.");

        System.out.println();

        // Second 2D array table of double arrays and the method calls to find smallest and largest element index locations
        double[][] arraytable2 = new double [2][];
        arraytable2[0] = new double[] {4.5, 12.7, 13.4, 8.6, 5.3};
        arraytable2[1] = new double[] {3.7, 1.4, 2.3, 5.3, 14.2};
        System.out.println("The largest elements of the lists " + Arrays.toString(arraytable2[0]) + " and " + Arrays.toString(arraytable2[1]) + " are at index locations " + Arrays.toString(locateLargest(arraytable2)) + " respectively.");
        System.out.println("The smallest elements of the lists " + Arrays.toString(arraytable2[0]) + " and " + Arrays.toString(arraytable2[1]) + " are at index locations " + Arrays.toString(locateSmallest(arraytable2)) + " respectively.");
        System.out.println();
    }

    // Method to find largest element indexes from a double 2D array
    public static int [] locateLargest (double [][] arrayParam) {
        int largest_list[] = {0, 0};
        double largest_element = 0;
        for (int i = 0; i < arrayParam.length; ++i) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > largest_element) {
                    largest_element = arrayParam[i][j];
                    largest_list[i] = j;
                } 
            }
            largest_element = 0;
        }
        return largest_list;
    }

    // Method to find largest element indexes from a int 2D array
    public static int [] locateLargest (int [][] arrayParam) {
        int largest_list[] = {0, 0};
        int largest_element = 0;
        for (int i = 0; i < arrayParam.length; ++i) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > largest_element) {
                    largest_element = arrayParam[i][j];
                    largest_list[i] = j;
                } 
            }
            largest_element = 0;
        }
        return largest_list;
    }

    // Method to find smallest element indexes from a double 2D array
    public static int [] locateSmallest (double [][] arrayParam) {
        int smallest_list[] = {0, 0};
        double smallest_element;
        for (int i = 0; i < arrayParam.length; ++i) {
            smallest_element = arrayParam[i][0];
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < smallest_element) {
                    smallest_element = arrayParam[i][j];
                    smallest_list[i] = j;
                } 
            }
            smallest_element = 0;
        }
        return smallest_list;
    }

    // Method to find smallest element indexes from a int 2D array
    public static int [] locateSmallest (int [][] arrayParam) {
        int smallest_list[] = {0, 0};
        int smallest_element;
        for (int i = 0; i < arrayParam.length; ++i) {
            smallest_element = arrayParam[i][0];
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < smallest_element) {
                    smallest_element = arrayParam[i][j];
                    smallest_list[i] = j;
                } 
            }
            smallest_element = 0;
        }
        return smallest_list;
    }

}
