package tecnicasreto6pokemones;

/**
 *
 * @author Usuario
 */
//import tecnicasreto6pokemones.NoEvolucionaException;

public abstract class Pokemon {
    protected String nombre; 
    protected int salud; 
    protected byte nivel; 
            
    public abstract Pokemon puntajeSalud() throws SaludNegativaException;
    public abstract Pokemon nivelNegativo() throws NivelNegativoException;
    public abstract Pokemon evolucionar() throws NoEvolucionaException;
    public abstract String gritar();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalud(int salud) throws SaludNegativaException {
        if (salud <= 0) {
            throw new SaludNegativaException();
        } else {
            this.salud = salud;
        }
    }
    
    public int getSalud() {
    return salud;
    }

    public void setNivel(byte nivel) throws NivelNegativoException {
        if (nivel <= 0) {
            throw new NivelNegativoException();
        } else {
            this.nivel = nivel;
        }
    }
    
    public int getNivel() {
    return nivel;
    }
    
}