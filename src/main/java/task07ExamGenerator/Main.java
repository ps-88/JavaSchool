package task07ExamGenerator;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Examinator examinator = new Examinator(List.of(new SummaryExerciseGeneratorImpl(),
                new MultiplyExerciseGeneratorImpl(), new MinusExerciseGenerator()));


        List<Exercise> exerciseList = examinator.generate(10);
        exerciseList.forEach(System.out::println);
    }
}
