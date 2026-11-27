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
}