package homeWork.lab_03;

import java.util.Scanner;

public class Lab3_1 {
    public static void main(String[] args) {
        int phanTuMang;
        int numberEven = 0;
        int numberOdd = 0;
        Scanner scanner = new Scanner(System.in);
        // nhập số lượng phần tử mảng
        System.out.println("Indicate how many array molecules there are: ");
        int soLuongPhanTu = scanner.nextInt();
        int[] list = new int[soLuongPhanTu];
        // Nhập phần tử vào mảng
        for (int phanTu = 0; phanTu < list.length; phanTu++) {
            System.out.printf("Enter the number at %d:\n ", phanTu);
            phanTuMang = scanner.nextInt();
            list[phanTu] = phanTuMang;
        }
        // in mảng
        for (int phanTu = 0; phanTu < list.length; phanTu++) {
            System.out.printf("Array at %d is %d \n", phanTu, list[phanTu]);
        }
        // đếm số chẵn / lẻ
        for (int index = 0; index < list.length; index++) {
            if(list[index] % 2 == 0){
                numberEven++;
            }else {
                numberOdd++;
            }
        }
        // in số chẵn lẻ
        System.out.printf("Even number is: %d\n", numberEven++);
        System.out.printf("Odd number is: %d", numberOdd++);
    }
}
