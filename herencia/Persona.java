public class Persona {
    protected String nombre = "";
    protected String segundoNombre = "";
    protected String documento = "";
    protected String genero = "";

    public Persona(String nombre, String segundoNombre, String documento, String genero) {
        this.nombre = nombre;
        this.segundoNombre = segundoNombre;
        this.documento = documento;
        this.genero = genero;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public String getDocumento() {
        return documento;
    }

    public String getGenero() {
        return genero;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    @Override
    public String toString() {
        return "nombre: " + nombre + ", segundoNombre: " + segundoNombre + ", documento: " + documento + ", genero: " + genero;
    }

    
}