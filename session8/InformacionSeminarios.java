public class InformacionSeminarios {
    private String nombre_seminario = "";
    private int cantidad_horas = 0;
    private Profesor informacion_profesor;

    public InformacionSeminarios(String nombre_seminario, int cantidad_horas, Profesor informacion_profesor) {
        this.nombre_seminario = nombre_seminario;
        this.cantidad_horas = cantidad_horas;
        this.informacion_profesor = informacion_profesor;
    }
    
    //Getters
    public String getNombre_seminario() {
        return nombre_seminario;
    }

    public int getCantidad_horas() {
        return cantidad_horas;
    }

    public Profesor getInformacion_profesor() {
        return informacion_profesor;
    }

    //Setters
    public void setNombre_seminario(String nombre_seminario) {
        this.nombre_seminario = nombre_seminario;
    }

    public void setCantidad_horas(int cantidad_horas) {
        this.cantidad_horas = cantidad_horas;
    }

    public void setInformacion_profesor(Profesor informacion_profesor) {
        this.informacion_profesor = informacion_profesor;
    }

    @Override
    public String toString() {
        return "\nnombre_seminario: " + nombre_seminario + "\ncantidad_horas: " + cantidad_horas + "\ninformacion_profesor: " + informacion_profesor;
    }

    
    

}