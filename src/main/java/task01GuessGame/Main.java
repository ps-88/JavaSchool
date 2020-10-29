package task01GuessGame;

public class Main {
    public static void main(String[] args) {

        int max = 1000;

        GuessGame newGame = new GuessGame();

        newGame.play(max);
        newGame.printBestScore();

    }
}
