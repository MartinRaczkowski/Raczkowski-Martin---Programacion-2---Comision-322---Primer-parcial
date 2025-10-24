package raczkowskimartin_programacion2_div322_primerparcial;

import java.util.ArrayList;

public class Box {
    
    private String nombre;
    private ArrayList<Pieza> piezas;

    public Box(String nombre) {
        this.nombre = nombre;
        piezas = new ArrayList<>();
    }
    
    public void agregarPieza(Pieza pieza){
        if(piezas.contains(pieza)){
            throw new IllegalArgumentException("Pieza repetida");
        }
        piezas.add(pieza);
        System.out.println("Se agrego la pieza: " + pieza);
    }
    
    public String mostrarPiezas(){
        StringBuilder lista = new StringBuilder();
        for(Pieza p : piezas){
            lista.append(p + "\n");
        }
        return lista.toString();
    }
    
    public void ajustarPiezas(){
        for(Pieza p : piezas){
            if(p instanceof Ajustable a){
                a.ajustar();
            }
            else{
                System.out.println(p.getNombre() + " no se ajustan");
            }
        }
    }
    
    public String buscarPiezaPorCondicionClimatica(CondicionClimatica condicion){
        StringBuilder lista = new StringBuilder();
        int i = 0;
        for(Pieza p : piezas){
            if(p.getMejorCondicionClimatica() == condicion){
                lista.append(p + "\n");
                i++;
            }
        }
        if(i > 0){
            return "Se encontraron las siguiente piezas con la condicion indicada:\n" + lista.toString();
        }else{
            return "No se encontraron piezas con la condicion climatica " + condicion;
        }
    }
    
    
    
}
