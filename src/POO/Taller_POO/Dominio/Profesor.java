package POO.Taller_POO.Dominio;

public class Profesor extends Persona {

    private String asignatura;

    public Profesor(String nombre, int edad, String asignatura) {
        super(nombre, edad);
        this.asignatura = asignatura;
    }

    @Override
    public void Presentarse() {
        super.Presentarse();
        System.out.println("Enseño la asignatura de " + getAsignatura());
    }

    public String getAsignatura() {
        return asignatura;
    }
}
