package Week10;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

// Write a method that can sort the ArrayList in Descending order without using the sort method
// Bubble sort method - we will compare the first and second elements beginning with the first index.
// If the first element of the array is lesser, then swap the first and second elements.
// After that, it will perform a comparison between the next two elements.

public class ArrayListSortingDesc {

    public static int[] sortDescending(int... arr){

        // two loops are used to sort the elements: 1 for iterating the array until its length,
        // 2 loop is used for checking elements and swapping them based on conditions:
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length - 1; j++){
                if(arr[j] < arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortDescending(-10, 20, 7, 8, 90)));
    }
}

