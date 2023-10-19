package homeWork.lab_10;

public abstract class Animal {
  protected String name;
  protected int speed;

  protected Animal() {
  }

  protected Animal(String name, int speed) {
    this.name = name;
    this.speed = speed;
  }
  public abstract void setName();
  protected String getName() {
    return name;
  }
  public abstract void setSpeed();
  protected int getSpeed() {
    return speed;
  }
}
