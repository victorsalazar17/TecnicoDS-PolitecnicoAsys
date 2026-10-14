package POO.ModificadorAcceso;

public class Dog  extends Animal{

    private String raza;

    public Dog(String nombre, String raza)  {
        super(nombre);
        this.raza = raza;
    }

    public void ladrar(int cantidad){
        super.nombre = "Toby";
        System.out.println( super.nombre + " ladra" + cantidad +" veces");
    }

}
