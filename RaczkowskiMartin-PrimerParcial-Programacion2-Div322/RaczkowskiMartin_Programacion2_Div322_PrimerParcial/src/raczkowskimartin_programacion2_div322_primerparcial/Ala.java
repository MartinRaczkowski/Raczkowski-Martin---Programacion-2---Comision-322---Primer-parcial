
package raczkowskimartin_programacion2_div322_primerparcial;

public class Ala extends Pieza implements Ajustable{
    
    private double cargaAerodinamica;
    private static final double minCargaAero = 1;
    private static final double maxCargaAero = 10;

    public Ala(double cargaAerodinamica, String nombre, UbicacionesDelBox ubicacionDelBox, CondicionClimatica mejorCondicionClimatica) {
        super(nombre, ubicacionDelBox, mejorCondicionClimatica);
        validarCargaAero(cargaAerodinamica);
        this.cargaAerodinamica = cargaAerodinamica;
    }
    
    private void validarCargaAero(double carga){
        if(carga < minCargaAero || carga > maxCargaAero){
            throw new IllegalArgumentException();
        }
    }
    
    @Override
    public void ajustar(){
        System.out.println("Se ajusta el ala");
    }
    
    @Override
    public String toString(){
        return super.toString() + ", carga aerodinamica: " + cargaAerodinamica;
    }
    
}
