package universidadpandilitas;
import java.util.Scanner;
public class padreFamilia extends persona{
    private int numHijos;
    estudiante[] estudiante = new estudiante[numHijos];
    boolean salir = false;
    Scanner scanner = new Scanner(System.in);
    
    public padreFamilia(String nombre, String documento, int edad,int numHijos){
        super (nombre, documento, edad);
        this.numHijos=numHijos;
    }

    public int getNumHijos() {
        return numHijos;
    }

    public void setNumHijos(int numHijos) {
        this.numHijos = numHijos;
    }

    public estudiante[] getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(estudiante[] estudiante) {
        this.estudiante = estudiante;
    }
    
    public void mostrarNotas(){
        System.out.println("Ingresar el nombre del estudiante: ");
        scanner.next();
        System.out.println("Calculo 2 = 4");
       System.out.println("Algebra Lineal = 3.5");
       System.out.println("Programacion orientada a objetos = 4.5");
       System.out.println("Mecanica = 2.9");
    }
    
    
    @Override
    public void accion(){
        while(!salir){
            System.out.println("1. Ver notas");
            System.out.println("2. Salir");
            int opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1 -> mostrarNotas();
                case 2 -> {
                    System.out.println("Saliendo del programa");
                    salir = true;
                }
                default -> System.out.print("Opcion no valida elija otra opcion");
            }
        }
    }
}
    
