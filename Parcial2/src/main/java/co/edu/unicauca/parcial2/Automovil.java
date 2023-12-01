package co.edu.unicauca.parcial2;
public class Automovil extends Vehiculo {
    private int numeroPuertas;

    // Constructores, getters y setters

    // Otros métodos específicos para automóviles

    public Automovil(int numeroPuertas, String marca, String modelo, String placa, String horaIngreso, String horaSalida) {
        super(marca, modelo, placa, horaIngreso, horaSalida,3000);
        this.numeroPuertas = numeroPuertas;
    }
    
    
    
    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
    
    
}
