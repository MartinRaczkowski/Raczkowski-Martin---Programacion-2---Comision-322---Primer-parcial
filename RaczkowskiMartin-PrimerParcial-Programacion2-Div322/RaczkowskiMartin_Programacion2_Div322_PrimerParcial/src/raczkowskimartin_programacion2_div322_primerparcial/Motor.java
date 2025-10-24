
package raczkowskimartin_programacion2_div322_primerparcial;


public class Motor extends Pieza implements Ajustable {
    
    private int potenciaMaxima;
    private static final String unidadPotencia = "CV";

    public Motor(int potenciaMaxima, String nombre, UbicacionesDelBox ubicacionDelBox, CondicionClimatica mejorCondicionClimatica) {
        super(nombre, ubicacionDelBox, mejorCondicionClimatica);
        this.potenciaMaxima = potenciaMaxima;
    }
    
    @Override
    public void ajustar(){
        System.out.println("Se ajusta el motor");
    }
    
    @Override
    public String toString(){
        return super.toString() + ", potencia maxima: " + potenciaMaxima + unidadPotencia;
    }
}
