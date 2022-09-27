package Lab_06;

import java.util.Scanner;

public class lab_06_02 {
    public static void main(String[] args) {
        String myPassword = "password123";
        int totalInput = 0;
        while (totalInput < 3) {
            if (inputPassword().equals(myPassword)) {
                System.out.println("Login Successfully!");
                break;
            }
            totalInput++;
        }
        if (totalInput == 3) {
            System.out.println("You have entered an incorrect password three times");
        }
    }
    private static String inputPassword() {
        System.out.print("Please enter your password: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
