package homeWork.Lab_02;

import java.util.Scanner;

public class Lab2_1 {
    public static void main(String[] args) {
        float BMI;
        do {
            System.out.println("Enter your information at here." +
                    " Please enter the positive number!!!");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your weight: ");
            float yourWeight = scanner.nextInt();
            System.out.println("Please enter your height (cm): ");
            float yourHight = scanner.nextInt();
            BMI = (yourWeight / (yourHight * 2)) * 100;
        }while(BMI < 0);
        System.out.printf("Here is your BMI: %f\n", BMI);

        if(BMI <= 18.5){
            System.out.println("Under weight");
        } else if (18.5 < BMI & BMI <= 24.9) {
            System.out.println("Normal weight");
        } else if (25 < BMI & BMI <= 29.9) {
            System.out.println("Over weight");
        } else{
            System.out.println("Obesity");
        }
    }
}
