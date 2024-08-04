package Vehiculos;
public class Moto extends Vehiculo {
    private final boolean tieneSidecar;

    public Moto(String marca, String modelo, int ano, boolean tieneSidecar) {
        super(marca, modelo, ano);
        this.tieneSidecar = tieneSidecar;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Tiene sidecar: " + (tieneSidecar ? "Sí" : "No"));
    }
}
