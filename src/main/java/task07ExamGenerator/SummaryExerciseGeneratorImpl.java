package task07ExamGenerator;

public class SummaryExerciseGeneratorImpl implements ExerciseGenerator {
    private ExerciseGeneratorAssistant assistant = new StandartExerciseGeneratorAssistant(0,1000);

    @Override
    public Exercise generate() {
        Exercise exercise = assistant.generateTemp();
        exercise.setOperator(Operator.PLUS);
        exercise.setAnswer(exercise.getA() + exercise.getB());
        return exercise;
    }
}
