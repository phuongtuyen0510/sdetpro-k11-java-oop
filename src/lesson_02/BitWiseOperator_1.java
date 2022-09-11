package lesson_02;

import java.util.Scanner;

public class BitWiseOperator_1 {
    public static void main(String[] args) {
        /*
        * && : true && true
        * || : true || false , false || true, true || true ;
        *
        * */
        Scanner scanner = new Scanner(System.in);
        System.out.printf(" Please input first number: ");
        int firstNum = scanner.nextInt();
//        System.out.printf(" Please input second number: ");
//        int secondNum = scanner.nextInt();

        if(firstNum !=0 & getSecondNum() !=0) {
            System.out.printf("%d/%d=%d", firstNum, 2, firstNum/ 2);
        }

    }
    private static int getSecondNum(){
        System.out.println("Evaluate right operator");
        return 2;
    }
}
