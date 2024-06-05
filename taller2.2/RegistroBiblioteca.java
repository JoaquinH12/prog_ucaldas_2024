import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
class RegistroBiblioteca {
    private List<Libro> libros = new ArrayList<>();
    private List<Autor> autores = new ArrayList<>();

    public void registrarLibro(Libro libro) {
        libros.add(libro);
    }

    public void registrarAutor(Autor autor) {
        autores.add(autor);
    }

    public void listarLibros() {
        libros.forEach(libro -> System.out.println(libro));
    }

    public List<Libro> buscarLibros(String filtro) {
        List<Libro> resultados = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getTitulo().contains(filtro) || libro.getIsbn().contains(filtro)
                    || libro.getAutor().getNombre().contains(filtro) || libro.getCategoria().contains(filtro)) {
                resultados.add(libro);
            }
        }
        return resultados;
    }

    public void prestarLibro(Libro libro, int cantidad) {
        libro.prestarEjemplar(cantidad);
    }

    public void devolverLibro(Libro libro) {
        libro.devolverEjemplar();
    }

    public void guardarDatos() {
        try (PrintWriter writer = new PrintWriter("biblioteca.txt")) {
            for (Libro libro : libros) {
                writer.println(libro.getTitulo() + "," + libro.getAutor().getNombre() + ","
                        + libro.getAutor().getNacionalidad() + "," + libro.getIsbn() + "," + libro.getCategoria() + ","
                        + libro.getEjemplares() + "," + libro.getEjemplaresPrestados());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void cargarDatos() {
        try (Scanner scanner = new Scanner(new File("biblioteca.txt"))) {
            while (scanner.hasNextLine()) {
                String[] datos = scanner.nextLine().split(",");
                Autor autor = new Autor(datos[1], datos[2]);
                Libro libro = new Libro(datos[0], autor, datos[3], datos[4], Integer.parseInt(datos[5]));
                libro.prestarEjemplar(Integer.parseInt(datos[6]));
                libros.add(libro);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void listarLibrosAZ() {
        List<Libro> copiaLibros = new ArrayList<>(libros);
        copiaLibros.sort(Comparator.comparing(Libro::getTitulo));
        copiaLibros.forEach(libro -> System.out.println(libro));
    }

    public void listarLibrosPorEjemplares() {
        List<Libro> copiaLibros = new ArrayList<>(libros);
        copiaLibros.sort(Comparator.comparingInt(Libro::getEjemplares).reversed());
        copiaLibros.forEach(libro -> System.out.println(libro));
    }

    public boolean hayLibrosEnPrestamo() {
        for (Libro libro : libros) {
            if (libro.getEjemplaresPrestados() > 0) {
                return true;
            }
        }
        return false;
    }
}
