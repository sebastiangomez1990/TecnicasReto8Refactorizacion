package tecnicasreto6pokemones;

/**
 *
 * @author Usuario
 */
public class NoEvolucionaException extends Exception {
    public NoEvolucionaException(){
        super("Este pokemon no puede evolucionar más!");
    }
    
}
