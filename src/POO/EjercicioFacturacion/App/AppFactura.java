package POO.EjercicioFacturacion.App;

import POO.EjercicioFacturacion.Dominio.*;
import java.util.List;
import java.util.Arrays;
import java.time.LocalDateTime;

public class AppFactura {

    public static void main(String[] args) {

        // 5 facturas con IVA
        Factura facturaConIva1 = new FacturaConIva(1, 100000, LocalDateTime.of(2026, 1, 10, 10, 0), 19);
        Factura facturaConIva2 = new FacturaConIva(2, 20100, LocalDateTime.of(2026, 1, 12, 11, 30), 19);
        Factura facturaConIva3 = new FacturaConIva(3, 15350, LocalDateTime.of(2026, 2, 5, 9, 15), 19);
        Factura facturaConIva4 = new FacturaConIva(4, 37000, LocalDateTime.of(2026, 2, 18, 14, 0), 19);
        Factura facturaConIva5 = new FacturaConIva(5, 2600, LocalDateTime.of(2026, 3, 2, 16, 45), 19);

        // 5 facturas sin IVA
        Factura facturaSinIva1 = new FacturaSinIva(6, 110000, LocalDateTime.of(2026, 3, 5, 8, 0));
        Factura facturaSinIva2 = new FacturaSinIva(7, 25900, LocalDateTime.of(2026, 3, 8, 10, 30));
        Factura facturaSinIva3 = new FacturaSinIva(8, 15000, LocalDateTime.of(2026, 4, 1, 12, 0));
        Factura facturaSinIva4 = new FacturaSinIva(9, 3700, LocalDateTime.of(2026, 4, 10, 15, 15));
        Factura facturaSinIva5 = new FacturaSinIva(10, 25000, LocalDateTime.of(2026, 4, 20, 17, 0));

        // 5 facturas con descuento
        Factura facturaConDescuento1 = new FacturaConDescuento(11, 57500, LocalDateTime.of(2026, 5, 1, 9, 0), 10);
        Factura facturaConDescuento2 = new FacturaConDescuento(12, 62800, LocalDateTime.of(2026, 5, 5, 10, 0), 15);
        Factura facturaConDescuento3 = new FacturaConDescuento(13, 1500, LocalDateTime.of(2026, 5, 12, 11, 30), 5);
        Factura facturaConDescuento4 = new FacturaConDescuento(14, 32500, LocalDateTime.of(2026, 5, 20, 14, 0), 20);
        Factura facturaConDescuento5 = new FacturaConDescuento(15, 25000, LocalDateTime.of(2026, 5, 25, 16, 30), 10);

        // 5 facturas con IVA del 12 %
        Factura facturaConIva12_1 = new FacturaConIva12(16, 10000, LocalDateTime.of(2026, 6, 1, 8, 30), 12);
        Factura facturaConIva12_2 = new FacturaConIva12(17, 22900, LocalDateTime.of(2026, 6, 4, 10, 0), 12);
        Factura facturaConIva12_3 = new FacturaConIva12(18, 38400, LocalDateTime.of(2026, 6, 10, 13, 15), 12);
        Factura facturaConIva12_4 = new FacturaConIva12(19, 78000, LocalDateTime.of(2026, 6, 15, 15, 0), 12);
        Factura facturaConIva12_5 = new FacturaConIva12(20, 79900, LocalDateTime.of(2026, 6, 25, 17, 30), 12);

        // 5 facturas con IVA y descuento
        Factura facturaConIvaYDescuento1 = new FacturaConIvaYDescuento(21, 50000, LocalDateTime.of(2026, 7, 2, 9, 0), 19, 10);
        Factura facturaConIvaYDescuento2 = new FacturaConIvaYDescuento(22, 200000, LocalDateTime.of(2026, 7, 8, 10, 30), 19, 15);
        Factura facturaConIvaYDescuento3 = new FacturaConIvaYDescuento(23, 15200, LocalDateTime.of(2026, 7, 14, 12, 0), 19, 5);
        Factura facturaConIvaYDescuento4 = new FacturaConIvaYDescuento(24, 89900, LocalDateTime.of(2026, 7, 20, 14, 45), 19, 20);
        Factura facturaConIvaYDescuento5 = new FacturaConIvaYDescuento(25, 38750, LocalDateTime.of(2026, 7, 28, 16, 0), 19, 10);

        // Lista de todas las facturas
        List<Factura> listaFacturas = Arrays.asList(
                facturaConIva1, facturaConIva2, facturaConIva3, facturaConIva4, facturaConIva5,
                facturaSinIva1, facturaSinIva2, facturaSinIva3, facturaSinIva4, facturaSinIva5,
                facturaConDescuento1, facturaConDescuento2, facturaConDescuento3, facturaConDescuento4, facturaConDescuento5,
                facturaConIva12_1, facturaConIva12_2, facturaConIva12_3, facturaConIva12_4, facturaConIva12_5,
                facturaConIvaYDescuento1, facturaConIvaYDescuento2, facturaConIvaYDescuento3, facturaConIvaYDescuento4, facturaConIvaYDescuento5
        );

        Facturacion facturacion = new Facturacion(listaFacturas);
        facturacion.mostrarTotal();
    }
}
