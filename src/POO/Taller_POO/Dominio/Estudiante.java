package POO.Taller_POO.Dominio;

public class Estudiante extends Persona {

    private String programa;

    public Estudiante(String nombre, int edad, String programa) {
        super(nombre, edad);
        this.programa = programa;
    }

    @Override
    public void Presentarse() {
        super.Presentarse();
        System.out.println("Estudio el programa de " + this.getPrograma());
    }

    public String getPrograma() {
        return programa;
    }
}
