package tecnicasreto6pokemones;

/**
 *
 * @author Usuario
 */
import tecnicasreto6pokemones.NoEvolucionaException;

public class Raichu extends Pokemon{

    public Raichu(String nombre, byte nivel, int salud) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.salud = salud;
    }  
    
    public Raichu() {
    }    

    @Override
    public Pokemon evolucionar() throws NoEvolucionaException {
        throw new NoEvolucionaException();
    }

    @Override
    public String gritar() {
        return "Raichu!";
    }

    @Override
    public Pokemon puntajeSalud() throws SaludNegativaException {
        throw new SaludNegativaException();
    }

    @Override
    public Pokemon nivelNegativo() throws NivelNegativoException {
        throw new NivelNegativoException();
    }
    
}
