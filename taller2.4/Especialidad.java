public class Especialidad {
    String nombre = "";
    String descripcion = "";

    public Especialidad(String nombre_param, String descripcion_param) {
        this.nombre = nombre_param;
        this.descripcion = descripcion_param;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }
    public String getDescripcion() {
        return descripcion;
    } 

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void seDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}