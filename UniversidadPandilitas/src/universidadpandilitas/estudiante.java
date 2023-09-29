package universidadpandilitas;
import java.util.Scanner;
public class estudiante extends persona{
    private String carrera;
    private int codigo;
    private int semestre;
    boolean salir = false;
    Scanner scanner = new Scanner(System.in);
    
   public void mostrarNotas(){
       System.out.println("Calculo 2 = 4");
       System.out.println("Algebra Lineal = 3.5");
       System.out.println("Programacion orientada a objetos = 4.5");
       System.out.println("Mecanica =2.9");
   }
    
    public estudiante(String carrera, int codigo, int semestre, String nombre, String documento, int edad) {
        super(nombre, documento, edad);
        this.carrera = carrera;
        this.codigo = codigo;
        this.semestre = semestre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    public void calificarProfesor(){
        System.out.println("Ingrese el nombre del profesor: ");
        String profesor = scanner.next();
        System.out.println("Califique del 0 a 5 el profesor de la materia: ");
        int notaProfesor = scanner.nextInt();
    }
    
    @Override
    public void accion(){
        while(!salir){
            System.out.println("1. Ver notas");
            System.out.println("2. Calificar profesor");
            System.out.println("3. Salir");
            int opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1 -> mostrarNotas();
                case 2 -> calificarProfesor();
                case 3 -> {
                System.out.println("Saliendo del programa");
                salir = true;
                }
                default -> System.out.print("Opcion no valida elija otra opcion");
            }
        }
    }
}

