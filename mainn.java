public class mainn {

    public static void main(String[] args) {
        GestorTareas gestorTareas = new GestorTareas();
        
    
        while (true) {
            System.out.println("1. Agregar Tarea");
            System.out.println("2. Mostrar Tareas");
            System.out.println("3. Eliminar Tarea");
            System.out.println("4. Salir");
            System.out.print("Ingrese su opción: ");
            int opcion = Integer.parseInt(gestorTareas.scanner.nextLine());
    
            switch (opcion) {
                case 1:
                    gestorTareas.agregarTarea();
                    break;
                case 2:
                    gestorTareas.mostrarTareas();
                    break;
                case 3:
                    gestorTareas.eliminarTarea();
                    break;
                case 4:
                    gestorTareas.scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción inválida. Por favor, intente de nuevo.");
            }
        }
    }
    }
    
