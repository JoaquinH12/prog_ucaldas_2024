import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        RegistroInventario registro = new RegistroInventario();
        Scanner scanner = new Scanner(System.in);

        int opcion = 0;
        while (opcion != 9) {
            System.out.println("\nMenú:");
            System.out.println("1. Registrar producto");
            System.out.println("2. Listar productos");
            System.out.println("3. Listar productos por stock (de mayor a menor)");
            System.out.println("4. Listar productos por categoría");
            System.out.println("5. Listar productos ordenados por nombre");
            System.out.println("6. Eliminar producto");
            System.out.println("7. Agregar stock a un producto");
            System.out.println("8. Eliminar stock de un producto");
            System.out.println("9. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    scanner.nextLine(); // Consume la nueva línea
                    System.out.print("Ingrese el nombre del producto: ");
                    String nombreProducto = scanner.nextLine();
                    System.out.print("Ingrese el nombre de la categoría: ");
                    String nombreCategoria = scanner.nextLine();
                    Categoria categoria = new Categoria(nombreCategoria, "");
                    System.out.print("Ingrese el precio del producto: ");
                    double precio = scanner.nextDouble();
                    System.out.print("Ingrese el stock inicial del producto: ");
                    int stock = scanner.nextInt();
                    Producto nuevoProducto = new Producto(nombreProducto, categoria, precio, stock);
                    registro.registrarProducto(nuevoProducto);
                    break;
                case 2:
                    registro.listarProductos();
                    break;
                case 3:
                    registro.listarProductosPorStock();
                    break;
                case 4:
                    scanner.nextLine(); // Consume la nueva línea
                    System.out.print("Ingrese el nombre de la categoría: ");
                    String categoriaBusqueda = scanner.nextLine();
                    registro.listarProductosPorCategoria(categoriaBusqueda);
                    break;
                case 5:
                    registro.listarProductosOrdenadosPorNombre();
                    break;
                case 6:
                    scanner.nextLine(); // Consume la nueva línea
                    System.out.print("Ingrese el nombre del producto a eliminar: ");
                    String productoEliminar = scanner.nextLine();
                    registro.eliminarProducto(productoEliminar);
                    break;
                case 7:
                    scanner.nextLine(); // Consume la nueva línea
                    System.out.print("Ingrese el nombre del producto al que desea agregar stock: ");
                    String productoAgregarStock = scanner.nextLine();
                    System.out.print("Ingrese la cantidad a agregar: ");
                    int cantidadAgregar = scanner.nextInt();
                    registro.agregarStock(productoAgregarStock, cantidadAgregar);
                    break;
                case 8:
                    scanner.nextLine(); // Consume la nueva línea
                    System.out.print("Ingrese el nombre del producto al que desea eliminar stock: ");
                    String productoEliminarStock = scanner.nextLine();
                    System.out.print("Ingrese la cantidad a eliminar: ");
                    int cantidadEliminar = scanner.nextInt();
                    registro.eliminarStock(productoEliminarStock, cantidadEliminar);
                    break;
                case 9:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }

        scanner.close();
    }
}