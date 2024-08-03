import Vehiculos.ConductorDeCoche;
import Vehiculos.ConductorDeMoto;

public class GestionConductores {
    public static void main(String[] args) {
        ConductorDeCoche conductorDeCoche = new ConductorDeCoche("Juan P�rez", "B12345", 10);
        ConductorDeMoto conductorDeMoto = new ConductorDeMoto("Mar�a L�pez", "A67890", true);

        System.out.println("Informaci�n del Conductor de Coche:");
        conductorDeCoche.mostrarInformacion();

        System.out.println("\nInformaci�n del Conductor de Moto:");
        conductorDeMoto.mostrarInformacion();
    }
}
