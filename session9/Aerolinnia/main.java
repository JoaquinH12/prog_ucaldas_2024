import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static agencia instanciaAgencia = new agencia();
    public static void main(String[] args) {
        ArrayList <vuelos> vuelosDisponibles = instanciaAgencia.obtenerVuelos();

        Scanner leer = new Scanner(System.in);

        int opcion = 0;
        int auxiliar = 0;

        do {
            System.out.println("Página web del Aeropuerto El Dorado");
            System.out.println("Opciones: \n1. Reservar Vuelo\n2. Cancelar Vuelo\n3. Lista de vuelos disponibles\n4. Lista de reservas\n5. Salir");
            System.out.print("Digite el número de la opción que desea realizar: ");
            opcion = leer.nextInt();

            switch (opcion) {
                //Reservar vuelo
                case 1:
                    System.out.println();
                    instanciaAgencia.reservarVuelo();
                    System.out.println();
                    break;
                
                //Cancelar vuelo
                case 2:
                    System.out.println();
                    instanciaAgencia.cancelarVuelo();
                    System.out.println();
                    break;
                
                //Lista de vuelos disponibles
                case 3:
                    System.out.println();
                    for(vuelos vuelos : vuelosDisponibles) {
                        System.out.println("Numero del vuelo: " + vuelos.getNumeroVuelo() + "\nOrigen: " + vuelos.getOrigenVuelo() + "\nDestino: "+ vuelos.getDestinoVuelo() 
                        + "\nFecha y hora: " + vuelos.getFechaHora() + "\nCapacidad de pasajeros: " + vuelos.getCapacidad() + "\nAsientos disponibles: " + vuelos.getAsientosDisponibles());
                        System.out.println();
                    }
                    System.out.println();
                    break;

                //Lista de reservas
                case 4:
                    ArrayList <reservas> vuelosReservados = instanciaAgencia.obtenerReservas();
                    System.out.println();
                    if (vuelosReservados.size() > 0) {
                        for (reservas reserva : vuelosReservados) {
                            System.out.println("Usuario: " + reserva.getNombreUsuario() + "\nIdentificación: " + reserva.getIdUsuario() + "\nTelefono: " + reserva.getTelefonoUsuario()
                            + "\nVuelo: " + "Numero del vuelo: " + reserva.getVuelo().getNumeroVuelo() + "  Origen: " + reserva.getVuelo().getOrigenVuelo() + "  Destino: "+ reserva.getVuelo().getDestinoVuelo() 
                            + "  Fecha y hora: " + reserva.getVuelo().getFechaHora() + "\nAsientos reservados: " + reserva.getAsientosReservados());
                            System.out.println();
                        }
                    }
                    else {
                        System.out.println("No hay reservas existentes.");
                    }
                    System.out.println();
                    break;

                //Salir
                case 5:
                    auxiliar = 1;
                    break;
                
                //Mensaje en caso de ingresar opción no valida
                default:
                    System.out.println();
                    System.out.println("Opción no disponible.");
                    System.out.println();
                    break;
            }

        } while (auxiliar == 0);
    }
}