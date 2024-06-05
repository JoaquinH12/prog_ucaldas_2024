import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;


public class RegistroInventario {
    private List<Producto> productos;
    private List<Categoria> categorias;
    private static final String FILENAME = "productos.txt";

    public RegistroInventario() {
        this.productos = new ArrayList<>();
        this.categorias = new ArrayList<>();
        cargarDatos();
    }

    private void cargarDatos() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String nombre = parts[0];
                String nombreCategoria = parts[1];
                double precio = Double.parseDouble(parts[2]);
                int stock = Integer.parseInt(parts[3]);
                Categoria categoria = new Categoria(nombreCategoria, "");
                productos.add(new Producto(nombre, categoria, precio, stock));
                if (!categorias.contains(categoria)) {
                    categorias.add(categoria);
                }
            }
        } catch (IOException e) {
            System.out.println("No se pudo cargar el archivo de datos.");
        }
    }

    private void guardarDatos() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME))) {
            for (Producto producto : productos) {
                bw.write(producto.toFileString());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("No se pudo guardar el archivo de datos.");
        }
    }

    public void registrarProducto(Producto producto) {
        productos.add(producto);
        if (!categorias.contains(producto.getCategoria())) {
            categorias.add(producto.getCategoria());
        }
        guardarDatos();
    }

    public void listarProductos() {
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

    public void listarProductosPorStock() {
        productos.sort(Comparator.comparingInt(Producto::getStock).reversed());
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

    public void listarProductosPorCategoria(String nombreCategoria) {
        for (Producto producto : productos) {
            if (producto.getCategoria().getNombre().equalsIgnoreCase(nombreCategoria)) {
                System.out.println(producto);
            }
        }
    }

    public void listarProductosOrdenadosPorNombre() {
        productos.sort(Comparator.comparing(Producto::getNombre));
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

    public void eliminarProducto(String nombreProducto) {
        Iterator<Producto> iter = productos.iterator();
        while (iter.hasNext()) {
            Producto producto = iter.next();
            if (producto.getNombre().equalsIgnoreCase(nombreProducto)) {
                iter.remove();
                break;
            }
        }
        guardarDatos();
    }

    public void agregarStock(String nombreProducto, int cantidad) {
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombreProducto)) {
                int stockActual = producto.getStock();
                producto.setStock(stockActual + cantidad);
                break;
            }
        }
        guardarDatos();
    }

    public void eliminarStock(String nombreProducto, int cantidad) {
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombreProducto)) {
                int stockActual = producto.getStock();
                producto.setStock(Math.max(0, stockActual - cantidad));
                break;
            }
        }
        guardarDatos();
    }

    
}