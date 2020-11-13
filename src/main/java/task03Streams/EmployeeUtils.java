package task03Streams;

import java.io.File;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeUtils {

    public static List<String> sortList(List<Employee> employeeList) {
        return employeeList.stream().map(Employee::getName).sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
    }

    public static int sumSalaries(List<Employee> employee) {
        return employee.stream().mapToInt(Employee::getSalary).sum();
    }

    public static void printList(List<String> employeeList) {

        Optional<String> optional = employeeList.stream().reduce((s, s2) -> s + "," + s2);
        System.out.println(optional.get());

    }


}

