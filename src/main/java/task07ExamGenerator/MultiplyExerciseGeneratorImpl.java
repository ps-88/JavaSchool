package task07ExamGenerator;

public class MultiplyExerciseGeneratorImpl implements ExerciseGenerator {
    private ExerciseGeneratorAssistant assistant = new StandartExerciseGeneratorAssistant(0,10);

    @Override
    public Exercise generate() {
        Exercise exercise = assistant.generateTemp();
        exercise.setOperator(Operator.MULTIPLY);
        exercise.setAnswer(exercise.getA() * exercise.getB());
        return exercise;
    }
}
