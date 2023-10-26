package homeWork.lab_07.lab7_1;

public class Employee {
  private int salary;
  private int bonus;
  public Employee() {
  }
  public Employee(int salary, int bonus) {
    this.salary = salary;
    this.bonus = bonus;
  }
  public int getSalary() {
    return salary;
  }
  public int getBonus() {
    return bonus;
  }
}
