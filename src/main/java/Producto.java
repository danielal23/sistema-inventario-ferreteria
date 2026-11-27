
public class Producto {

    private int id;
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(int id, String nombre, double precio, int cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void actualizarCantidad(int cantidad) {
        if (cantidad < 0) {
            throw new IllegalArgumentException("La cantidad no puede ser negativa.");
        }

        this.cantidad = cantidad;
    }

    public void mostrarInformacion() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Cantidad disponible: " + cantidad);
    }

    public void registrarEntrada(int cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La entrada debe ser mayor que cero.");
        }

        this.cantidad += cantidad;
    }

    public void registrarSalida(int cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La salida debe ser mayor que cero.");
        }

        if (cantidad > this.cantidad) {
            throw new IllegalArgumentException("No hay suficiente inventario.");
        }

        this.cantidad -= cantidad;
    }
}
