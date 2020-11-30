package task07ExamGenerator;

import lombok.RequiredArgsConstructor;
import task06Heroes.RandomUtil;

@RequiredArgsConstructor
public class StandartExerciseGeneratorAssistant implements ExerciseGeneratorAssistant {

    private final int min;
    private final int max;

    @Override
    public Exercise generateTemp() {

        int b = RandomUtil.getIntBetween(min, max);
        int a = RandomUtil.getIntBetween(min, max);
        return Exercise.builder().a(a).b(b).build();

    }
}
