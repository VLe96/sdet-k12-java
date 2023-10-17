package homeWork.lab_07.lab7_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestRacingController {
  public static void main(String[] args) {
    List<Animal> animals = Arrays.asList(new Horse(), new Tiger(), new Dog());
    Animal getWinner = RacingController.getWinner(animals);
    System.out.println("The winner is: " + getWinner.getName());
    System.out.println("The winner has: " + getWinner.getSpeed());
  }
}
