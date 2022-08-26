package tecnicasreto6pokemones;

/**
 *
 * @author Usuario
 */
public class NivelNegativoException extends Exception{
    
    public NivelNegativoException () {
        super("No es posible tener un nivel de batalla negativo!");
    }
    
}
