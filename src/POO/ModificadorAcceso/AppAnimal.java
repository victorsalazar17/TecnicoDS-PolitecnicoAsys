package POO.ModificadorAcceso;

public class AppAnimal {

    public static void main(String[] args) {

        Dog Toby = new Dog("Toby", "Labrador");
        Toby.ladrar(5);
        Toby.comer();

        Animal.dormir();

    }
}
