public class Vehiculo {

    private String marca;
    private String modelo;
    private int año;
    private int kilometraje;
    

    // Constructor
    public Vehiculo(String marca, String modelo, int año, int kilometraje){
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.kilometraje = kilometraje;
        
    }

    // Getters y Setters
    public String getMarca(){
        return marca;
    }

    public void setMarca(){
        this.marca = marca;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public int getAño(){
        return año;
    }
    
    public void setAño(int año){
        this.año = año;
    }

    public int getKilometraje(){
        return kilometraje;
    }

    public void setKilometraje(int kilometraje){
        this.kilometraje = kilometraje;
    }

    // Metodo para mostrar la informacion del vehiculo
    public void mostrarInfo(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
        System.out.println("Kilometraje: " + kilometraje);
        
     }
     // Metodo para mantemiento
     public void realizarMantenimiento(){
        //  Mantenimiento de nivel de aceite
          System.out.println("-Necesita cambiar del aceite del vehículo");

          //  Mantenimiento de kilometraje y recomendacion
          if (kilometraje>15000) {
            System.out.println("-El vehiculo a recorrido más de 15,000 km, revise el estado de las llantas y realizar alineacion y balanceo si es necesario");
            
            
          } else {
            System.out.println("-El kilometraje es de "+kilometraje+" por ahora no es necesario un servicio de manteniento");
            
          }
          System.out.println("-Es necesario una resivisón y reemplazo de filtros.");
          System.out.println("-Necesita mantenimiento en el sistema de frenos. ");
          System.out.println("-Es necesario mantenimiento en el sistema de suspensión ");
          System.out.println("-Requiere revisión y mantenimiento de la batería, verifica la carga");
     
}
     
        
}