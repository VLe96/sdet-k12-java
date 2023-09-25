package homeWork.Lab_03;

import java.util.Scanner;

public class Lab3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indicate how many array molecules there are: ");
        int soLuongPhanTu = scanner.nextInt();
        int[] list = new int[soLuongPhanTu];
        int min = list[0];
        int max = list[0];

        for (int phanTu = 0; phanTu < list.length; phanTu++) {
            System.out.printf("Enter the number: ");
            list[phanTu] = scanner.nextInt();
        }
        for (int phanTu = 0; phanTu < list.length; phanTu++) {
            System.out.printf("Array at %d is %d \n", phanTu, list[phanTu]);
        }
        for (int index = 0; index < list.length; index++) {
            if(min > list[index]) {
                min = list[index];
            }
        }
        for (int index = 0; index < list.length; index++) {
            if(max < list[index]) {
                max = list[index];
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
