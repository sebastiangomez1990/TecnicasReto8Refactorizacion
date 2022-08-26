package tecnicasreto6pokemones;

/**
 *
 * @author Usuario
 */
//import tecnicasreto6pokemones.NoEvolucionaException;

public class Blastoise extends Pokemon{

    public Blastoise(String nombre, byte nivel, int salud) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.salud = salud;
    }    

    @Override
    public Pokemon evolucionar() throws NoEvolucionaException {
        throw new NoEvolucionaException();
    }

    @Override
    public String gritar() {
        return "Blastoise!";
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
