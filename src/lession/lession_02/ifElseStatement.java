package lession.lession_02;

import java.util.Scanner;

public class ifElseStatement
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter arraival time: ");
        int  inputArraivalTime = scanner.nextInt();

        // Compare : ==, !=, >, <, >=, <=
        boolean isHeOnTime = inputArraivalTime == 7; // ở đây là phép so sánh chứ ko là gán giá trị

        if(isHeOnTime){
            System.out.printf("Welcome!!");
        }else {
            System.out.println("Go home");
        }
    }
}
