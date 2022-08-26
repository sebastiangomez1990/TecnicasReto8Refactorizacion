package tecnicasreto6pokemones;

/**
 *
 * @author Usuario
 */
public class Charmander extends Pokemon{

    public Charmander(String nombre) {
        this.nombre = nombre;
        this.nivel = 1;
        this.salud = 100;
    } 
    
    Charmander() {
    }

    @Override
    public Pokemon evolucionar() {
        Pokemon Charmeleon = new Charmeleon(nombre, nivel, salud);
        return Charmeleon;
    }

    @Override
    public String gritar() {
        return "Charmander!";
    }

    @Override
    public String toString() {
        return "Charmander{" + "Nombre: " + nombre + ", Nivel: " + nivel + ", Salud: " + salud + '}';
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
