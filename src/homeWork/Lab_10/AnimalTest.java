package homeWork.Lab_10;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class AnimalTest {
  public static void main(String[] args) {
    List<Animal> animal = Arrays.asList(new Dog(), new Horse(), new Tiger());
    Animal winner = AnimalController.getWinner(animal);
    System.out.println(winner.getName());
    System.out.println(winner.getSpeed());
  }
}
