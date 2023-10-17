package homeWork.lab_07.lab7_1;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestEmployeeController {

  public static void main(String[] args) {
    Employee fte1 = new FTE();
    Employee fte2 = new FTE();
    Employee contractror1 = new Contractor();
    Employee contractror2 = new Contractor();
    Employee contractror3 = new Contractor();
    int totalSalary = EmployeeController.totalSalary(Arrays.asList(fte1, fte2,
        contractror1, contractror2, contractror3));
    System.out.printf("Total salary is: %d ", totalSalary);
  }
}
