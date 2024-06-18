public class Paciente {
    String nombre = "";
    String cedula = "";
    String telefono = "";
    String direccion = "";

    public Paciente(String nombre_param, String cedula_param, String telefono_param, String direccion_param) {
        this.nombre = nombre_param;
        this.cedula = cedula_param;
        this.telefono = telefono_param;
        this.direccion = direccion_param;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }
    public String getCedula() {
        return cedula;
    }
    public String getTelefono() {
        return telefono;
    }
    public String getDireccion() {
        return direccion;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}
