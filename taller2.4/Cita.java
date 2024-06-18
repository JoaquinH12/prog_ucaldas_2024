import java.time.LocalDate;

public class Cita {
    Paciente paciente;
    Medico medico;
    LocalDate fechaCita;
    String horaCita = "";
    String estado = "";

    public Cita(Paciente paciente_param, Medico medico_param, LocalDate fechaCita_param, String horaCita_param, String estado_param) {
        this.paciente = paciente_param;
        this.medico = medico_param;
        this.fechaCita = fechaCita_param;
        this.horaCita = horaCita_param;
        this.estado = estado_param;
    }

    //Getters
    public Paciente getPaciente() {
        return paciente;
    }
    public Medico getMedico() {
        return medico;
    }
    public LocalDate getFechaCita() {
        return fechaCita;
    }
    public String getHoraCita() {
        return horaCita;
    }
    public String getEstado() {
        return estado;
    }

    //Setters
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    public void setFechaCita(LocalDate fechaCita) {
        this.fechaCita = fechaCita;
    }
    public void setHoraCita(String horaCita) {
        this.horaCita = horaCita;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

}