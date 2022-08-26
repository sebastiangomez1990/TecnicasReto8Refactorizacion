package tecnicasreto6pokemones;

/**
 *
 * @author Usuario
 */
public class Pikachu extends Pokemon{

    public Pikachu(String nombre, byte nivel, int salud) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.salud = salud;
    }
    
    Pikachu() {
    }
    
    

    @Override
    public Pokemon evolucionar() {
        Pokemon Raichu = new Raichu(this.nombre, this.nivel, this.salud) ;
        return Raichu;
    }

    @Override
    public String gritar() {
        return "Pikachu!";
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

