package hangman.model;

public class OriginalScore implements GameScore{
    /**
     * @pre inicia con 100 puntos
     * @pos puntaje minimo 0
     * @param correctCount no se bonifican las letras correctas
     * @param incorrectCount se penaliza con 10 puntos cada letra incorrecta
     * @return el puntaje final
     * @throws HangmanException arroja una excepcion si los parametros son incorrectos
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount) throws HangmanException {
        return 0;
    }
}
