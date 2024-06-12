public class App {
    public static void main(String[] args) throws Exception {
        
        // Crear instancias de cada tipo de vehiculo
        Auto auto = new Auto("Toyota", "Corolla", 2020, 15000, 5, "gasolina");

        Camion camion = new Camion("Volvo", "FH", 2019, 75000, 20000, 4);

        // Mostrar la informacion de cada vehiculo
        
        System.out.println("Informacion del Auto:");
        auto.mostrarInfo();
        
        

        System.out.println("======================================");

        System.out.println("Informacion del Camion");
        camion.mostrarInfo();
        System.out.println("=========================================");
       System.out.println("");
    
        
    //   Ejecución de metodo de mantenimiento
        
       System.out.println(" Mantenimiento de auto: ");
        auto.realizarMantenimiento();
        double costoMantenimiento= auto.calcularCostoMantenimiento(0.5, 15000);
        
       System.out.println("El costo de mantenimiento del auto es de $ "+costoMantenimiento);

        System.out.println("===========================================");
        System.out.println("");
        System.out.println("Mantenimiento de camión:");
       
        camion.realizarMantenimiento();
        
    }

        
    }