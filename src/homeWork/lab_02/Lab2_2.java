package homeWork.lab_02;

import java.util.Scanner;

public class Lab2_2 {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.printf("Please enter the number that you want to check (not 0): ");
            number = scanner.nextInt();
        }while(number == 0);

        if(number % 2 == 0){
            System.out.println("This is a even nunmber!!!");
        } else{
            System.out.println("This is a odd nunmber!!!");
        }
    }
}
