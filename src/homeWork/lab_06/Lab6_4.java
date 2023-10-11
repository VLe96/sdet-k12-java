package homeWork.lab_06;

import java.util.Scanner;
public class Lab6_4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the URL that you want to check: ");
    String url = scanner.nextLine();
    checkScheme(url);
    checkTopLevelDomain(url);
    getDomain(url);
  }
  public static void checkScheme(String url) {
    if (url.startsWith("https")) {
      System.out.println("Start with https://");
    }
    else
      System.out.println("Start with http://");
  }
  public static void checkTopLevelDomain(String url) {
    if (url.endsWith(".com"))
      System.out.println("the top level domain is .com");
    else
      System.out.println("the top level domain is .net");
  }
  public static void getDomain(String url) {
    if (url.startsWith("https://"))
      url = url.replaceAll("https://", "");
    else if (url.startsWith("http://"))
      url = url.replaceAll("http://", "");
    System.out.println("Domain name of URL is " + url);
  }


}
