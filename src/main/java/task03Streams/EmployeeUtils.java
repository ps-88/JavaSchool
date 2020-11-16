package task03Streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

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

    public static Map<Seniority,List<Employee>> groupBySeniority(List<Employee> employeeList){
        return employeeList.stream().collect(
                Collectors.groupingBy(employee -> Seniority.findBySalary(employee.getSalary()))
        );
    }

    public static Map<String, Integer> mapNameToSalary(List<Employee> employees) {
        return employees.stream()
                .collect(toMap(Employee::getName, Employee::getSalary, (salary , salary2) -> salary2));
    }
}

