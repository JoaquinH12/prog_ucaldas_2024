public class Medico {
    String nombre = "";
    Especialidad especialidad;
    String codigoMedico = "";

    public Medico(String nombre_param, Especialidad especialidad_param, String codigoMedico_param) {
        this.nombre = nombre_param;
        this.especialidad = especialidad_param;
        this.codigoMedico = codigoMedico_param;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }
    public Especialidad getEspecialidad() {
        return especialidad;
    }
    public String getCodigoMedico() {
        return codigoMedico;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }
    public void setCodigoMedico(String codigoMedico) {
        this.codigoMedico = codigoMedico;
    }
    
}