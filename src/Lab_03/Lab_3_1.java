package Lab_03;

import java.util.Scanner;

public class Lab_3_1 {
    public static void main(String[] args) {

        int evenCount = 0;
        int[] myArray = {1, 2, 3, 5, 10, 35, 60, 15, 52, 60, 90, 100, 150, 56, 80};

        for (int index = 0; index < myArray.length; index++) {
            evenCount = myArray[index] % 2 == 0? (evenCount + 1) : evenCount;
        }
        System.out.printf("Array: ");

        for (int i = 0; i < myArray.length; i++) {
            System.out.printf("%d ", myArray[i]);
        }
        System.out.printf("\n");

        System.out.printf("Even numbers: %d\n", evenCount);
        System.out.printf("Odd numbers: %d\n", myArray.length - evenCount);

    }
}
