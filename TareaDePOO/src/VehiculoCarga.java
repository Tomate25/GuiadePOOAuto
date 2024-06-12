public class Vehiculocarga extends Vehiculo {
    private int capacidadCarga;
    
    // Constructor
    public Vehiculocarga(String marca, String modelo, int año, int kilometraje, int capacidadCarga){
        super(marca, modelo, año, kilometraje );
        this.capacidadCarga = capacidadCarga;
    }
    
    // Getter y Setter para capacidadCarga
    public int getCapacidadCarga(){
        return capacidadCarga;
    }
    
    public void setCapacidadCarga(int capacidadCarga){
        this.capacidadCarga = capacidadCarga;
    }
    
    // Sobrecribir el metodo mostrarInfo()
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Capacidad de Carga: " + capacidadCarga + " kg");
    }
    
    
    
    }