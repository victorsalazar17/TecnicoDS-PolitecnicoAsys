package POO.Herencia.Vehiculos.Dominio;

public class Bicicleta  extends Vehiculo{

    private String tipoBicicleta;
    private String materialMarco;
    private double tamanoRueda;
    private double peso;
    private int numeroVelocidades;

    public Bicicleta(String marca, String modelo, int fabricactionYear, String tipoBicicleta, String materialMarco, double tamanoRueda, double peso, int numeroVelocidades) {
        super(marca, modelo, fabricactionYear);
        this.tipoBicicleta = tipoBicicleta;
        this.materialMarco = materialMarco;
        this.tamanoRueda = tamanoRueda;
        this.peso = peso;
        this.numeroVelocidades = numeroVelocidades;
    }
    public void pedalear(){
        for(int i = 0; i < 40; i++){
            super.acelerar();
        }
        System.out.println("Estás pedaleando con berraquera! Velocidad actual de la bicicleta: " + super.getVelocidad() + " km/h");
    }
    public void frenar(){
        super.desacelerar();
        System.out.println("Has aplicado los frenos correctamente, mucha flor.");
    }
    public void hacerTruco(){
        System.out.println("¡Impresionante, que truco tan bacano mi papacho");
    }

    public String getTipoBicicleta() {
        return tipoBicicleta;
    }

    public void setTipoBicicleta(String tipoBicicleta) {
        this.tipoBicicleta = tipoBicicleta;
    }

    public String getMaterialMarco() {
        return materialMarco;
    }

    public void setMaterialMarco(String materialMarco) {
        this.materialMarco = materialMarco;
    }

    public double getTamanoRueda() {
        return tamanoRueda;
    }

    public void setTamanoRueda(double tamanoRueda) {
        this.tamanoRueda = tamanoRueda;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getNumeroVelocidades() {
        return numeroVelocidades;
    }

    public void setNumeroVelocidades(int numeroVelocidades) {
        this.numeroVelocidades = numeroVelocidades;
    }
}
