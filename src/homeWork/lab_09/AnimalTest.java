package homeWork.lab_09;

import java.security.SecureRandom;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnimalTest {

  public static void main(String[] args) {
    Animal horse = new Animal("horse", new SecureRandom().nextInt(75), false);
    Animal tiger = new Animal("Tiger", new SecureRandom().nextInt(120), false);
    Animal dog = new Animal("Tiger", new SecureRandom().nextInt(60), false);
    Animal bird = new Animal("Bird", new SecureRandom().nextInt(10), true);
    Animal dfc = new Animal();

    List<Animal> animals = Arrays.asList(horse, tiger, bird);
    Animal getWinner = AnimalController.getWinner(animals);
    System.out.println(getWinner.getName());
    System.out.println(getWinner.getSpeed());
  }

}
