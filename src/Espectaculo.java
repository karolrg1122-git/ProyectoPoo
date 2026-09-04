public class Espectaculo extends Atraccion {
    private String artistaPrincipal;
    private short duracionMinutos;
    private boolean tieneMusica;
    private char categoria;

    // Constructor 1
    public Espectaculo(String nombre) {
        super(nombre);

        this.artistaPrincipal = "Grupo Fantasia";
        this.duracionMinutos = 30;
        this.tieneMusica = true;
        this.categoria = 'M';
    }

    // Constructor 2
    public Espectaculo(String nombre, int capacidad, double precio) {
        super(nombre, capacidad, precio);

        this.artistaPrincipal = "Magico Show";
        this.duracionMinutos = 45;
        this.tieneMusica = true;
        this.categoria = 'A';
    }

    // Constructor 3
    public Espectaculo(String nombre, int capacidad, double precio, boolean disponible, String artistaPrincipal, short duracionMinutos, boolean tieneMusica, char categoria) {
        super(nombre, capacidad, precio, disponible);

        this.artistaPrincipal = artistaPrincipal;
        this.duracionMinutos = duracionMinutos;
        this.tieneMusica = tieneMusica;
        this.categoria = categoria;
    }

    public String getArtistaPrincipal() {
        return artistaPrincipal;
    }

    public short getDuracionMinutos() {
        return duracionMinutos;
    }

    public boolean isTieneMusica() {
        return tieneMusica;
    }

    public char getCategoria() {
        return categoria;
    }

    public void setArtistaPrincipal(String artistaPrincipal) {
        this.artistaPrincipal = artistaPrincipal;
    }

    public void setDuracionMinutos(short duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public void setTieneMusica(boolean tieneMusica) {
        this.tieneMusica = tieneMusica;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    // toString
    @Override
    public String toString() {
        return "Espectaculo{" + " nombre='" + getNombre() + ", capacidad=" + getCapacidad() + ", precio=" + getPrecio() + ", disponible=" + isDisponible() + ", artistaPrincipal=" + artistaPrincipal + ", duracionMinutos=" + duracionMinutos + ", tieneMusica=" + tieneMusica + ", categoria=" + categoria + "  }";
    }
}
