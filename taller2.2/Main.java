import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RegistroBiblioteca registro = new RegistroBiblioteca();
        registro.cargarDatos();

        int opcion = 0;

        while (opcion != 8) {
            System.out.println("\nMenú");
            System.out.println("1. Registrar libro");
            System.out.println("2. Registrar autor");
            System.out.println("3. Listar libros");
            System.out.println("4. Buscar libros");
            System.out.println("5. Listar libros de A a Z");
            System.out.println("6. Listar libros por ejemplares (mayor a menor)");
            System.out.println("7. Prestar libro");
            System.out.println("8. Devolver libro");
            System.out.println("9. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el título del libro: ");
                    String tituloLibro = scanner.nextLine();
                    System.out.print("Ingrese el nombre del autor: ");
                    String nombreAutor = scanner.nextLine();
                    System.out.print("Ingrese la nacionalidad del autor: ");
                    String nacionalidadAutor = scanner.nextLine();
                    Autor autor = new Autor(nombreAutor, nacionalidadAutor);
                    System.out.print("Ingrese el ISBN del libro: ");
                    String isbn = scanner.nextLine();
                    System.out.print("Ingrese la categoría del libro: ");
                    String categoria = scanner.nextLine();
                    System.out.print("Ingrese la cantidad de ejemplares: ");
                    int ejemplares = scanner.nextInt();
                    Libro libro = new Libro(tituloLibro, autor, isbn, categoria, ejemplares);
                    registro.registrarLibro(libro);
                    registro.guardarDatos(); // Guardar datos en el archivo
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del autor: ");
                    String nombreAutor2 = scanner.nextLine();
                    System.out.print("Ingrese la nacionalidad del autor: ");
                    String nacionalidadAutor2 = scanner.nextLine();
                    Autor autor2 = new Autor(nombreAutor2, nacionalidadAutor2);
                    registro.registrarAutor(autor2);
                    registro.guardarDatos(); // Guardar datos en el archivo
                    break;
                case 3:
                    registro.listarLibros();
                    break;
                case 4:
                    System.out.print("Ingrese el filtro de búsqueda: ");
                    String filtro = scanner.nextLine();
                    List<Libro> resultados = registro.buscarLibros(filtro);
                    resultados.forEach(System.out::println);
                    break;
                case 5:
                    registro.listarLibrosAZ();
                    break;
                case 6:
                    registro.listarLibrosPorEjemplares();
                    break;
                case 7:
                    if (registro.hayLibrosEnPrestamo()) {
                        System.out.println("Hay libros en préstamo.");
                    } else {
                        System.out.print("Ingrese el título del libro a prestar: ");
                        String tituloPrestamo = scanner.nextLine();
                        Libro libroPrestamo = registro.buscarLibros(tituloPrestamo).get(0);
                        System.out.print("Ingrese la cantidad de ejemplares a prestar: ");
                        int cantidadPrestamo = scanner.nextInt();
                        registro.prestarLibro(libroPrestamo, cantidadPrestamo);
                        registro.guardarDatos(); // Guardar datos en el archivo
                    }
                    break;
                case 8:
                    System.out.print("Ingrese el título del libro a devolver: ");
                    String tituloDevolucion = scanner.nextLine();
                    Libro libroDevolucion = registro.buscarLibros(tituloDevolucion).get(0);
                    registro.devolverLibro(libroDevolucion);
                    registro.guardarDatos(); // Guardar datos en el archivo
                    break;
                case 9:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }
        }

        scanner.close();
    }
}