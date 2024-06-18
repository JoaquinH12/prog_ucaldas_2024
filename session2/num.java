import java.util.Random;
import java.util.Scanner;
public class num{

    public static void main(String[] args) {
        Random random = new Random();
        Scanner leer = new Scanner(System.in);
        
        //Ejercicio #1
        int NumeroRandom = random.nextInt(100) + 1;
        int NumeroUsusario = 0;

        while (NumeroRandom != NumeroUsusario) {
            System.out.print("Digite un número: ");
            NumeroUsusario = leer.nextInt();
            if (NumeroUsusario > NumeroRandom) {
                System.out.println("El número a adivinar es menor");
            }
            else if (NumeroUsusario < NumeroRandom){
                System.out.println("El número a adivinar es mayor");
            }
        }
        System.out.println("Felicidades, adivinaste el número aleatorio");

        System.out.println();
    
        //Ejercicio #2
        int EnteroPositivo = 0;
        int Auxiliar = 0;
        
        System.out.print("Digite un número entero positivo: ");
        EnteroPositivo = leer.nextInt();
        Auxiliar = EnteroPositivo;

        for (int i = 0; i < EnteroPositivo; i++) {
            for (int j = Auxiliar; j > Auxiliar-i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= Auxiliar; k++) {
                System.out.print(k + " ");
            }
            Auxiliar--;
            System.out.println();
        }
    }
}