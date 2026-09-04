public class Atraccion {
    private String nombre;
    private int capacidad;
    private double precio;
    private boolean disponible;

    //constructor 1
    public Atraccion(String nombre) {
        this(nombre, 20, 15.000, true);
    }

    // Constructor 2
    public Atraccion(String nombre, int capacidad, double precio) {
        this(nombre, capacidad, precio, true);
    }

    // Constructor 3
    public Atraccion(String nombre, int capacidad, double precio, boolean disponible) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.precio = precio;
        this.disponible = disponible;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // toString
    @Override
    public String toString() {
        return "Atraccion { " + " nombre=" + nombre + ", capacidad=" + capacidad + ", precio=" + precio + ", disponible=" + disponible + "  }";
    }
}
