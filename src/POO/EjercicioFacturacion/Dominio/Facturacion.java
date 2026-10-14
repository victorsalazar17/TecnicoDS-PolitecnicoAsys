package POO.EjercicioFacturacion.Dominio;

import java.util.List;

public class Facturacion {

    private List<Factura> facturas;

    public Facturacion(List<Factura> facturas) {
        this.facturas = facturas;
    }

    public void mostrarTotal(){
        System.out.println(" LISTA DE TODAS LAS FACTURAS ");

        long valorTotalFacturas = 0;


        for (Factura factura : facturas) {
            System.out.println("Factura #" + factura.getNumero()
                    + ". | Valor inical: $ " + factura.getValor()
                    + ". | Total: $ " + factura.calcularTotal());

            valorTotalFacturas += factura.calcularTotal();
        }

        System.out.println("Cantidad de Facturas: " + facturas.size());
        System.out.println("Valor total de todas las facturas: " + valorTotalFacturas);
    }

    public List<Factura> getFacturas() {
        return facturas;
    }
}
