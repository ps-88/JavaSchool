package task01GuessGame;

public class BestScore {

    private int score;

    @Override
    public String toString() {
        return "BestScore{" +
                "score=" + score +
                '}';
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
}
