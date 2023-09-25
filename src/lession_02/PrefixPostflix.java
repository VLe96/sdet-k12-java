package lession_02;

public class PrefixPostflix {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        int c = ++a + b++;

        System.out.printf("a:%d \nb:%d \nc:%d ", a,b,c);
    }
}
