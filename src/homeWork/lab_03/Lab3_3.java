package homeWork.lab_03;

import java.util.Scanner;

public class Lab3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Nhập số lượng phần tử trong mảng
        System.out.println("Indicate how many array molecules there are: ");
        int soLuongPhanTu = scanner.nextInt();
        int phanTu;
        int[] list = new int[soLuongPhanTu];

        //Nhập phần tử vào mảng
        for (int index = 0; index < list.length; index++) {
            System.out.printf("Enter the number at %d: ", index);
            list[index] = scanner.nextInt();
        }

        // Sắp xếp mảng
        for (int index1 = 0; index1 < list.length-1; index1++) {
            for (int index2 = index1 + 1; index2 < list.length; index2++) {
                if(list[index1] > list[index2]){
                    phanTu = list[index1];
                    list[index1] = list[index2];
                    list[index2] = phanTu;
                }
            }
        }

        for (int index = 0; index < list.length; index++) {
            System.out.printf("the number after sorting at %d: %d\n",index, list[index]);
        }

    }
}

