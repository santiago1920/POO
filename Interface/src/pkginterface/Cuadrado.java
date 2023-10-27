package pkginterface;
public class Cuadrado implements Forma{
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }
    
    @Override
    public double calcularMitadArea(){
        return (lado*lado)/2;
    }
    
}
