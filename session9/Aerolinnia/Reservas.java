package Aerolinnia;

public class reservas {
    String nombreUsuario = "";
    String idUsuario = "";
    String telefonoUsuario = "";
    vuelos vuelo;
    int asientosReservados = 0;

    
    public reservas (String nombreUsuario,String idUsuario, String telefonoUsuario, vuelos vuelosReservados, int asientosReservados) {
        this.nombreUsuario = nombreUsuario;
        this.idUsuario = idUsuario;
        this.telefonoUsuario = telefonoUsuario;
        this.vuelo = vuelosReservados;
        this.asientosReservados = asientosReservados;
    }

    //Getters
    public String getNombreUsuario() {
        return nombreUsuario;
    }


    public String getIdUsuario() {
        return idUsuario;
    }


    public String getTelefonoUsuario() {
        return telefonoUsuario;
    }


    public vuelos getVuelo() {
        return vuelo;
    }


    public int getAsientosReservados() {
        return asientosReservados;
    }
    


    
    
}
}
