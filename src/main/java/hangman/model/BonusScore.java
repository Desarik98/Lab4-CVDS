package hangman.model;

public class BonusScore implements GameScore {
    /**
     * @pre El juego inicia en 0 puntos
     * @param correctCount se bonifica con 10 puntos cada letra correcta
     * @param incorrectCount se penaliza con 5 puntos cada letra incorrecta
     * @return puntaje final
     * @pos el puntaje minimo es 0
     * @throws HangmanException no se sabe
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount) throws HangmanException {
        return 0;
    }
}
