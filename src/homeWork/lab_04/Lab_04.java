package homeWork.lab_04;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Lab_04 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int soLuongPhanTu;
    do {
      System.out.println("Indicate how many array molecules there are (> 0): ");
      soLuongPhanTu = scanner.nextInt();
    } while (soLuongPhanTu <= 0);

    Integer[] list = new Integer[soLuongPhanTu];

    nhapPhantu(list);
    printMenu();

    int numberChoose = scanner.nextInt();

    chooseOption(numberChoose, list);
  }

  public static void nhapPhantu(Integer[] list) {
    Scanner scanner = new Scanner(System.in);
    for (int phanTu = 0; phanTu < list.length; phanTu++) {
      list[phanTu] = randomNumber();
    }
  }

  public static void printMenu() {
    System.out.println("=====MENU======\n"
        + "1. Print all numbers\n"
        +"2. Print maximum value\n"
        + "3. Print minimum value\n"
        + "4. Search number");
    System.out.println("The option which you want to choose: ");
  }

  public static int randomNumber() {
    return new SecureRandom().nextInt(Integer.max(0, 1000));
  }

  //1. Print all numbersl
  public static void printAllNumber(Integer[] list) {
    List<Integer> listArray = Arrays.asList(list);
    System.out.println(listArray);
  }

  // 2. Print maximum value
  public static void printMaximumValue(Integer[] list) {
    int max = list[0];
    for (int integer : list) {
      if (max < integer) {
        max = integer;
      }
    }
    System.out.println("The maximum number is: " + max);
  }

  // 3. Print minimum value
  public static void printMinimum(Integer[] list) {
    int min = list[0];
    for (int integer : list) {
      if (min > integer) {
        min = integer;
      }
    }
    System.out.println("The minimum number is: " + min);
  }

  // 4. Search numbe
  public static void searchNumber(Integer[] list) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("The number which you want to find: ");
    int number = scanner.nextInt();
    boolean numberNotSame = true;
    for (int index = 0; index < list.length; index++) {
      if (number == list[index]) {
        numberNotSame = false;
        System.out.printf("This number %d is in Array at position %d \n", number, index + 1);
        break;
      }
    }
    if (numberNotSame) {
      System.out.println("The number is not in array!!!");
    }
  }

  //Choose option
  public static void chooseOption(int numberChoose, Integer[] list) {
    do {
      switch (numberChoose) {
        case 1:
          printAllNumber(list);
          break;
        case 2:
          printMaximumValue(list);
          break;
        case 3:
          printMinimum(list);
          break;
        case 4:
          searchNumber(list);
          break;
      }
    } while (1 < numberChoose && numberChoose > 5);
    System.out.println("End Program!!!");
  }

}
