package homeWork.lab_06;

import java.util.Scanner;

public class Lab6_3 {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhap day ki tu bạn muon tach: ");
    String array1 = scanner.nextLine();
    for(int temp1 = 0; temp1 < array1.length(); ++temp1) {
      char tam2 = array1.charAt(temp1);
      if (tam2 > '/' && tam2 < ':') {
        sb.append(tam2);
      }
    }
    System.out.println(sb);
  }
}
