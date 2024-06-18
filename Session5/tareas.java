import java.util.ArrayList;
import java.util.Scanner;

public class tareas {
    ArrayList <Lista> tareas = new ArrayList<Lista>();
    Scanner sc = new Scanner(System.in);
    Scanner scc = new Scanner(System.in);

    //Rellenar lista de tareas
    public void DigitarInformacion() {
        for(int i = 1; i <= 5; i++ ) {
            System.out.print("Digite el nombre de la tarea " + i + ": ");
            String NombreTarea = sc.nextLine();

            System.out.print("Digite la duración de la tarea " + i + ": ");
            String Duracion = sc.nextLine();

            System.out.print("Digite el nombre del encargado de la tarea " + i + ": ");
            String NombreEncargado =sc.nextLine();

            System.out.print("Digite el número del estado de la tarea " + i + " Segun las siguientes opciones\n1. Activa\n2. En desarrollo\n3. Realizada\nDigite su opción: ");
            int Estado = scc.nextInt();

            tareas.add(new Lista(NombreTarea, Duracion, NombreEncargado, Estado));
            System.out.println();
        }
    }

    //Mostrar lista de tareas
    public void ListaDeTareas() {
        for(int j = 0; j < tareas.size(); j++) {
            System.out.print("Tarea " + (j+1) + ": ");
            System.out.println(tareas.get(j).NombreTarea + " " + tareas.get(j).Duracion + " " + tareas.get(j).NombreEncargado + " " + tareas.get(j).Estado);
        }
    }
    
    //Preguntar por algun cambio en el Estado de la tarea
    public boolean RealizarCambio(String confirmacion) {
        String ConfirmarMinuscula = confirmacion.toLowerCase();
        if ("si".equals(ConfirmarMinuscula)) {
            return true;
        }
        else {
            return false;
        }    

    }


    public void CambioEstado(int posicion) {
        int indice = posicion-1;
        System.out.println("Digite el número del uevo estado segun las siguiente opciones\n1. Activa\n2. En desarrollo\n3. Realizada");
        int cambio = scc.nextInt();
        if (cambio != 1 || cambio != 2 || cambio != 3) {
           int parametro = tareas.get(indice).Estado;
        }
        else {
            System.out.println("Esa opción no puede realizarce, intente nuevamente");
        }

    }
}