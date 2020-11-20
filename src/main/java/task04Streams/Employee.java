package task04Streams;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Employee {

    private int salary;
    private String name;
}
