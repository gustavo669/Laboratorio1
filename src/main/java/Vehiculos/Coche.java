public class Coche extends Vehiculo {
    private int numeroDePuertas;

    public Coche(String marca, String modelo, int ano, int numeroDePuertas) {
        super(marca, modelo, ano);
        this.numeroDePuertas = numeroDePuertas;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Número de puertas: " + numeroDePuertas);
    }
}