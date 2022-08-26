package tecnicasreto6pokemones;

/**
 *
 * @author Usuario
 */

public class SaludNegativaException extends Exception {
    public SaludNegativaException(){
        super("No es posible tener salud con puntaje negativo!");
    }
    
}
