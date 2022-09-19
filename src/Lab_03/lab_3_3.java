package Lab_03;

public class lab_3_3 {
    public static void main(String[] args) {

        int[] myArray = {1, 2, 3, 5, 10, 35, 60, 15, 52, 60, 90, 100, 150, 56, 80};

        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] > myArray[j]) {
                    int temp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }
        System.out.println("Sort an integer array from min to max: ");
        for (int value : myArray) {
            System.out.print(value + "\t");
        }
    }
}
