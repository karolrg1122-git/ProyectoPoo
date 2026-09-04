public class JuegoPremio extends Atraccion {
    private String tipoJuego;
    private long cantidadPremios;
    private float costoPremio;
    private char dificultad;

    // Constructor 1
    public JuegoPremio(String nombre) {
        super(nombre);
        this.tipoJuego = "Tiro al blanco";
        this.cantidadPremios = 50;
        this.costoPremio = 5.000f;
        this.dificultad = 'M';
    }

    // Constructor 2
    public JuegoPremio(String nombre, int capacidad, double precio) {
        super(nombre, capacidad, precio);
        this.tipoJuego = "Pesca de patitos";
        this.cantidadPremios = 70;
        this.costoPremio = 7.000f;
        this.dificultad = 'F';
    }

    // Constructor 3
    public JuegoPremio(String nombre, int capacidad, double precio, boolean disponible, String tipoJuego, long cantidadPremios, float costoPremio, char dificultad) {
        super(nombre, capacidad, precio, disponible);
        this.tipoJuego = tipoJuego;
        this.cantidadPremios = cantidadPremios;
        this.costoPremio = costoPremio;
        this.dificultad = dificultad;
    }

    public String getTipoJuego() {
        return tipoJuego;
    }

    public long getCantidadPremios() {
        return cantidadPremios;
    }

    public float getCostoPremio() {
        return costoPremio;
    }

    public char getDificultad() {
        return dificultad;
    }

    public void setTipoJuego(String tipoJuego) {
        this.tipoJuego = tipoJuego;
    }

    public void setCantidadPremios(long cantidadPremios) {
        this.cantidadPremios = cantidadPremios;
    }

    public void setCostoPremio(float costoPremio) {
        this.costoPremio = costoPremio;
    }

    public void setDificultad(char dificultad) {
        this.dificultad = dificultad;
    }

    // toString
    @Override
    public String toString() {
        return "JuegoPremio{" + "  nombre=" + getNombre() + ", capacidad=" + getCapacidad() + ", precio=" + getPrecio() + ", disponible=" + isDisponible() + ", tipoJuego='" + tipoJuego + ", cantidadPremios=" + cantidadPremios + ", costoPremio=" + costoPremio + ", dificultad=" + dificultad + "  }";
    }
}
