import java.util.ArrayList;
import java.util.Scanner;
public class List {
    public ArrayList <Student> Students = new ArrayList<Student>();
    java.util.Scanner scanner = new Scanner(System.in);

    public void addStudent() {
        
        System.out.println("ingrese el nombre del estudiante");
        String name = scanner.nextLine();
        System.out.println("ingrese el codigo unico del estudiante ");
        String code = scanner.nextLine();
        System.out.println("ingrese la carrera que esta cursando el estudiante");
        String carrer = scanner.nextLine();
        System.out.println("ingrese el promedio del estudiante");
        double average = scanner.nextDouble();
        scanner.nextLine();
        Student estu = new Student(name, code, carrer, average);
        Students.add(estu);
        System.out.println(" agregada correctamente.");
    }

    public void deleteStudent(){
        System.out.println(" ingrese el codigo de el estudiante que desee eliminar");
        String code = scanner.nextLine();
        for (int i = 0; i < Students.size(); i++) {
            if (Students.get(i).getCode().equals(code)) {
                Students.remove(i);
                System.out.println("Tarea eliminada correctamente.");
                return;
            }
        }
        System.out.println(" Estudiante no encontrado");
    }
    
    public void showList() {
        for (Student estu : Students) {
            System.out.println(estu);
        }
    }

    public String find(){
        
        System.out.println("Seleccione una opción de búsqueda:");
        System.out.println("1. Por nombre");
        System.out.println("2. Por código");
        System.out.println("3. Por carrera");
        int option = scanner.nextInt();
        scanner.nextLine();
        String list = "";

        switch (option) {
            case 1:
            System.out.println("Digite el nombre del estudiante:");
            String name = scanner.nextLine();
            for (Student student : Students) {
                if (student.getName().equals(name)) {
                    list += student.toString() + "\n";
                    System.out.println(list);
                    }
                }
            break;

            case 2:
            System.out.println("Digite el código del estudiante:");
            String code = scanner.nextLine();
            for (Student student : Students) {
                if (student.getCode().equals(code)) {
                    list += student.toString() + "\n";
                    System.out.println(list);
                    }
                    
                }
            break;

            case 3:
            System.out.println("Digite la carrera del estudiante:");
            String carrer = scanner.nextLine();
            for (Student student : Students) {
                if (student.getCarrer().equals(carrer)) {
                    list += student.toString() + "\n";
                    System.out.println(list);
                    }
                    
                }
            break;
        
            default:
                System.out.println(" opcion no valida");
                break;
        }
        return list;
    }

}
