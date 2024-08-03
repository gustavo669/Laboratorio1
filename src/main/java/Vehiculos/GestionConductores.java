import Vehiculos.ConductorDeCoche;
import Vehiculos.ConductorDeMoto;

public class GestionConductores {
    public static void main(String[] args) {
        ConductorDeCoche conductorDeCoche = new ConductorDeCoche("Juan Pérez", "B12345", 10);
        ConductorDeMoto conductorDeMoto = new ConductorDeMoto("María López", "A67890", true);

        System.out.println("Información del Conductor de Coche:");
        conductorDeCoche.mostrarInformacion();

        System.out.println("\nInformación del Conductor de Moto:");
        conductorDeMoto.mostrarInformacion();
    }
}
