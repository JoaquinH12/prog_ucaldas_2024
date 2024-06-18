import java.util.ArrayList;
import java.util.Scanner;

public class Estudiantes extends Persona{
    public Seminarios instancia_seminarios = new Seminarios();
    ArrayList <InformacionSeminarios> seminarios_estudiante = new ArrayList<>();
    Scanner leer = new Scanner(System.in);

    private String nombre_estudiante = "";
    private float promedio_estudiante = 0f;

    public Estudiantes(String nombre, String numero_telefono, String correo_electronico, String nombre_estudiante, float promedio_estudiante) {
        super(nombre, numero_telefono, correo_electronico);
        this.nombre_estudiante = nombre_estudiante;
        this.promedio_estudiante = promedio_estudiante;
    }

    public Estudiantes(String nombre, String numero_telefono, String correo_electronico, float promedio_estudiante) {
        super(nombre, numero_telefono, correo_electronico);
        this.promedio_estudiante = promedio_estudiante;
    }
    

    //Usuario inscribe seminarios
    public void inscribirSeminario (ArrayList <InformacionSeminarios> matematicas,ArrayList <InformacionSeminarios> fisica,ArrayList <InformacionSeminarios> programacion) {
        System.out.print("\nDigite el nombre del seminario de su elección - Primera materia: ");
        String eleccion1 = leer.nextLine().toLowerCase();

        for(int i = 0; i < matematicas.size(); i++) {
            if((matematicas.get(i).getNombre_seminario()).equals(eleccion1)) {
                seminarios_estudiante.add(matematicas.get(i));
            }
        }

        System.out.print("Digite el nombre del seminario de su elección - Segunda materia: ");
        String eleccion2 = leer.nextLine().toLowerCase();

        for(int i = 0; i < fisica.size(); i++) {
            if((fisica.get(i).getNombre_seminario()).equals(eleccion2)) {
                seminarios_estudiante.add(fisica.get(i));
            }
        }

        System.out.print("Digite el nombre del seminario de su elección - Tercera materia: ");
        String eleccion3 = leer.nextLine().toLowerCase();

        for(int i = 0; i < programacion.size(); i++) {
            if((programacion.get(i).getNombre_seminario()).equals(eleccion3)) {
                seminarios_estudiante.add(programacion.get(i));
            }
        }

    }

    ///Muestran seminarios del usuario
    public void GetTomarSeminario () {
        System.out.println("\nLos seminarios del estudiante son: ");
        for(int i = 0; i < seminarios_estudiante.size(); i++) {
            System.out.println((i+1) + ". " + seminarios_estudiante.get(i).getNombre_seminario());
        }
    }


}