package universidadpandilitas;
import java.util.Scanner;
public class docente extends persona{
    private String materia;
    boolean salir = false;
    
    Scanner scanner = new Scanner(System.in);
    public docente(String nombre, String documento, int edad, String materia){
        super(nombre, documento, edad);
        this.materia=materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
    
    public void ingresarMateria(){
        
        System.out.println("Ingrese el nombre de su materia: ");
        String nombre = scanner.next();
        System.out.println("Ingrese los creditos de su materia");
        int creditos = scanner.nextInt();
        materias materia = new materias(nombre, creditos);
    }
    
    public void registrarNota(){
        System.out.println("Ingrese el nombre de la materia: ");
        String nombreMateria = scanner.next();
        materias materia1 = new materias(nombreMateria, 4);
        
        System.out.println("Ingrese el nombre del estudiante: ");
        String nombre = scanner.next();
        estudiante estudiante = new estudiante("Sistemas", 0, 5,nombre, "1061", 20);
        
        System.out.println("Ingrese la nota del alumno: ");
        double nota = scanner.nextDouble();
        materia1.asignarNota(estudiante, nota);
    }
    
    @Override
    public void accion(){
        while(!salir){
            System.out.println("1. Registrar nota");
            System.out.println("2. Salir");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1 -> registrarNota();
                case 2 -> salir = true;
                default -> throw new AssertionError();
            }
        }
    }
}

