package hangman.model;

public class BonusScore implements GameScore {
    private final int INITIAL_SCORE = 0;
    private int score = 0;
    /**
     * @pre El juego inicia en 0 puntos
     * @param correctCount se bonifica con 10 puntos cada letra correcta
     * @param incorrectCount se penaliza con 5 puntos cada letra incorrecta
     * @return puntaje final
     * @pos el puntaje minimo es 0
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount){
        for(int i = 0; i < correctCount; i++){
            score += 10;
        }
        for(int i = 0; i < incorrectCount; i++){
            score -= 5;
            if(score < 0){
                score = 0;
            }
        }
        return score;
    }

    @Override
    public int getInitialScore() {
        return INITIAL_SCORE;
    }

    @Override
    public int getScore() {
        return score;
    }
}
