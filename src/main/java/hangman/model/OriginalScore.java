package hangman.model;

public class OriginalScore implements GameScore{
    private final int INITIAL_SCORE = 100;
    private int score = 100;
    /**
     * @pre inicia con 100 puntos
     * @pos puntaje minimo 0
     * @param correctCount no se bonifican las letras correctas
     * @param incorrectCount se penaliza con 10 puntos cada letra incorrecta
     * @return el puntaje final
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount) {
        for(int i = 0; i < incorrectCount; i++){
            score -= 10;
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
