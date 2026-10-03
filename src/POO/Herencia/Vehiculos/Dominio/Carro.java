package POO.Herencia.Vehiculos.Dominio;

public class Carro  extends Vehiculo{
    private int numPuertas;
    private String placa;
    private String tipoTransmision;
    private int kilometraje;
    private String tipoCombustion;
    private boolean tieneAireAcondicionado;

    public Carro(String marca, String modelo, int fabricactionYear, int numPuertas, String placa, String tipoTransmision, int kilometraje, String tipoCombustion,  boolean tieneAireAcondicionado) {
        super(marca, modelo, fabricactionYear);
        this.numPuertas = numPuertas;
        this.placa = placa;
        this.tipoTransmision = tipoTransmision;
        this.kilometraje = kilometraje;
        this.tipoCombustion = tipoCombustion;
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }
    public void encenderAire(){
        if (this.tieneAireAcondicionado){
            System.out.println("Aire encendido");
        }else{
            System.out.println("Este carro no tiene aire acondicionado");
        }
    }
    public void abrirMaletero(){
        System.out.println("El maletero se ha abierto correctamente");

    }
    public void acelerarFuerte(){
        for (int i = 0; i < 120; i++){
            super.acelerar();
        }
        System.out.println("El carro ha pisado el acelerador a fondo, Velocidad actual: " + super.getVelocidad() + " km/h");
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipoTransmision() {
        return tipoTransmision;
    }

    public void setTipoTransmision(String tipoTransmision) {
        this.tipoTransmision = tipoTransmision;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getTipoCombustion() {
        return tipoCombustion;
    }

    public void setTipoCombustion(String tipoCombustion) {
        this.tipoCombustion = tipoCombustion;
    }

    public boolean isTieneAireAcondicionado() {
        return tieneAireAcondicionado;
    }

    public void setTieneAireAcondicionado(boolean tieneAireAcondicionado) {
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }
}
