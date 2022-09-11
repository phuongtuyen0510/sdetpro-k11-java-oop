package lesson_02;

import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {
        final int EXPECTED_TIME = 7;
        Scanner scanner = new Scanner(System.in);
        System.out.printf(" Please input arrival time: ");
        int arrivalTime = scanner.nextInt();
        System.out.println("1. Dat xe ra");
        System.out.println("2. Chay den quan");

        //Comparison operators : == (ss = ) ,  != ( co khac khong), >, < , >=, <=
        boolean isHeOnTime = arrivalTime == EXPECTED_TIME;
        if (isHeOnTime) {
            System.out.println("\t ---->>> Let's talk");
        } else {
            System.out.println("\t ----> Write the letter");
        }
        System.out.println("3. Dat xe ra");
        System.out.println("4. Chay ve nha");
    }

}
