package POO.Herencia.Vehiculos.Dominio;

public class Motocicleta extends Vehiculo {

    private String placa;
    private int cilindraje;
    private String tipoTransmision;
    private String tipoFrenos;
    private double torque;
    private double caballosPotencia;
    private String estilo;

    public Motocicleta(String marca, String modelo, int fabricactionYear, String placa, int cilindraje, String tipoTransmision, String tipoFrenos, double torque, double caballosPotencia, String estilo) {
        super(marca, modelo, fabricactionYear);
        this.placa = placa;
        this.cilindraje = cilindraje;
        this.tipoTransmision = tipoTransmision;
        this.tipoFrenos = tipoFrenos;
        this.torque = torque;
        this.caballosPotencia = caballosPotencia;
        this.estilo = estilo;
    }

    public void picarMoto(){
        System.out.println("¡Has picado la moto! Eres una bestia!!.");
    }
    public void tocarClaxon(){
        System.out.println("¡Pip pip! Permiso pues que voy es pasando dando visaje");
    }
    public void acelerarFuerte(){
        for (int i = 0; i < 185; i++){
            super.acelerar();
        }
        System.out.println("¡Voy es volando mi papacho!! voy a: " + super.getVelocidad() + " km/h");
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getTipoTransmision() {
        return tipoTransmision;
    }

    public void setTipoTransmision(String tipoTransmision) {
        this.tipoTransmision = tipoTransmision;
    }

    public String getTipoFrenos() {
        return tipoFrenos;
    }

    public void setTipoFrenos(String tipoFrenos) {
        this.tipoFrenos = tipoFrenos;
    }

    public double getTorque() {
        return torque;
    }

    public void setTorque(double torque) {
        this.torque = torque;
    }

    public double getCaballosPotencia() {
        return caballosPotencia;
    }

    public void setCaballosPotencia(double caballosPotencia) {
        this.caballosPotencia = caballosPotencia;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }
}
