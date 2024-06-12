public class Camion extends Vehiculocarga{
    private int numEjes;

    // Constructor
    public Camion(String marca, String modelo, int año, int kilometraje, int capacidadCarga, int numEjes){
        super(marca, modelo, año, kilometraje, capacidadCarga);
        this.numEjes = numEjes;
    }

    // Getter y Setter para numEjes
    public int getNumEjes(){
        return numEjes;
    }

    public void setNumEjes(int numEjes){
        this.numEjes = numEjes;
    }

    // Sobrescribir el metodo mostrarInfo()
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Numero de Ejes: " + numEjes);
    }
    public void realizarMantenimiento(){
        super.realizarMantenimiento();
        if (numEjes>2) {
          System.out.println("-Realiza una aliniación en los ejes para evitar desgaste de los neumáticos, esto sera necesario para la capacidad de carga. ");
          
      } else {
          System.out.println("-Necesita mantenimiento en los ejes, la capacidad de carga no es apta para el número de ejes. ");
          
      }
      System.out.println("-Requiere mantenimiento en el sistema de dirrección. ");
      System.out.println("-Nesesita revisión del sistemas de iluminación. ");
      
      }
    
    }