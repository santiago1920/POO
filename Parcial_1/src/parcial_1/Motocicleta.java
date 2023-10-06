package parcial_1;
public class Motocicleta extends Vehiculo{
    private double cilindrada;

    public Motocicleta(double cilindrada, String marca, String modelo, int anio, String propietario, String placa) {
        super(marca, modelo, anio, propietario, placa);
        this.cilindrada = cilindrada;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }
    
    @Override
    public void mostrarInformacion(){
        System.out.println("Marca: "+getMarca());
        System.out.println("Modelo: "+getModelo());
        System.out.println("Anio: "+getAnio());
        System.out.println("Propietario: "+getPropietario());
        System.out.println("Placa: "+getPlaca());
        System.out.println("Numero de puertas: "+getCilindrada());
    }
}
