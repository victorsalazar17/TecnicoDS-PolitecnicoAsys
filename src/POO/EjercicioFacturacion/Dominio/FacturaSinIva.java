package POO.EjercicioFacturacion.Dominio;

import java.time.LocalDateTime;

public class FacturaSinIva  extends Factura{

    public FacturaSinIva(int numero, long valor, LocalDateTime fecha) {
        super(numero, valor, fecha);
    }

    @Override
    public long calcularTotal() {
        return getValor();
    }
}
