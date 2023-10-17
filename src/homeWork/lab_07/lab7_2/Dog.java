package homeWork.lab_07.lab7_2;

import java.security.SecureRandom;

public class Dog extends Animal{

  public Dog() {
    final int MAX_SPEED = 60;
    this.setSpeed(new SecureRandom().nextInt(MAX_SPEED));
    this.setName("Dog");
  }
}
