public class Caja {
    public String nombre;
    public int tiempoDeAtencion;

    public Caja(String nombre, int tiempoDeAtencion) {
        this.nombre = nombre;
        this.tiempoDeAtencion = tiempoDeAtencion;
    }

    public String nombreCaja() {
        return nombre;
    }

    public int getTiempoDeAtencion() {
        return tiempoDeAtencion;
    }

}
