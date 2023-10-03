package homeWork.lab_03;

import java.util.Scanner;

public class Lab3_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Nhập số lượng phần tử trong mảng
        System.out.println("Indicate how many array molecules there are: ");
        int soLuongPhanTuMang1 = scanner.nextInt();
        int soLuongPhanTuMang2 = scanner.nextInt();
        int[] list1 = new int[soLuongPhanTuMang1];
        int[] list2 = new int[soLuongPhanTuMang2];
        int[] listAll = new int[soLuongPhanTuMang1+soLuongPhanTuMang2];

        // Nhập phần tử cho mảng 1
        for (int index = 0; index < list1.length; index++) {
            System.out.printf("Enter the number at %d: ", index);
            list1[index] = scanner.nextInt();
        }
        // Nhập phần tử cho mảng 2
        for (int index = 0; index < list2.length; index++) {
            System.out.printf("Enter the number at %d: ", index);
            list2[index] = scanner.nextInt();
        }
        //Gom 2 mảng lại



    }
}
