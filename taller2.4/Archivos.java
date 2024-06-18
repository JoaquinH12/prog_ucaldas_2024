import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class Archivos {
    //Leer Archivo txt de paciente
    public void leerArchivoPaciente(ArrayList <Paciente> pacientes) {
        try {
            BufferedReader lector = new BufferedReader(new FileReader("C:\\Users\\Asus\\OneDrive\\Documentos\\2024\\Segundo Semestre\\Programación II otros\\Archivos\\Pacientes.txt"));
            String linea = "";
            while((linea = lector.readLine()) != null) {
                String [] bloques = linea.split(";");
                if(bloques.length == 4) {
                    String nombre = bloques[0].toLowerCase();
                    String cedula = bloques[1].toLowerCase();
                    String telefono = bloques[2].toLowerCase();
                    String direccion = bloques[3].toLowerCase();
                    pacientes.add(new Paciente(nombre, cedula, telefono, direccion));
                }
            }
        lector.close();
        }
        catch(IOException e) {
            System.out.println("Error al leer el archivo" + e.getMessage());
        }        
    }

    //Leer Archivo txt de Especialidad
    public void leerArchivoEspecialidad(ArrayList <Especialidad> especialidades) {
        try {
            BufferedReader lector = new BufferedReader(new FileReader("C:\\Users\\Asus\\OneDrive\\Documentos\\2024\\Segundo Semestre\\Programación II otros\\Archivos\\Especialidad.txt"));
            String linea = "";
            while((linea = lector.readLine()) != null) {
                String [] bloques = linea.split(";");
                if(bloques.length == 2) {
                    String nombre = bloques[0].toLowerCase();
                    String especialidad = bloques[1].toLowerCase();
                    especialidades.add(new Especialidad(nombre, especialidad));
                }
            }
        lector.close();
        }
        catch(IOException e) {
            System.out.println("Error al leer el archivo" + e.getMessage());
        }        
    }

    //Leer Archivo txt de Medico
    public void leerArchivoMedico(ArrayList <Medico> medicos, ArrayList <Especialidad> especialidades) {
        int auxiliar = 0;
        try {
            BufferedReader lector = new BufferedReader(new FileReader("C:\\Users\\Asus\\OneDrive\\Documentos\\2024\\Segundo Semestre\\Programación II otros\\Archivos\\Medicos.txt"));
            String linea = "";
            while((linea = lector.readLine()) != null) {
                String [] bloques = linea.split(";");
                if(bloques.length == 2) {
                    String nombre = bloques[0].toLowerCase();
                    Especialidad especialidad = especialidades.get(auxiliar);
                    String nacionalidad = bloques[1].toLowerCase();
                    medicos.add(new Medico(nombre, especialidad, nacionalidad));
                    auxiliar += 1;
                }
            }
        lector.close();
        }
        catch(IOException e) {
            System.out.println("Error al leer el archivo" + e.getMessage());
        }        
    }

    //Leer Archivo txt de cita
    public void leerArchivoCita(ArrayList <Cita> citas, ArrayList <Paciente> pacientes, ArrayList <Medico> medicos) {
        int auxiliar = 0;
        try {
            BufferedReader lector = new BufferedReader(new FileReader("C:\\Users\\Asus\\OneDrive\\Documentos\\2024\\Segundo Semestre\\Programación II otros\\Archivos\\Citas.txt"));
            String linea = "";
            while((linea = lector.readLine()) != null) {
                String [] bloques = linea.split(";");
                if(bloques.length == 5) {
                    Paciente paciente = pacientes.get(auxiliar);
                    Medico medico = medicos.get(auxiliar);
                    int anoCita = Integer.parseInt(bloques[0]);
                    int mesCita = Integer.parseInt(bloques[1]);
                    int diaCita = Integer.parseInt(bloques[2]);
                    LocalDate fechaCita = LocalDate.of(anoCita, mesCita, diaCita);
                    String horaCita = bloques[3].toLowerCase();
                    String estado = bloques[4].toLowerCase();
                    citas.add(new Cita(paciente, medico, fechaCita, horaCita, estado));
                    auxiliar += 1;
                }
            }
        lector.close();
        }
        catch(IOException e) {
            System.out.println("Error al leer el archivo" + e.getMessage());
        }        
    }
}