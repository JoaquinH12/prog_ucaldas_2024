public class main {
    public static Seminarios ins_seminario = new Seminarios();
    public static Estudiantes instancia_estudiante = new Estudiantes("Pepito perez", "3113259520", "PepitoPer@gmail.com", 2.5f);
    public static void main(String[] args) {
        ins_seminario.SeminarioMatematicas();
        ins_seminario.SeminarioFisicas();
        ins_seminario.SeminarioProgramacion();
        
        System.out.println("Tenemos los siguientes seminarios en las siguientes materias: \n");
        ins_seminario.imprimirSeminarios();

        instancia_estudiante.inscribirSeminario(ins_seminario.seminariosMatematicas, ins_seminario.seminariosFisicas, ins_seminario.seminariosProgramacion);
        instancia_estudiante.GetTomarSeminario();
    }
}