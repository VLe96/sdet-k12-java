package homeWork.lab_09;

import homeWork.lab_09.AnimalBuilder.Builder;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;

public class AnimalTest {

  public static void main(String[] args) {
    Builder builder = new Builder();
    AnimalBuilder horse = builder
        .setName("Horse")
        .setSpeed(new SecureRandom().nextInt(75))
        .setHasWing(false)
        .builder();
    AnimalBuilder tiger = builder
        .setName("Tiger")
        .setSpeed(new SecureRandom().nextInt(120))
        .setHasWing(false)
        .builder();
    AnimalBuilder dog = builder
        .setName("Tiger")
        .setSpeed(new SecureRandom().nextInt(60))
        .setHasWing(false)
        .builder();
    AnimalBuilder bird = builder
        .setName("Tiger")
        .setSpeed(new SecureRandom().nextInt(30))
        .setHasWing(true)
        .builder();
    AnimalBuilder eagle = builder
        .setName("Eagle")
        .setSpeed(new SecureRandom().nextInt(120))
        .setHasWing(true)
        .builder();
    AnimalBuilder snake = builder
        .setName("Snake")
        .setSpeed(new SecureRandom().nextInt(40))
        .setHasWing(false)
        .builder();
    List<AnimalBuilder> animalBuilders = Arrays.asList(horse,tiger,dog,eagle,snake);
    AnimalBuilder getWinner = AnimalController.getWinner(animalBuilders);
    System.out.println(getWinner.getName());
    System.out.println(getWinner.getSpeed());
  }

}
