package homeWork.lab_03;

import java.util.Scanner;

public class Lab3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Nhập số lượng phàn tử mảng
        System.out.println("Indicate how many array molecules there are: ");
        int soLuongPhanTu = scanner.nextInt();
        int[] list = new int[soLuongPhanTu];
        //nhập phần tử vào mảng
        for (int phanTu = 0; phanTu < list.length; phanTu++) {
            System.out.printf("Enter the number: ");
            list[phanTu] = scanner.nextInt();
        }
        // in mảng
        for (int phanTu = 0; phanTu < list.length; phanTu++) {
            System.out.printf("Array at %d is %3d \n", phanTu, list[phanTu]);
        }
        // tìm số nhỏ nhất
        int min = list[0]; // để min là phần tử đầu tiên của mảng
        for (int index = 0; index < list.length; index++) {
            if(min > list[index]) {
                min = list[index];
            }
        }

        int max = list[0]; // để max là phần tử đầu tiên của mảng
        for (int index = 0; index < list.length; index++) {
            if(max < list[index]) {
                max = list[index];
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
