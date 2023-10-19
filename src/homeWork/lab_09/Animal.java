package homeWork.lab_09;

public class Animal {
  private String name;
  private int speed;
  private boolean hasWing;

  public Animal() {
  }

  public Animal(String name, int speed, boolean hasWing) {
    this.name = name;
    this.speed = speed;
    this.hasWing = hasWing;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public boolean isHasWing() {
    return hasWing;
  }

  public void setHasWing(boolean hasWing) {
    this.hasWing = hasWing;
  }
}
