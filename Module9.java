// Isaac Frett 11/28/2022 Module 9 Programming Assignment
// The purpose of this code is to fill an array of integers and read the array to calculate data values and display them

import java.util.Arrays;
import java.util.Random;

public class Module9 {
    
    // main method to call our array creation method and call the data value methods, also will print our display of each
    public static void main(String[] args) {
        int[] array1 = create_array();
        System.out.println("Our randomly generated array is: " + Arrays.toString(array1) + "\n");
        int high_value = highest_value(array1);
        System.out.println("The highest value in the array is: " + high_value);
        int low_value = lowest_value(array1);
        System.out.println("The lowest value in the array is: " + low_value);
        int average_value = average(array1);
        System.out.println("The average of the numbers in the array is: " + average_value);
        int sum_total = sum(array1);
        System.out.println("The sum total of the array is: " + sum_total);
    }

    // our create array method that will initialize the array and add 20 random integers to it
    public static int[] create_array() {
        int [] array = new int[20];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int rand_int = random.nextInt(100);
            array[i] = rand_int;
        }
        return array;
    }

    // the method for our highest value will iterate through the array to check if a number is bigger than previous number and make that our variable
    public static int highest_value(int[] array) {
        int high_value = 0;
        for (int element: array) {
            if (element > high_value) {
                high_value = element;
            }
            else {
                continue;
            }
        }
        return high_value;
    }
    // same as above just opposite, to check which values are lower
    public static int lowest_value(int[] array) {
        int low_value = 100;
        for (int element: array) {
            if (element < low_value) {
                low_value = element;
            }
            else {
                continue;
            }
        }
        return low_value;
    }

    // to find the average we add all our elements in the list together and divide by the number of elements in the list
    public static int average(int[] array) {
        int average_value = 0;
        for (int element: array) {
            average_value += element;
        }
        average_value =  average_value / array.length;
        return average_value;
    }

    // sum method to add all the elements in the list together
    public static int sum(int[] array) {
        int sum_value = 0;
        for (int element: array) {
            sum_value += element;
        }
        return sum_value;
    }
}
