package lesson_02;

import java.util.Scanner;

public class Lab_1_calculateBMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Please enter your height (M): ");
        float height = scanner.nextFloat();
        System.out.printf("Please enter your weight (kg): ");
        float weight = scanner.nextFloat();
        float BMI = weight / (height * 2);

        if (BMI < 18.5) {
            System.out.println("Underweight");
        } else if (BMI <= 24.9) {
            System.out.println("Normal weight");
        } else if (BMI <= 29.9) {
            System.out.println("Overweight");
        }else {
            System.out.println("Obesity");
        }

    }


}

