package task07ExamGenerator;

import lombok.RequiredArgsConstructor;
import task06Heroes.RandomUtil;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class Examinator {

    private final List<ExerciseGenerator> exerciseGenerators;


    public List<Exercise> generate(int amount) {
        List<Exercise> exerciseList = new ArrayList<>();

        for (int i = 0; i < amount; i++) {
            exerciseList.add(RandomUtil.randomItem(exerciseGenerators).generate());

        }

        return exerciseList;
    }
}
