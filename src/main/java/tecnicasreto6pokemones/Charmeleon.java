package tecnicasreto6pokemones;

/**
 *
 * @author Usuario
 */
public class Charmeleon extends Pokemon{

    public Charmeleon(String nombre, byte nivel, int salud) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.salud = salud;
    }    

    @Override
    public Pokemon evolucionar() {
        Pokemon Charizard = new Charizard(nombre, nivel, salud) ;
        return Charizard;
    }

    @Override
    public String gritar() {
        return "Charmeleon!";
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

