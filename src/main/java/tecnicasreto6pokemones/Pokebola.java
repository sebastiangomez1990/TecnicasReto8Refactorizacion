package tecnicasreto6pokemones;

/**
 *
 * @author Usuario
 */
public class Pokebola {
    private Pokemon pokemon;
    private String tamaño;

    public Pokebola(Pokemon pokemon, String tamaño) {
        this.pokemon = pokemon;
        this.tamaño = tamaño;
    }

    public Pokebola() {
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
}

