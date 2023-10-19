package homeWork.Lab_10;

import java.security.SecureRandom;

public class Horse extends Animal{
  final static int MAX_VALUE = 75;
  final static int random = new SecureRandom().nextInt(MAX_VALUE);
  public Horse() {
    super("Horse", random);
  }
  @Override
  public void setName() {
  }
  @Override
  public void setSpeed() {
  }
}
