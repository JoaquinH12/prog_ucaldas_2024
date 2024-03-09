
class Tareas {
    public String nombre;
    public String duracion;
    public String personaEncargada;
    public String estado;

    public Tareas(String nombre, String duracion2, String personaEncargada, String estado) {
        this.nombre = nombre;
        this.duracion = duracion2;
        this.personaEncargada = personaEncargada;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDuracion() {
        return duracion;
    }

    public String getPersonaEncargada() {
        return personaEncargada;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
    public String toString() {
        return "Tarea{ " + " nombre='" + nombre + '\'' +  ",  duracion=" + duracion +  ",  personaEncargada='" + personaEncargada + '\'' + ",  estado='" + estado +  '\''  +  '}';
    }
}