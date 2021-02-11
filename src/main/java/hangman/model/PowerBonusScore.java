package hangman.model;

public class PowerBonusScore implements GameScore{
    /**
     * @pre inicia con 0 puntos
     * @param correctCount la i-esima letra correcta se bonifica con 5^i
     * @param incorrectCount se penaliza con 8 puntos cada letra incorrecta
     * @return el puntaje final
     * @pos el puntaje minimo es 0, final es 500 puntos
     * @throws HangmanException no se sabe
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount) throws HangmanException {
        return 0;
    }
}
