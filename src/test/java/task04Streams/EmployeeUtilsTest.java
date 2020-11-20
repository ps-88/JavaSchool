package task04Streams;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class EmployeeUtilsTest {
    private  List<Employee> employees2 = List.of(
            Employee.builder().name("Tom").salary(20).build(),
            Employee.builder().name("Yoni").salary(20).build(),
            Employee.builder().name("Tom").salary(10).build()    );


    @Test
    public void sumSalaries() {

        List<Employee> employees = List.of(new Employee(30, "Pasha"), new Employee(10, "Sam"));





        int sumSalaries = EmployeeUtils.sumSalaries(employees);
        Assert.assertEquals(40,sumSalaries);

        int sumSalaries2 = EmployeeUtils.sumSalaries(employees2);
        Assert.assertEquals(50,sumSalaries2);

    }

    @Test
    public void mapNameToSalary() {

        Map<String, Integer> map = EmployeeUtils.mapNameToSalary(employees2);
        System.out.println(map);
    }
}