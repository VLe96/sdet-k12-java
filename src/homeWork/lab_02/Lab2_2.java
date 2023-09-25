package homeWork.lab_02;

import java.util.Scanner;

public class Lab2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Please enter the number taht you want to check: ");
        int number = scanner.nextInt();

        if(number % 2 == 0){
            System.out.println("This is a even nunmber!!!");
        }else{
            System.out.println("This is a odd nunmber!!!");
        }
    }
}
