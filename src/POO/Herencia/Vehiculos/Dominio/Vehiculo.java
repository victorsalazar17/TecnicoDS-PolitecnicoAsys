package POO.Herencia.Vehiculos.Dominio;

public class Vehiculo {

    private String  marca;
    private String modelo;
    private int fabricactionYear;
    private double velocidad;
    private double precio;
    private String color;
    private int capacidadPasajeros;

    public Vehiculo(String marca, String modelo, int fabricactionYear) {
        this.marca = marca;
        this.modelo = modelo;
        this.fabricactionYear = fabricactionYear;
    }

    public Vehiculo(double velocidad, double precio, String color, int capacidadPasajeros) {
        this.velocidad = velocidad;
        this.precio = precio;
        this.color = color;
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public void acelerar() {
        this.velocidad ++;
    }
    public void desacelerar() {
        this.velocidad --;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getFabricactionYear() {
        return fabricactionYear;
    }

    public void setFabricactionYear(int fabricactionYear) {
        this.fabricactionYear = fabricactionYear;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }
}
