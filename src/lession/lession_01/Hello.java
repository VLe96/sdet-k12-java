package lession.lession_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
//        List<Integer> vi = new ArrayList<>();
//        Scanner scanner = new Scanner(System.in);
//        for (int index = 0; index < 3; index++) {
//            System.out.println("Phan tu: ");
//            vi.add(scanner.nextInt());
//        }
//        int min =vi.get(1);
//        System.out.println(min);

        int [] myArray = {2,1,2,3,5};
        boolean isNoEvenNumber = true;
        for (int i : myArray) {
            if(i % 2 ==0){
                isNoEvenNumber = false;
                System.out.println(i);
                break;
            }
        }
        if (isNoEvenNumber)
            System.out.println("nope");
    }
}