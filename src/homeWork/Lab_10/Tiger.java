package homeWork.Lab_10;

import java.security.SecureRandom;

public class Tiger extends Animal{
  final static int MAX_VALUE = 120;
  final static int random = new SecureRandom().nextInt(MAX_VALUE);
  public Tiger() {
    super("Tiger", random);
  }
  @Override
  public void setName() {
  }
  @Override
  public void setSpeed() {
  }
}
