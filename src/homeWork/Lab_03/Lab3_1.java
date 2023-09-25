package homeWork.Lab_03;

import java.awt.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Lab3_1 {
    public static void main(String[] args) {
        int phanTuMang;
        int numberEven = 0;
        int numberOdd = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indicate how many array molecules there are: ");
        int soLuongPhanTu = scanner.nextInt();
        int[] list = new int[soLuongPhanTu];

        for (int phanTu = 0; phanTu < list.length; phanTu++) {
            System.out.printf("Enter the number at %d:\n ", phanTu);
            phanTuMang = scanner.nextInt();
            list[phanTu] = phanTuMang;
        }
        for (int phanTu = 0; phanTu < list.length; phanTu++) {
            System.out.printf("Array at %d is %d \n", phanTu, list[phanTu]);
        }
        for (int index = 0; index < list.length; index++) {
            if(list[index] % 2 == 0){
                numberEven++;
            }else {
                numberOdd++;
            }
        }
        System.out.printf("Even number is: %d\n", numberEven++);
        System.out.printf("Odd number is: %d", numberOdd++);
    }
}
