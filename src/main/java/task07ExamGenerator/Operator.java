package task07ExamGenerator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Operator {
    MINUS("-"), PLUS("+"), MULTIPLY("*"), DIVIDE("/");

    private final String sign;

    @Override
    public String toString() {
        return sign;
    }
}
