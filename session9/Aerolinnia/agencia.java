package Aerolinnia;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class agencia implements gestorVuelos {
    ArrayList <vuelos> vuelosDisponibles = new ArrayList<>();
    ArrayList <reservas> vuelosReservados = new ArrayList<>();
    Scanner leer = new Scanner(System.in);
    Scanner leer2 = new Scanner(System.in);

    public agencia () {
        vuelosDisponibles.add(new vuelos("1", "Bogota-Colombia", "Paris-Francia", LocalDate.now(), "35", 35));
        vuelosDisponibles.add(new vuelos("2", "Bogota-Colombia", "Barcelona-España", LocalDate.now().plusDays(7), "40", 40));
        vuelosDisponibles.add(new vuelos("3", "Bogota-Colombia", "Buenos Aires-Argentina", LocalDate.now().plusDays(10), "50", 50));
        vuelosDisponibles.add(new vuelos("4", "Bogota-Colombia", "California-EEUU", LocalDate.now().plusDays(15), "80", 80));
        vuelosDisponibles.add(new vuelos("5", "Bogota-Colombia", "Tokio-Japón", LocalDate.now().plusDays(30), "66", 66));

    }

    //Reservar Vuelo
    @Override
    public void reservarVuelo() {
        int auxiliar = 0;
        int auxiliar2 = 0;

        System.out.print("Digite el nombre del Usuario: ");
        String nombreUsuario = leer.nextLine();

        System.out.print("Digite el documento de identidad del usuario: ");
        String idUsuario = leer.nextLine();

        System.out.print("Digite el número de telefono del usuario: ");
        String telefonoUsuario = leer.nextLine();

        System.out.print("Digite el número del vuelo que desea reservar: ");
        String numeroVuelo = leer.nextLine();

        for(int i = 0; i < vuelosDisponibles.size(); i++) {
            if(numeroVuelo.equals(vuelosDisponibles.get(i).getNumeroVuelo())) {
                System.out.print("Digite la cantidad de asientos a reservar: ");
                int asientosReservados = leer2.nextInt();
                vuelosReservados.add(new reservas(nombreUsuario, idUsuario, telefonoUsuario, vuelosDisponibles.get(i), asientosReservados));
                auxiliar2 = (vuelosDisponibles.get(i).getAsientosDisponibles()) - asientosReservados;
                vuelosDisponibles.get(i).setAsientosDisponibles(auxiliar2);
                auxiliar = 1;
                break;
            }
        }

        if(auxiliar == 1) {
            System.out.println("Reserva realizada con exito.");
        }
        else {
            System.out.println("Error al hacer la reserva.");
        }


    }

    //Cancelar Vuelo
    @Override
    public void cancelarVuelo() {
        int auxiliar = 0;
        int auxiliar2 = 0;
        int auxiliar3 = 0;

        System.out.print("Digite el número de documento del Usuario: ");
        String Documento = leer.nextLine();

        System.out.print("Digite el número del vuelo que desea cancelar: ");
        String numeroVuelo = leer.nextLine();

        for(int j = 0; j < vuelosReservados.size(); j++) {
            if(Documento.equals(vuelosReservados.get(j).getIdUsuario()) && numeroVuelo.equals(vuelosReservados.get(j).getVuelo().getNumeroVuelo())) {
                auxiliar2 = vuelosReservados.get(j).getAsientosReservados();
                vuelosReservados.remove(vuelosReservados.get(j));
                auxiliar = 1;
                break;
            }
        }

        if (auxiliar == 1) {
            System.out.println("Cancelación realizada con exito.");

            for (int j = 0; j < vuelosDisponibles.size(); j++) {
                if (numeroVuelo.equals(vuelosDisponibles.get(j).getNumeroVuelo())) {
                    auxiliar3 = vuelosDisponibles.get(j).getAsientosDisponibles();
                    vuelosDisponibles.get(j).setAsientosDisponibles(auxiliar2 + auxiliar3);
                    break;
                }
            }
        }
        else {
            System.out.println("Error al hacer la cancelación.");
        }


    }

    //Obtener vuelos
    @Override
    public ArrayList <vuelos> obtenerVuelos() {
        return vuelosDisponibles;
    }

    //Obtener reservas
    public ArrayList<reservas> obtenerReservas() {
        return vuelosReservados;
    }
    
} 
