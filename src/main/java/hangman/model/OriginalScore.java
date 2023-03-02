package hangman.model;

public class OriginalScore implements GameScore {
    
    /** Calcula el puntaje de acuerdo a las letras incorrectas.
     * 
     * @pre Se inicia con 100 puntos.
     * @post El minimo puntaje es 0.
     * @param correctCount Cantidad de letras correctas.
     * @param incorrectCount Cantidad de letras incorrectas.
     * @return Puntaje con penalizacion de 10 puntos por cada letra incorrecta.
     */
    public int calculateScore(int correctCount, int incorrectCount) {
        return 0;
    }

}
