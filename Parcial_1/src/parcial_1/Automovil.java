package parcial_1;
public class Automovil extends Vehiculo{
    private int numeroPuertas;

    public Automovil(int numeroPuertas, String marca, String modelo, int anio, String propietario, String placa) {
        super(marca, modelo, anio, propietario, placa);
        this.numeroPuertas = numeroPuertas;
    }

    

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
    
    @Override
    public void mostrarInformacion(){
        System.out.println("Marca: "+getMarca());
        System.out.println("Modelo: "+getModelo());
        System.out.println("Anio: "+getAnio());
        System.out.println("Propietario: "+getPropietario());
        System.out.println("Placa: "+getPlaca());
        System.out.println("Numero de puertas: "+getNumeroPuertas());
    }
}
