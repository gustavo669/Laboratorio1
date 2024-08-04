import Vehiculos.Coche;
import Vehiculos.Moto;
import Vehiculos.Vehiculo;

public class Main {
    public static void main(String[] args) {
        Vehiculo coche = new Coche("Toyota", "Corolla", 2020, 4);
        Vehiculo moto = new Moto("Harley Davidson", "Sportster", 2018, true);

        System.out.println("Detalles del Coche:");
        coche.mostrarDetalles();

        System.out.println("\nDetalles de la Moto:");
        moto.mostrarDetalles();
    }
}