package POO.Herencia.Vehiculos.App;

import POO.Herencia.Vehiculos.Dominio.*;

public class appVehiculo {

    public static void main(String[] args) {

        // CREACION DE VEHICULOS Y EJECUCION DE METODOS:

        // --- TAXIS ---

        System.out.println("--- TAXIS ---");
        Taxi taxi1 = new Taxi(10.0, 45000000.0, "Amarillo", 4, "ABC123", "LIC-98765", 3800.0, true, "TaxiExpress");
        Taxi taxi2 = new Taxi(0.0, 52000000.0, "Blanco", 4, "XYZ789", "LIC-11223", 4000.0, false, "Cootraelsa");
        Taxi taxi3 = new Taxi(20.0, 39000000.0, "Amarillo", 4, "MNO456", "LIC-55443", 3500.0, true, "TaxIndividual");

        taxi1.cobrarCarrera(10);
        taxi2.cambiarEstadoTaximetro();
        taxi1.acelearBuscandoClientes();

        // --- MOTOCICLETAS ---

        System.out.println("--- MOTOCICLETAS ---");
        Motocicleta moto1 = new Motocicleta("Yamaha", "MT-03", 2023, "ABC12D", 321, "Mecánica", "ABS", 29.6, 41.4, "Naked");
        Motocicleta moto2 = new Motocicleta("Bajaj", "Pulsar NS 200", 2024, "XYZ45E", 199, "Mecánica", "Disco", 18.3, 24.1, "Street");
        Motocicleta moto3 = new Motocicleta("Kawasaki", "Ninja 400", 2022, "MNO88F", 399, "Mecánica", "ABS", 37.0, 44.8, "Sport");

        moto1.acelerarFuerte();
        moto2.tocarClaxon();
        moto3.picarMoto();

        // --- CARROS ---

        System.out.println("--- CARROS ---");
        Carro carro1 = new Carro("Chevrolet", "Sail", 2021, 4, "ABC123", "Mecánica", 15000, "Gasolina", true);
        Carro carro2 = new Carro("Renault", "Sandero", 2023, 5, "XYZ789", "Automática", 5000, "Gasolina", false);
        Carro carro3 = new Carro("Mazda", "3", 2024, 4, "MNO456", "Automática", 1200, "Híbrido", true);

        carro1.acelerarFuerte();
        carro2.encenderAire();
        carro3.abrirMaletero();

        // --- BICICLETAS ---

        System.out.println("--- BICICLETAS ---");
        Bicicleta bici1 = new Bicicleta("Specialized", "Rockhopper", 2023, "MTB", "Aluminio", 29.0, 13.5, 18);
        Bicicleta bici2 = new Bicicleta("Trek", "FX 2", 2024, "Urbana", "Aluminio", 28.0, 11.2, 21);
        Bicicleta bici3 = new Bicicleta("GW", "Flamma", 2022, "Ruta", "Fibra de Carbono", 27.5, 9.0, 14);

        bici1.pedalear();
        bici2.frenar();
        bici3.hacerTruco();

        // --- BARCOS ---

        System.out.println("--- BARCOS ---");
        Barco barco1 = new Barco(40.0, 150000000.0, "Blanco", 12, "Yate", 15.5, 4.2, 3500.0, true);
        Barco barco2 = new Barco(10.0, 80000000.0, "Azul", 6, "Lancha", 6.0, 2.1, 800.0, false);
        Barco barco3 = new Barco(0.0, 450000000.0, "Gris", 40, "Catamarán", 24.0, 8.5, 12000.0, true);

        barco1.anclar();
        barco2.navegacionFull();
        barco3.zarpar();

        // --- AVIONES ---

        System.out.println("--- AVIONES ---");

        Avion avion1 = new Avion("Boeing", "737", 2021, "Avión", 2, 12500.0, true, "Comercial");
        Avion avion2 = new Avion("Cessna", "Skyhawk", 2019, "Avioneta", 1, 4000.0, false, "Entrenamiento");
        Avion avion3 = new Avion("Airbus", "A320", 2023, "Jet", 2, 12000.0, true, "Privado");

        avion1.despegar();
        avion2.gestionarPilotoAutomatico();
        avion3.aterrizar();
    }
}
