package POO.EjercicioFacturacion.Dominio;

import java.time.LocalDateTime;

public class FacturaConIva extends Factura{

    private int iva;

    public FacturaConIva(int numero, long valor, LocalDateTime fecha, int iva) {
        super(numero, valor, fecha);
        this.iva = iva;
    }

    @Override
    public long calcularTotal() {
        return getValor() + (getValor() * getIva() / 100);
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

}
