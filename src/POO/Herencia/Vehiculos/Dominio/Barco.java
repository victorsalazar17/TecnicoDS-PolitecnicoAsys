package POO.Herencia.Vehiculos.Dominio;

public class Barco  extends  Vehiculo{

    private String tipoBarco;
    private double largo;
    private double ancho;
    private double capacidadCarga;
    private boolean tieneGPS;

    public Barco(double velocidad, double precio, String color, int capacidadPasajeros, String tipoBarco, double largo, double ancho, double capacidadCarga, boolean tieneGPS) {
        super(velocidad, precio, color, capacidadPasajeros);
        this.tipoBarco = tipoBarco;
        this.largo = largo;
        this.ancho = ancho;
        this.capacidadCarga = capacidadCarga;
        this.tieneGPS = tieneGPS;
    }

    public void zarpar(){
        System.out.println("El " + this.tipoBarco + " ha zarpado del muelle");
        for (int i = 0; i < 8; i++){
            super.acelerar();
        }
        System.out.println("El " + this.tipoBarco + " ha comenzado a moverse. Velocidad actual: " + super.getVelocidad() + " km/h");

    }

    public void anclar(){
        super.desacelerar();
        System.out.println("Se ha tirado el ancla, el barco se ha detenido con exito.");
    }

    public void navegacionFull(){
        for (int i = 0; i < 40; i++){
            super.acelerar();
        }
        System.out.println("El barco va navegando a toda velocidad, la velocidad actual es de: " + super.getVelocidad() + " km/h");
    }

    public String getTipoBarco() {
        return tipoBarco;
    }

    public void setTipoBarco(String tipoBarco) {
        this.tipoBarco = tipoBarco;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public boolean isTieneGPS() {
        return tieneGPS;
    }

    public void setTieneGPS(boolean tieneGPS) {
        this.tieneGPS = tieneGPS;
    }
}
