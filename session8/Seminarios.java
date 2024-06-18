import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Seminarios {
    ArrayList <InformacionSeminarios> seminariosMatematicas = new ArrayList<>();
    ArrayList <InformacionSeminarios> seminariosFisicas = new ArrayList<>();
    ArrayList <InformacionSeminarios> seminariosProgramacion = new ArrayList<>();

    public void SeminarioMatematicas () {
        try {
            BufferedReader lector = new BufferedReader(new FileReader("C:\\Users\\Asus\\OneDrive\\Documentos\\2024\\Segundo Semestre\\Programación II otros\\Archivos\\SemilleroMatematicas.txt"));
            String linea = "";
            while ((linea = lector.readLine()) != null) {
                String [] bloques = linea.split(";");
                if(bloques.length == 5) {
                    String nombre_seminario = bloques[0];
                    int horas_seminario = Integer.parseInt(bloques[1]);
                    String nombre_profesor = bloques[2];
                    String telefono_profesor = bloques[3];
                    String correo_profesor = bloques[4];
                    seminariosMatematicas.add(new InformacionSeminarios(nombre_seminario, horas_seminario, new Profesor(nombre_profesor, telefono_profesor, correo_profesor)));
                }            
            }
        lector.close();
        }
        catch(IOException e) {
            System.out.println("Error al leer el archivo " + e.getMessage());
        }
    }

    public void SeminarioFisicas () {
        try {
            BufferedReader lector = new BufferedReader(new FileReader("C:\\Users\\Asus\\OneDrive\\Documentos\\2024\\Segundo Semestre\\Programación II otros\\Archivos\\SemilleroFisica.txt"));
            String linea = "";
            while ((linea = lector.readLine()) != null) {
                String [] bloques = linea.split(";");
                if(bloques.length == 5) {
                    String nombre_seminario = bloques[0];
                    int horas_seminario = Integer.parseInt(bloques[1]);
                    String nombre_profesor = bloques[2];
                    String telefono_profesor = bloques[3];
                    String correo_profesor = bloques[4];
                    seminariosFisicas.add(new InformacionSeminarios(nombre_seminario, horas_seminario, new Profesor(nombre_profesor, telefono_profesor, correo_profesor)));
                }            
            }
        lector.close();
        }
        catch(IOException e) {
            System.out.println("Error al leer el archivo " + e.getMessage());
        }
    }

    public void SeminarioProgramacion () {
        try {
            BufferedReader lector = new BufferedReader(new FileReader("C:\\Users\\Asus\\OneDrive\\Documentos\\2024\\Segundo Semestre\\Programación II otros\\Archivos\\SemilleroProgramacion.txt"));
            String linea = "";
            while ((linea = lector.readLine()) != null) {
                String [] bloques = linea.split(";");
                if(bloques.length == 5) {
                    String nombre_seminario = bloques[0];
                    int horas_seminario = Integer.parseInt(bloques[1]);
                    String nombre_profesor = bloques[2];
                    String telefono_profesor = bloques[3];
                    String correo_profesor = bloques[4];
                    seminariosProgramacion.add(new InformacionSeminarios(nombre_seminario, horas_seminario, new Profesor(nombre_profesor, telefono_profesor, correo_profesor)));
                }            
            }
        lector.close();
        }
        catch(IOException e) {
            System.out.println("Error al leer el archivo " + e.getMessage());
        }
    }

    public void imprimirSeminarios () {
        System.out.println("Seminarios de Matemáticas: ");
        for (int i = 0; i < seminariosMatematicas.size(); i++) {
            System.out.println((i+1) +". " + seminariosMatematicas.get(i).getNombre_seminario());
        }

        System.out.println();
        System.out.println("Seminarios de Física: ");
        for (int i = 0; i < seminariosFisicas.size(); i++) {
            System.out.println((i+1) +". " + seminariosFisicas.get(i).getNombre_seminario());
        }

        System.out.println();
        System.out.println("Seminarios de Programación: ");
        for (int i = 0; i < seminariosProgramacion.size(); i++) {
            System.out.println((i+1) +". " + seminariosProgramacion.get(i).getNombre_seminario());
        }

    }

}