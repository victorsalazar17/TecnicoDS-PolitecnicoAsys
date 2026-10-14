package POO.EjercicioFacturacion.Dominio;

import java.time.LocalDateTime;

public abstract class Factura {

    private int numero;
    private long valor;
    private LocalDateTime fecha;

    public Factura(int numero, long valor, LocalDateTime fecha) {
        this.numero = numero;
        this.valor = valor;
        this.fecha = fecha;
    }

    public abstract long calcularTotal();

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public long getValor() {
        return valor;
    }

    public void setValor(long valor) {
        this.valor = valor;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
}
