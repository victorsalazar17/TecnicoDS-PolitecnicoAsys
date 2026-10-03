package POO.Herencia.Vehiculos.Dominio;

public class Avion  extends Vehiculo{

    private String tipoAvion;
    private int numeroMotores;
    private double altitudMaxima;
    private boolean tienePilotoAutomatico;
    private String tipoDeUso;

    public Avion(String marca, String modelo, int fabricactionYear, String tipoAvion, int numeroMotores, double altitudMaxima, boolean tienePilotoAutomatico, String tipoDeUso) {
        super(marca, modelo, fabricactionYear);
        this.tipoAvion = tipoAvion;
        this.numeroMotores = numeroMotores;
        this.altitudMaxima = altitudMaxima;
        this.tienePilotoAutomatico = tienePilotoAutomatico;
        this.tipoDeUso = tipoDeUso;
    }

    public Avion(double velocidad, double precio, String color, int capacidadPasajeros, String tipoAvion, int numeroMotores, double altitudMaxima, boolean tienePilotoAutomatico, String tipoDeUso) {
        super(velocidad, precio, color, capacidadPasajeros);
        this.tipoAvion = tipoAvion;
        this.numeroMotores = numeroMotores;
        this.altitudMaxima = altitudMaxima;
        this.tienePilotoAutomatico = tienePilotoAutomatico;
        this.tipoDeUso = tipoDeUso;
    }

    public void despegar(){
        System.out.println("El avion esta en la pista preparandose para el despegue.");
        for (int i = 0; i < 500; i++){
            super.acelerar();
        }
        System.out.println("¡Despegue exitoso! El avión ha volado. Velocidad actual: " + super.getVelocidad() + " km/h, Altitud máxima: " + this.altitudMaxima + " metros.");
    }

    public void gestionarPilotoAutomatico(){
        if(tienePilotoAutomatico){
            System.out.println("Piloto automatico activado");
        } else{
            System.out.println("Este avión no cuenta con piloto automático o está desactivado");
        }
    }

    public void aterrizar(){
        System.out.println("Iniciando descenso y aproximacion a la pista...");
        int pasosTotales = 5;
        for(int i = pasosTotales; i > 0; i--){
            super.desacelerar();
            System.out.println("Faltan " + i + " pasos para detenernos por completo");
        }
        System.out.println("Aterrizaje completado con éxito! El avión se ha detenido.");
    }

    public String getTipoAvion() {
        return tipoAvion;
    }

    public void setTipoAvion(String tipoAvion) {
        this.tipoAvion = tipoAvion;
    }

    public int getNumeroMotores() {
        return numeroMotores;
    }

    public void setNumeroMotores(int numeroMotores) {
        this.numeroMotores = numeroMotores;
    }

    public double getAltitudMaxima() {
        return altitudMaxima;
    }

    public void setAltitudMaxima(double altitudMaxima) {
        this.altitudMaxima = altitudMaxima;
    }

    public boolean isTienePilotoAutomatico() {
        return tienePilotoAutomatico;
    }

    public void setTienePilotoAutomatico(boolean tienePilotoAutomatico) {
        this.tienePilotoAutomatico = tienePilotoAutomatico;
    }

    public String getTipoDeUso() {
        return tipoDeUso;
    }

    public void setTipoDeUso(String tipoDeUso) {
        this.tipoDeUso = tipoDeUso;
    }
}
