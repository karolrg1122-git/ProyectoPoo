public class MontanaRusa extends Atraccion {
    private int alturaMaxima;
    private double velocidadMaxima;
    private boolean tieneLoop;
    private char nivelEmocion;

    // Constructor 1
    public MontanaRusa(String nombre) {
        super(nombre);
        this.alturaMaxima = 30;
        this.velocidadMaxima = 80.5;
        this.tieneLoop = false;
        this.nivelEmocion = 'M';
    }

    // Constructor 2
    public MontanaRusa(String nombre, int capacidad, double precio) {
        super(nombre, capacidad, precio);
        this.alturaMaxima = 40;
        this.velocidadMaxima = 100.0;
        this.tieneLoop = true;
        this.nivelEmocion = 'E';
    }

    // Constructor 3
    public MontanaRusa(String nombre, int capacidad, double precio, boolean disponible, int alturaMaxima, double velocidadMaxima, boolean tieneLoop, char nivelEmocion) {
        super(nombre, capacidad, precio, disponible);
        this.alturaMaxima = alturaMaxima;
        this.velocidadMaxima = velocidadMaxima;
        this.tieneLoop = tieneLoop;
        this.nivelEmocion = nivelEmocion;
    }

    public int getAlturaMaxima() {
        return alturaMaxima;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public boolean isTieneLoop() {
        return tieneLoop;
    }

    public char getNivelEmocion() {
        return nivelEmocion;
    }

    public void setAlturaMaxima(int alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public void setTieneLoop(boolean tieneLoop) {
        this.tieneLoop = tieneLoop;
    }

    public void setNivelEmocion(char nivelEmocion) {
        this.nivelEmocion = nivelEmocion;
    }

    // toString
    @Override
    public String toString() {
        return "MontanaRusa{" + " nombre=" + getNombre() + ", capacidad=" + getCapacidad() + ", precio=" + getPrecio() + ", disponible=" + isDisponible() + ", alturaMaxima=" + alturaMaxima + ", velocidadMaxima=" + velocidadMaxima + ", tieneLoop=" + tieneLoop + ", nivelEmocion=" + nivelEmocion + "  }";
    }
}
