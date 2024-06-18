import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
public class Exercise3 {

    public static void main(String[] args) {
        LinkedList <Integer> ListaEnlazada = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        int BuscarDato = 0;
        int Auxiliar = 0;

        for (int i = 0; i < 10; i++) {
            ListaEnlazada.add(random.nextInt(20) + 1);
        }

        System.out.println("Acabamos de generar una Lista Enlazada con 10 números aleatorios entre 1 y 20.");
        System.out.print("Digite un número y verificaremos si se encuentra en la lista generada: ");
        BuscarDato = sc.nextInt();

        for (int j = 0; j < ListaEnlazada.size(); j++) {
            if (BuscarDato == ListaEnlazada.get(j)) {
                Auxiliar = 1;
                break;
            }
        }

        if (Auxiliar == 0) {
            System.out.println("El número ingresado no se encontro en la lista.");
        }
        else {
            System.out.println("El número ingresado si se encontro en la lista.");
        }
    }
}