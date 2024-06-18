import java.util.Scanner;

public class main {
    static tareas InstanciaTareas = new tareas();

    public static void main(String[] args) {
        Scanner scs = new Scanner(System.in);
        Scanner scs2 = new Scanner(System.in);
        int auxiliar = 0;

        InstanciaTareas.DigitarInformacion();
        
        while (auxiliar == 0) {
            System.out.println("Lista de tareas actual: ");
            InstanciaTareas.ListaDeTareas();

            System.out.print("Desea realizar algun cambio en el estado de alguna tarea?: ");
            String accion = scs.nextLine();
       
            boolean confirmar = InstanciaTareas.RealizarCambio(accion);
            if (confirmar == true) {
                System.out.println("Digite el número de la tarea que desea actualizar: ");
                int indice = scs2.nextInt();

                InstanciaTareas.CambioEstado(indice);
            }
            else {
                auxiliar = -1;
            }
        }
    }
}