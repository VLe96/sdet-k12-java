package homeWork.Lab_10;

import java.security.SecureRandom;

public class Dog extends Animal{

  final static int MAX_VALUE = 60;
  final static int random = new SecureRandom().nextInt(MAX_VALUE);
  public Dog() {
    super("Dog", random);
  }

  @Override
  public void setName() {

  }

  @Override
  public void setSpeed() {

  }
}
