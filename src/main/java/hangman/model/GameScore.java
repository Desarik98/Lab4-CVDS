package hangman.model;

public interface GameScore {
    int calculateScore(int correctCount,int incorrectCount) throws HangmanException;

    int getInitialScore();
}
