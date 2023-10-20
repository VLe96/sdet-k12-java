package homeWork.lab_09;

public class AnimalBuilder {
  private String name;
  private int speed;
  private boolean hasWing;

  protected AnimalBuilder(Builder builder){
    this.name = builder.name;
    this.speed = builder.speed;
    this.hasWing = builder.hasWing;
  }

  public String getName() {
    return name;
  }

  public int getSpeed() {
    return speed;
  }

  public boolean isHasWing() {
    return hasWing;
  }

  public static class Builder{
    private String name;
    private int speed;
    private boolean hasWing;

    public Builder setName(String name) {
      this.name = name;
      return this;
    }

    public Builder setSpeed(int speed) {
      this.speed = speed;
      return this;
    }

    public Builder setHasWing(boolean hasWing) {
      this.hasWing = hasWing;
      return this;
    }

    public AnimalBuilder builder(){
      return new AnimalBuilder(this);
    }
  }
}
