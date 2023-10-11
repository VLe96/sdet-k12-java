package homeWork.lab_06;
public class Lab6_1 {
  public static void main(String[] args) {
    String lines = "2hrs and 15 minutes";
    linesToTime(lines);
  }
  public static void linesToTime(String lines) {
    int hrs = lines.indexOf("hrs");
    int inFrontOfMin = lines.indexOf("d");
    int atLastMin = lines.indexOf(" minutes");
    String minutesText = lines.substring(inFrontOfMin + 2, atLastMin);
    String hrsText = lines.substring(0, hrs);
    int total = Integer.valueOf(hrsText)*60 + Integer.valueOf(minutesText);
    System.out.println(total);

  }

}