package task07ExamGenerator;

import task06Heroes.RandomUtil;

public class MinusExerciseGenerator implements ExerciseGenerator {
    @Override
    public Exercise generate() {

        int a = RandomUtil.getIntBetween(0, 100);
        int b = RandomUtil.getIntBetween(0, a);
        return Exercise.builder().a(a).b(b).operator(Operator.MINUS).answer(a - b).build();
    }
}
