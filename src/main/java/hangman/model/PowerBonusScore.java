package hangman.model;
import java.math.*;

public class PowerBonusScore implements GameScore{
    private final int INITIAL_SCORE = 0;
    /**
     * @pre inicia con 0 puntos
     * @param correctCount la i-esima letra correcta se bonifica con 5^i
     * @param incorrectCount se penaliza con 8 puntos cada letra incorrecta
     * @return el puntaje final
     * @pos el puntaje minimo es 0, final es 500 puntos
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount) {
        int score = 0;
        if (correctCount != 0){ score = (int)Math.pow(5,correctCount);}
        if(score > 500){ score = 500; }
        for(int i = 0; i < incorrectCount; i++){
            score -= 8;
            if(score < 0){ score = 0; }
        }
        return score;
    }

    @Override
    public int getInitialScore() {
        return INITIAL_SCORE;
    }



}
