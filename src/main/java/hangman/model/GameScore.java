package hangman.model;

public interface GameScore {
    int calculateScore(int correctCount,int incorrectCount);

    int getInitialScore();

    int getScore();
}
