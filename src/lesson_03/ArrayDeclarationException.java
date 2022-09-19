package lesson_03;

public class ArrayDeclarationException {
    public static void main(String[] args) {
        int[] myIntArray = new int[] {1,2, 'A'};

        for (int value : myIntArray) {
            System.out.println(value);
        }

    }
}
