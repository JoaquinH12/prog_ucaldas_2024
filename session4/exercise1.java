import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int LongitudArreglo = 0;      
        int suma = 0;
        System.out.print("Digite la cantidad de números que tendra el arreglo: ");
        LongitudArreglo = sc.nextInt();

        int[] NumerosEnteros = new int[LongitudArreglo];

        for (int i = 0; i < NumerosEnteros.length; i++) {
            System.out.print("Digite el número " + (i+1) + ": ");
            NumerosEnteros[i] = sc.nextInt();
        }

        for (int j = 0; j < NumerosEnteros.length; j++) {
            suma += NumerosEnteros[j];
        }

        System.out.println("La suma de todos los elementos del arreglo es de : " + suma);
    }
}