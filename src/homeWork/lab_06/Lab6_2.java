package homeWork.lab_06;

import java.util.Scanner;

public class Lab6_2 {
  public static void main(String[] args) {
    String password = "Password123";
    for(int n = 0; n < 3; ++n) {
      System.out.println("Nhap password: ");
      Scanner scanner = new Scanner(System.in);
      String pasworduocNhapVap = scanner.nextLine();
      if (pasworduocNhapVap.equals(password)) {
        System.out.println("Ban da nhap dung");
        break;
      }
      System.out.println("Password sai!!! Xin moi nhap lai");
    }
  }
}
