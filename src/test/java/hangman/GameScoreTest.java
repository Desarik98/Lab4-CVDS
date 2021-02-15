package hangman;

import hangman.model.BonusScore;
import hangman.model.OriginalScore;
import hangman.model.PowerBonusScore;
import org.junit.Assert;
import org.junit.Test;

/**
 * OriginalScore puntaje minimo 0, inicial 100, letras correctas sin bonificacion, penalizacion 10 puntos por letra incorrecta
 * BonusScore puntaje minimo 0, inicial 0, letras correctas 10 puntos de bonificacion, penalizacion 5 puntos por letra incorrecta
 * PowerBonusScore puntaje minimo 0, inicial 0, maximo 500, letras correctas con 5^i puntos de bonificacion, penalizacion 8 puntos por letra incorrecta
 */

public class GameScoreTest{
    OriginalScore originalScore = new OriginalScore();
    BonusScore bonusScore = new BonusScore();
    PowerBonusScore powerScore = new PowerBonusScore();
    /**
     * Prueba para validar un caso normal de OriginalScore
     */
    @Test
    public void validarOriginalScore() {
        Assert.assertEquals(70, originalScore.calculateScore(5,3));
    }

    /**
     * Validar que no baje de 0 puntos OriginalScore
     */
    @Test
    public void validarCondicionFronteraOriginalScore(){
        originalScore.calculateScore(5,11);
    }

    /**
     * Validar que el puntaje inicial sean 100 puntos OriginalScore
     */
    @Test
    public void validarCondicionFronteraInicialOriginalScore(){
        Assert.assertEquals(100,originalScore.getInitialScore());
    }

    /**
     * Validar que las letras correctas no den bonificacion OriginalScore
     */
    @Test
    public void validarSinBonificacionOriginalScore(){
        Assert.assertEquals(100, originalScore.calculateScore(5,0));
    }
    /**
     * Validar penalizacion de 10 puntos por letra incorrecta
     */
    @Test
    public void validarPenalizacionOriginalScore(){
        Assert.assertEquals(80, originalScore.calculateScore(0,2));
    }

    /**
     * Validar BonusScore
     */
    @Test
    public void validarBonusScore(){
        Assert.assertEquals(35,bonusScore.calculateScore(5,3));
    }

    /**
     * Validar que no baje de 0 puntos BonusScore
     */
    @Test
    public void validarCondicionFronteraBonusScore(){
        originalScore.calculateScore(0,1);

    }

    /**
     * Validar puntaje inicial 0 puntos BonusScore
     */

    @Test
    public void validarPuntajeInicialBonusScore(){
        Assert.assertEquals(0,bonusScore.getInitialScore());
    }



    /**
     * Validar bonificacion de 10 puntos por letra correcta BonusScore
     */
    @Test
    public void validarBonifiacionBonusScore(){
        Assert.assertEquals(10,bonusScore.calculateScore(1,0));
    }

    /**
     * Validar penalizacion de 5 puntos por letra incorrecta BonusScore
     */
    @Test
    public void validarPenalizacionBonusScore(){
        Assert.assertEquals(0,bonusScore.calculateScore(1,2));
    }

    /**
     * Validar que no sobrepasen los 500 puntos PowerBonusScore
     */
    @Test
    public void validarCondicionFronteraMaximaPowerBonusScore(){
        Assert.assertEquals(500,powerScore.calculateScore(4,0));
    }


    /**
     * Validar que no baje de 0 puntos PowerBonusScore
     */
    @Test
    public void validarCondicionFronteraMinimaPowerBonusScore(){
        Assert.assertEquals(0,powerScore.calculateScore(0,1));

    }

    /**
     * Validar puntaje inicial 0 puntos PowerBonusScore
     */

    @Test
    public void validarPuntajeInicialPowerBonusScore(){
        Assert.assertEquals(0,powerScore.getInitialScore());
    }

    /**
     * Validar bonificacion correcta 5^i PowerBonusScore
     */
    @Test
    public void validarBonificacionPowerBonusScore(){
        Assert.assertEquals(25,powerScore.calculateScore(2,0));
    }

    /**
     * Validar penalizacion 8 puntos PowerBonusScore
     */
    @Test
    public void validarPenalizacionPowerBonusScore(){
        Assert.assertEquals(17,powerScore.calculateScore(2,1));
    }




}