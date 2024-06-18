import java.util.ArrayList;
import java.util.Scanner;
public class Exercise2 {

    public static void main(String[] args) {
        ArrayList <String> ArregloDinamico = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int Auxiliar = 0;
        int indice = 0;
        String palabra = " ";

        while (Auxiliar >= 0) {
            System.out.println("Adición y elminación de palabras: ");
            System.out.println("* Para agregar una palabra digite 1");
            System.out.println("* Para eliminar una palabra, digite 2");
            System.out.println("* Para dejar de agregar o eliminar digite un número menor a cero.");

            System.out.print("Digite su opcion aquí: ");
            Auxiliar = sc.nextInt();

            if (Auxiliar == 1) {
                System.out.print("Digite la palabra que desea agregar: ");
                palabra = sc.nextLine();
                ArregloDinamico.add(palabra);
            }
            else if (Auxiliar == 2) {
                System.out.println("Puedes borrar desde el indice 0 al " + (ArregloDinamico.size()-1));
                System.out.print("Digite el indice que desea eliminar: ");
                indice = sc.nextInt();
                ArregloDinamico.remove(indice);
            }
            System.out.println();
        }
    }
}