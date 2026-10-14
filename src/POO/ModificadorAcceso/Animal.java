package POO.ModificadorAcceso;

public class Animal {

    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void comer (){
        System.out.println("Comiendo");
    }
    private void moverse (){
        System.out.println("Moviendose");
    }

    public static void dormir(){
        System.out.println("Dormiendo");
    }
}
