package POO.Taller_POO.App;

import POO.Taller_POO.Dominio.Estudiante;
import POO.Taller_POO.Dominio.Profesor;

public class Main {
    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante("Victor",25, "Ingenieria de Software");
        Profesor profesor1 = new Profesor("Fernando",52, "Bases de Datos");

        estudiante1.Presentarse();
        profesor1.Presentarse();
    }
}
