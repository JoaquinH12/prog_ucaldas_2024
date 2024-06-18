package Aerolinnia;

import java.time.LocalDate;

public class vuelos {
    private String numeroVuelo = "";
    private String origenVuelo = "";
    private String destinoVuelo = "";
    private LocalDate fechaHora;
    private String capacidad = "";
    private int asientosDisponibles = 0;

    public vuelos(String numeroVuelo, String origenVuelo, String destinoVuelo, LocalDate fechaHora, String capacidad, int asientosDisponibles) {
        this.numeroVuelo = numeroVuelo;
        this.origenVuelo = origenVuelo;
        this.destinoVuelo = destinoVuelo;
        this.fechaHora = fechaHora;
        this.capacidad = capacidad;
        this.asientosDisponibles = asientosDisponibles;
    }

    //Getters
    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public String getOrigenVuelo() {
        return origenVuelo;
    }

    public String getDestinoVuelo() {
        return destinoVuelo;
    }

    public LocalDate getFechaHora() {
        return fechaHora;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public int getAsientosDisponibles() {
        return asientosDisponibles;
    }

    //Setters
    public void setAsientosDisponibles(int asientosDisponibles) {
        this.asientosDisponibles = asientosDisponibles;
    }


}
