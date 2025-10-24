
package raczkowskimartin_programacion2_div322_primerparcial;


public class Neumatico extends Pieza {
    
    private final Compuesto compuesto;

    public Neumatico(Compuesto compuesto, String nombre, UbicacionesDelBox ubicacionDelBox, CondicionClimatica mejorCondicionClimatica) {
        super(nombre, ubicacionDelBox, mejorCondicionClimatica);
        this.compuesto = compuesto;
    }
    
    @Override
    public String toString(){
        return super.toString() + ", compuesto: " + compuesto;
    }
    
}
