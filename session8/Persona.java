public class Persona {
    protected String nombre = "";
    protected String numero_telefono = "";
    protected String correo_electronico = "";

    public Persona(String nombre, String numero_telefono, String correo_electronico) {
        this.nombre = nombre;
        this.numero_telefono = numero_telefono;
        this.correo_electronico = correo_electronico;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getNumero_telefono() {
        return numero_telefono;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    //Setters
    public void setName(String nombre) {
        this.nombre = nombre;
    }

    public void setNumero_telefono(String numero_telefono) {
        this.numero_telefono = numero_telefono;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    @Override
    public String toString() {
        return "Nombre=" + nombre + ", numero_telefono=" + numero_telefono + ", correo_electronico=" + correo_electronico;
    }


    
}