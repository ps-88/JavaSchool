package task04Streams;

import lombok.RequiredArgsConstructor;

import java.util.Arrays;

@RequiredArgsConstructor
public enum Seniority {

    JUNIOR(0, 10), MIDDLE(11, 20), SENIOR(21, Integer.MAX_VALUE);
    private final int min;
    private final int max;

    public static Seniority findBySalary(int salary) {
       return Arrays.stream(values())
                .filter(seniority -> seniority.min <= salary)
                .filter(seniority -> seniority.max >= salary)
                .findAny()
                .orElseThrow(() -> new IllegalStateException("not legal range")) ;
    }
}
