package tecnicasreto6pokemones;

/**
 *
 * @author Usuario
 */
public class Squirtle extends Pokemon{

    public Squirtle(String nombre, byte nivel, int salud) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.salud = salud;
    }
    
    @Override
    public Pokemon evolucionar() {
        Pokemon Wartortle = new Wartortle(this.nombre, this.nivel, this.salud) ;
        return Wartortle;
    }

    @Override
    public String gritar() {
        return "Squirtle!";
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
