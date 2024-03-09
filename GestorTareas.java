
import java.util.ArrayList;
import java.util.Scanner;

public class GestorTareas {
    private ArrayList<Tareas> tareas;
    public Scanner scanner;

    public GestorTareas() {
        tareas = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void agregarTarea() {
        System.out.print("Ingrese el nombre de la tarea: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la duración de la tarea (en minutos): ");
        String duracion = scanner.nextLine();
        System.out.print("Ingrese la persona encargada: ");
        String personaEncargada = scanner.nextLine();
        System.out.print("Ingrese el estado de la tarea (Activa, En progreso, Completada): ");
        String estado = scanner.nextLine();
        Tareas tarea = new Tareas(nombre, duracion, personaEncargada, estado);
        tareas.add(tarea);
        System.out.println("Tarea agregada correctamente.");
    }

    public void mostrarTareas() {
        System.out.println("Tareas:");
        for (Tareas tarea : tareas) {
            System.out.println(tarea);
        }
    }

    public void eliminarTarea() {
        System.out.print("Ingrese el nombre de la tarea a eliminar: ");
        String nombre = scanner.nextLine();
        for (int i = 0; i < tareas.size(); i++) {
            if (tareas.get(i).getNombre().equals(nombre)) {
                tareas.remove(i);
                System.out.println("Tarea eliminada correctamente.");
                return;
            }
        }
        System.out.println("Tarea no encontrada.");
    }

    
}
