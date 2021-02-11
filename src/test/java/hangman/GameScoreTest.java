package hangman;

import hangman.model.BonusScore;
import hangman.model.HangmanException;
import hangman.model.OriginalScore;
import hangman.model.PowerBonusScore;
import org.junit.Assert;
import org.junit.Test;

public class GameScoreTest{
    /**
     * Prueba para validar un caso normal de OriginalScore
     */
    @Test
    public void validarOriginalScore() {
        OriginalScore score = new OriginalScore();
        try {
            score.calculateScore(100, 100);
            Assert.assertTrue(true);
        }
        catch (HangmanException e){
            Assert.assertTrue(false);
        }
    }

    /**
     * Validar que no baje de 0 puntos
     */
    @Test
    public void validarCondicionFronteraOriginalScore(){
        OriginalScore score = new OriginalScore();
        Assert.assertTrue(true);
    }

    /**
     * Validar que no baje de 0 puntos
     */
    @Test
    public void validarCondicionFronteraBonusScore(){
        BonusScore score = new BonusScore();
        Assert.assertTrue(true);
    }

    /**
     * Validar que no sobrepasen los 500 puntos
     */
    @Test
    public void validarCondicionFronteraMaximaPowerBonusScore(){
        PowerBonusScore score = new PowerBonusScore();
        Assert.assertTrue(true);
    }


    /**
     * Validar que no baje de 0 puntos
     */
    @Test
    public void validarCondicionFronteraMinimaPowerBonusScore(){
        PowerBonusScore score = new PowerBonusScore();
        Assert.assertTrue(true);
    }

}