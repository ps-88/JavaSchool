package task03Streams;

import java.util.List;

public class EmployeeUtils {

    public static int sumSalaries (List<Employee> employee){
        return employee.stream().mapToInt(Employee::getSalary).sum();
    }
}
