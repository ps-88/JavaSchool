package task03Streams;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class EmployeeUtilsTest {

    @Test
    public void sumSalaries() {

        List<Employee> employees = List.of(new Employee(30, "Pasha"), new Employee(10, "Sam"));

        List<Employee> employees2 = List.of(
                Employee.builder().name("Tom").salary(20).build(),
                Employee.builder().name("Yoni").salary(20).build(),
                Employee.builder().name("Ford").salary(10).build()
        );


        int sumSalaries = EmployeeUtils.sumSalaries(employees);
        Assert.assertEquals(40,sumSalaries);

        int sumSalaries2 = EmployeeUtils.sumSalaries(employees2);
        Assert.assertEquals(50,sumSalaries2);

    }
}