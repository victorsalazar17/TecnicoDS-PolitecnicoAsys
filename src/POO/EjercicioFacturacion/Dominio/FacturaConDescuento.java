package POO.EjercicioFacturacion.Dominio;

import java.time.LocalDateTime;

public class FacturaConDescuento extends FacturaSinIva {

    private int porcentajeDescuento;

    public FacturaConDescuento(int numero, long valor, LocalDateTime fecha, int porcDescuento) {
        super(numero, valor, fecha);
        this.porcentajeDescuento = porcDescuento;
    }

    @Override
    public long calcularTotal() {
        return getValor() - (getValor() * getPorcentajeDescuento() / 100);
    }

    public int getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(int porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }
}
