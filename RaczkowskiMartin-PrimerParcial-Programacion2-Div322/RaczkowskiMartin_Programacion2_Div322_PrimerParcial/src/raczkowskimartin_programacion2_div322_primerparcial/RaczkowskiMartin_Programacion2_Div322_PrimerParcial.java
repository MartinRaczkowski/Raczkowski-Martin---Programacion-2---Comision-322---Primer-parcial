package raczkowskimartin_programacion2_div322_primerparcial;

public class RaczkowskiMartin_Programacion2_Div322_PrimerParcial {

    public static void main(String[] args) {
        
        Box ferrariBox = new Box("Box de Ferrari");
        
        Motor motor1 = new Motor(500, "PU-016", UbicacionesDelBox.MOTOR, CondicionClimatica.SECO);
        Ala ala1 = new Ala(8, "Ala 1", UbicacionesDelBox.ESTACION_AERO, CondicionClimatica.MIXTO);
        Neumatico neumatico1 = new Neumatico(Compuesto.MEDIUM, "Neumatico 1", UbicacionesDelBox.CARRO_NEUMATICOS, CondicionClimatica.SECO);
        
        
        
        ferrariBox.agregarPieza(motor1);
        //ferrariBox.agregarPieza(motor1);
        ferrariBox.agregarPieza(ala1);
        ferrariBox.agregarPieza(neumatico1);
        
        
        System.out.println(ferrariBox.mostrarPiezas());
        
        ferrariBox.ajustarPiezas();
        
        
        System.out.println(ferrariBox.buscarPiezaPorCondicionClimatica(CondicionClimatica.SECO));
        System.out.println(ferrariBox.buscarPiezaPorCondicionClimatica(CondicionClimatica.LLUVIA));
    }
    
}
