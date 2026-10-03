package POO.Herencia.Vehiculos.Dominio;

public class Taxi  extends Vehiculo{

    private String placa;
    private String numeroLicencia;
    private double tarifaPorKilometro;
    private boolean taximetroEncendido;
    private String empresaAfiliada;

    public Taxi(double velocidad, double precio, String color, int capacidadPasajeros, String placa, String numeroLicencia, double tarifaPorKilometro, boolean taximetroEncendido, String empresaAfiliada) {
        super(velocidad, precio, color, capacidadPasajeros);
        this.placa = placa;
        this.numeroLicencia = numeroLicencia;
        this.tarifaPorKilometro = tarifaPorKilometro;
        this.taximetroEncendido = taximetroEncendido;
        this.empresaAfiliada = empresaAfiliada;
    }

    public void cambiarEstadoTaximetro(){
        if (!taximetroEncendido){
            taximetroEncendido = true;
            System.out.println("Taximetro encendido");
        } else{
            taximetroEncendido = false;
            System.out.println("El taximetro se ha apagado");
        }
    }
    public void cobrarCarrera(double kilometrosRecorridos){
        double totalPagar = kilometrosRecorridos * tarifaPorKilometro;
        System.out.println("Carrera finalizada. Total de pagar: $ "+totalPagar);
    }
    public void acelearBuscandoClientes(){
        for (int i = 0; i < 30; i++){
            super.acelerar();
        }
        System.out.println("El taxi acelera buscando clientes. Velocidad actual: " + super.getVelocidad() + " km/h");
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNumeroLicencia() {
        return numeroLicencia;
    }

    public void setNumeroLicencia(String numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }

    public double getTarifaPorKilometro() {
        return tarifaPorKilometro;
    }

    public void setTarifaPorKilometro(double tarifaPorKilometro) {
        this.tarifaPorKilometro = tarifaPorKilometro;
    }

    public boolean isTaximetroEncendido() {
        return taximetroEncendido;
    }

    public void setTaximetroEncendido(boolean taximetroEncendido) {
        this.taximetroEncendido = taximetroEncendido;
    }

    public String getEmpresaAfiliada() {
        return empresaAfiliada;
    }

    public void setEmpresaAfiliada(String empresaAfiliada) {
        this.empresaAfiliada = empresaAfiliada;
    }
}
