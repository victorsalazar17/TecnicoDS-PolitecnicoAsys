package POO.Taller_POO.Dominio;

public class Persona {

    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void Presentarse(){
        System.out.print("Hola mi nombre es " + getNombre() + ", y tengo " + getEdad() + " años. ");
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad; }
    }
}
