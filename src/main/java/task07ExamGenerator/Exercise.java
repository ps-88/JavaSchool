package task07ExamGenerator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Exercise {

    private double a;
    private double b;
    private double answer;
    private Operator operator;

    @Override
    public String toString() {
        return a + " " + operator +" " + b + " = " + answer ;
    }
}
