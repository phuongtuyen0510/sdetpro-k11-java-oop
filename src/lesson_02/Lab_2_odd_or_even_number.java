package lesson_02;

import java.util.Scanner;

public class Lab_2_odd_or_even_number {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please input the number: ");
            int yourNum = scanner.nextInt();

            if (yourNum / 2 == 0) {
                System.out.println("It's an even number");
            } else {
                System.out.println("It's an odd number");
            }

    }
}
