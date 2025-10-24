
package raczkowskimartin_programacion2_div322_primerparcial;


public abstract class Pieza {
    
    private String nombre;
    private UbicacionesDelBox ubicacionDelBox;
    private CondicionClimatica mejorCondicionClimatica;

    public Pieza(String nombre, UbicacionesDelBox ubicacionDelBox, CondicionClimatica mejorCondicionClimatica) {
        this.nombre = nombre;
        this.ubicacionDelBox = ubicacionDelBox;
        this.mejorCondicionClimatica = mejorCondicionClimatica;
    }

    public String getNombre() {
        return nombre;
    }

    public UbicacionesDelBox getUbicacionDelBox() {
        return ubicacionDelBox;
    }

    public CondicionClimatica getMejorCondicionClimatica() {
        return mejorCondicionClimatica;
    }
    
    @Override
    public String toString(){
        return nombre + ", ubicacion: " + ubicacionDelBox + ", mejor condicion climatica:  " + mejorCondicionClimatica;
    }
    
    
    
    
}
