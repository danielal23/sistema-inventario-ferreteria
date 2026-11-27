
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductoTest {

    @Test
    public void probarRegistroProducto() {
        Producto producto = new Producto(1, "Martillo", 150.0, 10);

        assertEquals(1, producto.getId());
        assertEquals("Martillo", producto.getNombre());
        assertEquals(150.0, producto.getPrecio());
        assertEquals(10, producto.getCantidad());
    }

    @Test
    public void probarActualizacionInventario() {
        Producto producto = new Producto(2, "Desarmador", 80.0, 5);

        producto.actualizarCantidad(15);

        assertEquals(15, producto.getCantidad());
    }

    @Test
    public void probarConsultaProducto() {
        Producto producto = new Producto(3, "Taladro", 850.0, 7);

        assertEquals(3, producto.getId());
        assertEquals("Taladro", producto.getNombre());
        assertEquals(850.0, producto.getPrecio());
        assertEquals(7, producto.getCantidad());
    }

    @Test
    public void probarCantidadNegativa() {
        Producto producto = new Producto(4, "Pinzas", 100.0, 5);

        assertThrows(IllegalArgumentException.class, () -> {
            producto.actualizarCantidad(-3);
        });

        assertEquals(5, producto.getCantidad());
    }

    @Test
    public void probarRegistroEntrada() {
        Producto producto = new Producto(5, "Martillo", 150.0, 10);

        producto.registrarEntrada(5);

        assertEquals(15, producto.getCantidad());
    }

    @Test
    public void probarRegistroSalida() {
        Producto producto = new Producto(6, "Desarmador", 80.0, 10);

        producto.registrarSalida(3);

        assertEquals(7, producto.getCantidad());
    }

    @Test
    public void probarSalidaSinInventarioSuficiente() {
        Producto producto = new Producto(7, "Taladro", 850.0, 5);

        assertThrows(IllegalArgumentException.class, () -> {
            producto.registrarSalida(10);
        });

        assertEquals(5, producto.getCantidad());
    }
}
