import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List instance_StudentList = new List();
        boolean status = false;

        while (!status) {
            
        
            System.out.println(" seleccione una opcion del menu");
            System.out.println("1. agregar estudiante");
            System.out.println("2. eliminar estudiante");
            System.out.println("3. listar estudiantes ");
            System.out.println("4. buscar estudiante ");
            System.out.println("5. salir");
    
            int menu = scanner.nextInt();
            
            
            switch (menu) {
                
                case 1:
                
                instance_StudentList.addStudent();
                break;
    
                case 2:
                
                instance_StudentList.deleteStudent();
                break;
    
                case 3:
                instance_StudentList.showList();
                break;
    
                case 4:
                instance_StudentList.find();
                break;
    
                case 5:
                status = true;
                break;
                    
                default:
                System.out.println("valor no valido");
                break;
            }
        }
        
    }
}