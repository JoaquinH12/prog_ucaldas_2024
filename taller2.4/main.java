import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static Archivos instanciaArchivos = new Archivos();
    public static RegistroCitas instanciaCitas = new RegistroCitas();
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Scanner leer2 = new Scanner(System.in);
        ArrayList <Paciente> pacientes = new ArrayList<Paciente>();
        ArrayList <Medico> medicos = new ArrayList<Medico>();
        ArrayList <Especialidad> especialidades = new ArrayList<Especialidad>();
        ArrayList <Cita> citas = new ArrayList<Cita>();

        instanciaArchivos.leerArchivoPaciente(pacientes);
        instanciaArchivos.leerArchivoEspecialidad(especialidades);
        instanciaArchivos.leerArchivoMedico(medicos, especialidades);
        instanciaArchivos.leerArchivoCita(citas, pacientes, medicos);

        int eleccion = 0;
        int auxiliar = 0;
        String filtro = "";

        do {
            System.out.println("Menu Principal - Hospital:\n\n1. Registrar paciente  2. Registrar medico  3. Registrar especialidad  4. Registrar cita  5. Listar pacientes");
            System.out.println("6. Listar medicos  7. Listar especialidades  8. Listar citas  9. Buscar citas  10. Buscar citas por medico y hora el día martes en la mañana  11. Salir\n");
            System.out.print("Digite el número de la opción que desea realizar: ");
            eleccion = leer.nextInt();

            switch (eleccion) {
                //Registra paciente
                case 1:
                    instanciaCitas.registrarPaciente(pacientes);
                    break;

                //Registar medico
                case 2:
                    instanciaCitas.registrarMedico(medicos, especialidades);
                    break;

                //Registrar especialidad
                case 3:
                    instanciaCitas.registrarEspecialidad(especialidades);
                    break;

                //Registrar cita
                case 4:
                    instanciaCitas.registrarCita(citas, pacientes, medicos);
                    break;

                //Listar pacientes
                case 5:
                    instanciaCitas.listarPacientes(pacientes);
                    break;

                //Listar medicos
                case 6:
                    instanciaCitas.listarMedicos(medicos);
                    break;

                //Listar especialidades
                case 7: 
                    instanciaCitas.listarEspecialidad(especialidades);
                    break;

                //Listar citas
                case 8:
                    instanciaCitas.listarCitas(citas);
                    break;

                //Buscar cita
                case 9:
                    System.out.println();
                    System.out.print("Digite el nombre del paciente, el nombre o especialidad del medico: ");
                    filtro = leer2.nextLine().toLowerCase();
                    instanciaCitas.buscarCitas(filtro, citas);
                    System.out.println();
                    break;

                //Buscar cita por medico y hora el día martes en la mañana
                case 10:
                    System.out.print("Digite el nombre del medico: ");
                    String medico = leer2.nextLine().toLowerCase();
                    instanciaCitas.citaDoctor(medico, citas);
                    break;
                
                //Salir
                case 11:
                    auxiliar = 1;
                    break;

                //Mensaje en caso de que se ingrese una opción no definida
                default:
                    System.out.println();
                    System.out.println("Opción no disponible, intente nuevamente");
                    System.out.println();
                    break;
            }
        } while (auxiliar == 0);
    }
}