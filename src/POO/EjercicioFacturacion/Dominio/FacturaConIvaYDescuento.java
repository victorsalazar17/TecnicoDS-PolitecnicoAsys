package POO.EjercicioFacturacion.Dominio;

import java.time.LocalDateTime;

public class FacturaConIvaYDescuento extends FacturaConIva{

    private int porcentajeDescuento;

    public FacturaConIvaYDescuento(int numero, long valor, LocalDateTime fecha, int iva, int porcDescuento) {
        super(numero, valor, fecha, iva);
        this.porcentajeDescuento = porcDescuento;
    }

    @Override
    public long calcularTotal() {
        long totalConIva = super.calcularTotal();
        return totalConIva - (totalConIva * getPorcentajeDescuento() / 100);
    }

    public int getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(int porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }
}
