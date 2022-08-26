package tecnicasreto6pokemones;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @Equipo: John Sebastian Gomez Gonzalez    c.c 1000084363
 *          Sebastian Aristizabal Castañeda  c.c 1000639678
 */

public class TecnicasReto6Pokemones {

    public static void main(String[] args) {
        
        //Acá vamos a crear una Pokebola
        Pokebola pokebolaroja = new Pokebola();
        pokebolaroja.setTamaño("Pequeño");
        System.out.println("El tamaño de esta Pokebola es: " + pokebolaroja.getTamaño());
       
        //Acá crearemos un Pokemon
        Pokemon pokemon1 = new Charmander("Quemador");
        System.out.println("El Pokemon es: " + pokemon1.gritar());
        
        //Acá se captura el Pokemon
        System.out.println("Pokemon capturado: " + pokemon1.toString() );
        
        //Evolucionaremos el pokemon1 hasta que no se pueda evolucionar más
        try {
            pokemon1 = pokemon1.evolucionar();
            System.out.println("Pokemon ha evolucionado, ahora es: " + pokemon1.gritar());
            try {
            pokemon1 = pokemon1.evolucionar();
            System.out.println("Pokemon ha evolucionado, ahora es: " + pokemon1.gritar());
                } catch (NoEvolucionaException ex) {
            System.out.println(ex.getMessage());
                  }
            try {
            pokemon1 = pokemon1.evolucionar();
            System.out.println("Pokemon ha evolucionado, ahora es: " + pokemon1.gritar());
                } catch (NoEvolucionaException ex) {
            System.out.println(ex.getMessage());
        }
        } catch (NoEvolucionaException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
}
