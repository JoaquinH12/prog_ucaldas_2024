import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class RegistroCitas {
    Scanner leer = new Scanner(System.in);
    Scanner leer2 = new Scanner(System.in);

    /// 1. Registrar paciente
    public void registrarPaciente(ArrayList <Paciente> pacientes) {
        System.out.println();

        int bandera = 0;
        int bandera2 = 0;
        int bandera3 = 0;

        while (bandera2 == 0) {
            System.out.print("Digite el nombre del paciente: ");
            String nombre = leer.nextLine().toLowerCase();
            System.out.print("Digite la cedula del paciente: ");
            String cedula = leer.nextLine().toLowerCase();
            System.out.print("Digite el telefono del paciente: ");
            String telefono = leer.nextLine().toLowerCase();
            System.out.print("Digite la direccion del paciente: ");
            String direccion = leer.nextLine().toLowerCase();
        
            //Validamos que el nombre no exita
            for (int i = 0; i < pacientes.size(); i++) {
                if((pacientes.get(i).getNombre()).equals(nombre)) {
                    bandera = 1;
                    break;
                }
            }
            if (bandera == 1) {
                System.out.println("Nombre de paciente ya registrado.");
                bandera = 0;
                bandera3 += 1;
            }

            //Validamos que la cedula no existe
            for (int j = 0; j < pacientes.size(); j++) {
                if((pacientes.get(j).getNombre()).equals(nombre)) {
                    bandera = 1;
                    break;
                }
            }
            if (bandera == 1) {
                System.out.println("Cedula de paciente ya registrada.");
                bandera = 0;
                bandera3 += 1;
            }

            //Validamos que el telefono no exita
            for (int k = 0; k < pacientes.size(); k++) {
                if((pacientes.get(k).getNombre()).equals(nombre)) {
                    bandera = 1;
                    break;
                }
            }
            if (bandera == 1) {
                System.out.println("Telefono de paciente ya registrado.");
                bandera = 0;
                bandera3 += 1;
            }

            //Hechas las validaciones, y si no hay algun error, agregamos el paciente
            if (bandera3 == 0) {
                pacientes.add(new Paciente(nombre, cedula, telefono, direccion));
                System.out.println("Paciente registrado con exito.");
                bandera2 = 1;
            }

            bandera3 = 0;
        }

        System.out.println();

    }

    /// 2. Registrar medico
    public void registrarMedico(ArrayList <Medico> medicos, ArrayList <Especialidad> especialidades) {
        System.out.println();

        int bandera = 0;
        int bandera2 = 0;

        System.out.print("Digite el nombre del medico: ");
        String nombre = leer.nextLine().toLowerCase();
        System.out.print("Digite la Especialidad del medico, verificaremos si esta registrada: ");
        String especialidad = leer.nextLine().toLowerCase();
        System.out.print("Digite el código del medico: ");
        String codigoMedico = leer.nextLine().toLowerCase();

        //Verificamos que el nombre no existe
        for (int i = 0; i < medicos.size(); i++) {
            if((medicos.get(i).getNombre()).equals(nombre)) {
                bandera = 1;
                break;
            }
        }
        if (bandera == 1) {
            System.out.println("Nombre de medico ya registrado.");
            bandera = 0;
            bandera2 += 1;
        }

        //Verificamos que el código no existe
        for (int j = 0; j < medicos.size(); j++) {
            if((medicos.get(j).getCodigoMedico()).equals(codigoMedico)) {
                bandera = 1;
                break;
            }
        }
        if (bandera == 1) {
            System.out.println("Código de medico ya registrado.");
            bandera = 0;
            bandera2 += 1;
        }

        //Hechas la validaciones y si no hay algun error; agregamos el medico
        if (bandera2 == 0) {
            //Validamos que la especialidad existe, y si existe agregamos al medio
            for (int k = 0; k < especialidades.size(); k++) {
                if((especialidades.get(k).getNombre()).equals(especialidad)) {
                    bandera = 1;
                    Especialidad especialidad2 = especialidades.get(k);
                    medicos.add(new Medico(nombre, especialidad2, codigoMedico));
                    System.out.println("Medico registrado con exito.");
                    break;
                }
            }
            //Si no existe, mostramos un mensaje
            if (bandera == 0) {
                System.out.println("Especialidad no registrada.");
            }
        }

        System.out.println();

    }

    /// 3. Registrar Especialidad
    public void registrarEspecialidad(ArrayList <Especialidad> especialidades) {
        System.out.println();

        int bandera = 0;
        int bandera2 = 0;

        System.out.print("Digite el nombre de la especialidad: ");
        String nombre = leer.nextLine().toLowerCase();
        System.out.print("Digite una breve descripción de la especialidad: ");
        String descripcion = leer.nextLine().toLowerCase();

        //Validamos que el nombre no exista
        for (int i = 0; i < especialidades.size(); i++) {
            if((especialidades.get(i).getNombre()).equals(nombre)) {
                bandera = 1;
                break;
            }
        }
        if (bandera == 1) {
            System.out.println("Especialidad ya registrada.");
            bandera = 0;
            bandera2 += 1;
        }

        //Validamos que la descripción no exista
        for (int i = 0; i < especialidades.size(); i++) {
            if((especialidades.get(i).getDescripcion()).equals(descripcion)) {
                bandera = 1;
                break;
            }
        }
        if (bandera == 1) {
            System.out.println("Descripción ya registrada.");
            bandera = 0;
            bandera2 += 1;
        }

        //Hechas las validaciones, y si no hay algun error, agregamos la especialidad
        if (bandera2 == 0) {
            especialidades.add(new Especialidad(nombre, descripcion));
            System.out.println("Especialidad registrada con exito.");
        }

        System.out.println();
 
    }

    /// 4 . Registrar cita
    public void registrarCita(ArrayList <Cita> citas, ArrayList <Paciente> pacientes, ArrayList <Medico> medicos) {
        int bandera = 0;
        int bandera2 = 0;
        int ano = 2024;

        System.out.print("Digite el nombre del paciente: ");
        String paciente = leer.nextLine().toLowerCase();
        System.out.print("Digite el medico del paciente: ");
        String medico = leer.nextLine().toLowerCase();
        System.out.print("Digite el número del mes de la cita del paciente: ");
        int mes = leer2.nextInt();
        System.out.print("Digite el número día de la cita del paciente: ");
        int dia = leer2. nextInt();
        System.out.print("Digite la hora de la cita (la hora en formato militar Ej: 09:30): ");
        String horaCita = leer.nextLine();
        System.out.println("Digite el estado de la cita, segun estas opciones:\n1. Pendiente\n2. Confirmada\n3. Cancelada");
        System.out.print("Digite la elección: ");
        String estado = leer.nextLine().toLowerCase();

        //Validamos que el mes y el día sean correctos
        if (mes < 1 || mes > 12) {
            System.out.println("Mes fuera del rango estabelecido.");
            bandera2 += 1;
        }
        else {
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                if (dia < 1 || dia > 31) {
                    System.out.println("Día fuera del rango de ese mes.");
                    bandera2 +=1;
                }
            }
            else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                if (dia < 1 || dia > 30) {
                    System.out.println("Día fuera del rango de ese mes.");
                    bandera2 += 1;
                }
            }
            else {
                if ((ano % 4 == 0) || (ano % 4 == 0 && ano % 100 != 0) || (ano % 100 == 0 && ano % 400 == 0)) {
                    if (dia < 1 || dia > 29) {
                        System.out.println("Día fuera del rango de ese mes.");
                        bandera2 += 1;
                    }
                }
                else {
                    if (dia < 1 || dia > 28) {
                        System.out.println("Día fuera del rango de ese mes.");
                        bandera2 += 1;
                    }
                }
            }
        }

        //Validamos que el médico este registrado
        for (int i = 0; i < citas.size(); i++) {
            if((citas.get(i).getMedico().getNombre()).equals(medico)) {
                bandera = 1;
                break;
            }
        }
        if (bandera == 1) {
            //Validamos si el médico tiene disponibilidad en fecha y hora
            if (bandera2 == 0) {
                LocalDate fechaCitaValidar1 = LocalDate.of(ano, mes, dia);
                for (int j = 0; j < citas.size(); j++) {
                    if((citas.get(j).getMedico().getNombre()).equals(medico)) {
                        if ((citas.get(j).getFechaCita()).isEqual(fechaCitaValidar1) && (citas.get(j).getHoraCita()).equals(horaCita)) {
                            System.out.println("Medico no disponible en fecha o hora solicitada.");
                            bandera2 +=1;
                            break;
                        }
                    }
                }
            }

            bandera = 0;
        }
        else {
            System.out.println("Médico no registrado.");
            bandera2 += 1;
        }

        //Validamos que el paciente este registrado
        for (int i = 0; i < citas.size(); i++) {
            if((citas.get(i).getPaciente().getNombre()).equals(paciente)) {
                bandera = 1;
            }
        }
        if (bandera == 1) {
            //Validamos si el paciente no tiene otra cita en esa misma fecha y hora
            if (bandera2 == 0) {
                LocalDate fechaCitaValidar2 = LocalDate.of(ano, mes, dia);
                for (int j = 0; j < citas.size(); j++) {
                    if((citas.get(j).getPaciente().getNombre()).equals(paciente)) {
                        if ((citas.get(j).getFechaCita()).isEqual(fechaCitaValidar2) && (citas.get(j).getHoraCita()).equals(horaCita)) {
                            System.out.println("El paciente ya tiene registrada un cita en esa fecha.");
                            bandera2 +=1;
                            break;
                        }
                    }
                }
            }

            bandera = 0; 
        }
        else {
            System.out.println("Paciente no registrado.");
            bandera2 += 1;
        }

        //Validamos que el estado sea correcto
        if ("pendiente".equals(estado) || "confirmada".equals(estado) || "cancelada".equals(estado)) {
            //solo validación
        }
        else {
            System.out.println("Estado no valido.");
            bandera2 += 1;
        }

        //Hechas las validaciones, y si no hay algun error, agregamos la cita
        if (bandera2 == 0){
            for (int k = 0; k < citas.size(); k++) {
              if((citas.get(k).getPaciente().getNombre()).equals(paciente)) {
                for (int l = 0; l < citas.size(); l++) {
                    if((citas.get(l).getMedico().getNombre()).equals(medico)) {
                        Paciente paciente2 = pacientes.get(k);
                        Medico medico2 = medicos.get(l);
                        LocalDate fechaCita = LocalDate.of(ano, mes, dia);
                        citas.add(new Cita(paciente2, medico2, fechaCita, horaCita, estado));
                        System.out.println("Cita registrada con exito.");
                        break;
                    }
                }
                break;
              }
            }
        }

        System.out.println();

    }

    /// 5. Listar pacientes
    public void listarPacientes(ArrayList <Paciente> pacientes) {
        System.out.println();

        for (int i = 0 ; i < pacientes.size(); i++) {
            System.out.print("Paciente no. " + (i+1) + " - ");
            System.out.println("Nombre: " + pacientes.get(i).getNombre() + "  Cedula: " + pacientes.get(i).getCedula() + "  Telefono: " + pacientes.get(i).getTelefono() + "  Dirección: " + pacientes.get(i).getDireccion());
        }

        System.out.println();

    }

    /// 6. Listar Medicos
    public void listarMedicos(ArrayList <Medico> medicos) {
        System.out.println();

        for (int i = 0 ; i < medicos.size(); i++) {
            System.out.print("Medico no. " + (i+1) + " - ");
            System.out.println("Nombre: " + medicos.get(i).getNombre() + "  Especialdiad: " + medicos.get(i).getEspecialidad().getNombre() + "  Código del medico: " + medicos.get(i).getCodigoMedico());
        }
        System.out.println();

    }
    
    /// 7. Listar Especialidad
    public void listarEspecialidad(ArrayList <Especialidad> especialidades) {
        System.out.println();

        for (int i = 0 ; i < especialidades.size(); i++) {
            System.out.print("Especialidad no. " + (i+1) + " - ");
            System.out.println("Nombre: " + especialidades.get(i).getNombre() + "  Descripción: " + especialidades.get(i).getDescripcion());
        }
        
        System.out.println();

    }

    /// 8. Listar citas
    public void listarCitas(ArrayList <Cita> citas) {
        System.out.println();

        for (int i = 0 ; i < citas.size(); i++) {
            System.out.print("Cita no." + (i+1) + " - ");
            System.out.println("Paciente: " + citas.get(i).getPaciente().getNombre() + "  Medico: " + citas.get(i).getMedico().getNombre() + "  Fecha de la cita: " + citas.get(i).getFechaCita() + "  Hora de la cita: " + citas.get(i).getHoraCita() + "  Estado: " + citas.get(i).getEstado());
        }

        System.out.println();
    }

    /// 9. Buscar citas
    public void buscarCitas(String filtro, ArrayList <Cita> citas) {
        System.out.println();

        int auxiliar = 0;

        for (int i = 0; i < citas.size(); i++) {
            if ((citas.get(i).getPaciente().getNombre()).equals(filtro) || (citas.get(i).getMedico().getNombre()).equals(filtro) || (citas.get(i).getMedico().getEspecialidad().getNombre()).equals(filtro)) {
                System.out.println("Paciente: " + citas.get(i).getPaciente().getNombre() + "  Medico: " + citas.get(i).getMedico().getNombre() + "  Fecha de la cita: " + citas.get(i).getFechaCita() + "  Hora de la cita: " + citas.get(i).getHoraCita() + "  Estado: " + citas.get(i).getEstado());
                auxiliar += 1;
            }
        }
        if (auxiliar == 0) {
            System.out.println("No se encontro información con el filtro dado");
        }

        System.out.println();

    }

    /// 10. Buscar cita de doctor por día y hora
    public void citaDoctor(String medico, ArrayList <Cita> citas) {
        System.out.println();
        int auxiliar = 0;

        LocalTime horaInicio = LocalTime.of(8, 0);
        LocalTime horaFin = LocalTime.of(12, 0);

        for (int i = 0; i < citas.size(); i++) {
            if ((citas.get(i).getMedico().getNombre()).equals(medico)) {
                DayOfWeek diaSemana = citas.get(i).getFechaCita().getDayOfWeek();
                String diaSemanaCita = diaSemana.name().toLowerCase();
                LocalTime horaCita = convertirHora(citas.get(i).getHoraCita());

                if (diaSemanaCita.equals("tuesday")) {
                    auxiliar += 1;
                }
                if (horaCita.isAfter(horaInicio) && horaCita.isBefore(horaFin)) {
                    auxiliar += 1;
                }
            }
            if (auxiliar == 2) {
                System.out.println("Paciente: " + citas.get(i).getPaciente().getNombre() + "  Medico: " + citas.get(i).getMedico().getNombre() + "  Fecha de la cita: " + citas.get(i).getFechaCita() + "  Hora de la cita: " + citas.get(i).getHoraCita() + "  Estado: " + citas.get(i).getEstado());
            }

            auxiliar = 0;

        }
        System.out.println();
    }

    //convertir hora
    public static LocalTime convertirHora(String horaStr) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
            LocalTime hora = LocalTime.parse(horaStr, formatter);
            return hora;
        } catch (Exception e) {
            return null; // Formato de hora incorrecto
        }
    }
    
}