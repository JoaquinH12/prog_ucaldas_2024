import java.util.Scanner;
public class WomenMenu {
    Scanner scanner = new Scanner(System.in);

    public String WomenMenu () {
    return   "1. Calzado\n    2.\" productos destacados (los del taller de hoy)\"\n     3.ropa\n     4.accesorios\n        5.deporte\n" ;
    
    }

public void option_menu() {
    System.out.println(WomenMenu());
    int option = 0;
    int sub_optionMenu = 0;
    Classic instance_Classic = new Classic();
            instance_Classic.addRunningShoes();
            Running instance_Running = new Running();
            instance_Running.addRunningShoes();
    

    option = scanner.nextInt();
switch (option){
    case 1:
    System.out.println(" calzado\n   1. Running\n    2.Classic\n     selecciona una opcion");
    sub_optionMenu = scanner.nextInt();
    if (sub_optionMenu == 1) {
        System.out.println(instance_Running.showInformation());
    }else if (sub_optionMenu == 2) {
        System.out.println(instance_Classic.showInformation());
        }
        else {
            System.out.println(" opcion no valida");
        }
    break;

    case 2:
    System.out.println(" 1.Runnign talla 38\n   2. Classic de mas de 5 colores\n    3.Running y Classic de mas de 150USD\n  4.envio disponible tenis Running         selecciona una opcion");
    sub_optionMenu = scanner.nextInt();
    System.out.println();
    if (sub_optionMenu == 1) { // talla
        System.out.println(instance_Running.size38());
    }else
        if (sub_optionMenu == 2) { // color
        System.out.println(instance_Classic.colors5());
        }
        else
        if (sub_optionMenu == 3) { // precio
            System.out.println("Tipo Running: " + instance_Running.precioUSD() );
            System.out.println();
            System.out.println(" Tipo Classic: " +instance_Classic.precioUSD());
        } else
            if (sub_optionMenu == 4) {
                System.out.println(instance_Running.envio());
            }
    break;

    case 3:
    System.out.println(" ropa");
    break;
}
}

}