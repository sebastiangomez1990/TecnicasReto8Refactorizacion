package tecnicasreto6pokemones;

/**
 *
 * @author Usuario
 */
public class Wartortle extends Pokemon{

    public Wartortle(String nombre, byte nivel, int salud) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.salud = salud;
    }   
    
    Wartortle() {
    }
    

    @Override
    public Pokemon evolucionar() {
        Pokemon Blastoise = new Blastoise(this.nombre, this.nivel, this.salud) ;
        return Blastoise;
    }

    @Override
    public String gritar() {
        return "Wartortle!";
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

