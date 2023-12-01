package co.edu.unicauca.parcial2;
public class Motocicleta extends Vehiculo {
    private int cilindrada;
    
    public Motocicleta(String marca, String modelo, String placa,String horaIngreso, String horaSalida, int cilindrada) {
        super(marca, modelo, placa, horaIngreso, horaSalida, 2000);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    
    

     // Otros métodos específicos para motocicletas
}
