package homeWork.lab_07.lab7_2;

import java.security.SecureRandom;

public class Tiger extends Animal{

  public Tiger() {
    final int MAX_SPEED = 100;
    this.setSpeed(new SecureRandom().nextInt(MAX_SPEED));
    this.setName("Tiger");
  }
}
