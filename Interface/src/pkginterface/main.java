package pkginterface;
public class main {
    public static void main(String[] args) {
         // Crear instancias de las formas
        Cuadrado miCuadrado = new Cuadrado(5);
        Circulo miCirculo = new Circulo(3);
        Rectangulo miRectangulo = new Rectangulo(5, 3);
        // Calcular y mostrar áreas y perímetros
        System.out.println("Area del cuadrado: " + miCuadrado.calcularArea());
        System.out.println("Perimetro del cuadrado: " + miCuadrado.calcularPerimetro());
        System.out.println("La mitad del area del cuadrado es: "+miCuadrado.calcularMitadArea());
        
        System.out.println("Area del circulo: " + miCirculo.calcularArea());
        System.out.println("Perimetro del circulo: " + miCirculo.calcularPerimetro());
        System.out.println("La mitad del area del circulo es: "+miCirculo.calcularMitadArea());
        
        System.out.println("Area del rectangulo: "+miRectangulo.calcularArea());
        System.out.println("Perimetro del rectangulo: "+miRectangulo.calcularPerimetro());
        System.out.println("La mitad del area del rectangulo es: "+miRectangulo.calcularMitadArea());
    }
    
}
