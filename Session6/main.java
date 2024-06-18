import java.util.Scanner;
public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println(" seleccione una opcion del menu");
        System.out.println("1. mujer");
        System.out.println("2. hombre");
        System.out.println("3. salir");
        int menu_option = scanner.nextInt();
        switch (menu_option) {
            case 1:
            WomenMenu insatnce_Woman = new WomenMenu();
            insatnce_Woman.option_menu();
            break;
            case 2:
            ManMenu instance_Men = new ManMenu();
            break;
            case 3:
            System.out.println(" saliendo del programa ");
            break;
            default:
            System.out.println(" opcion no valida");
                break;
        }

        }
    
}
