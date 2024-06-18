import java.util.ArrayList;
import java.util.Scanner;

public class Profesor extends Persona {
    Scanner leer = new Scanner(System.in);

    private String profesor_id = "";
    private ArrayList <String> asignatura = new ArrayList<>();
    private ArrayList <String> aula = new ArrayList<>();

    public Profesor(String nombre, String segundoNombre, String documento, String genero, String profesor_id, ArrayList <String> asignatura, ArrayList <String> aula) {
        super(nombre, segundoNombre, documento, genero);
        this.profesor_id = profesor_id;
        this.asignatura = asignatura;
        this.aula = aula;
    }

    public void anadir_materia() {
        System.out.println("Digite le nombre de la asignatura: ");
        String auxiliar = leer.nextLine();

        asignatura.add(auxiliar);
    }

   
}