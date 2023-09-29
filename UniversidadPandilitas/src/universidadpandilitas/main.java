package universidadpandilitas;
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        boolean salir = false;
        Scanner scanner = new Scanner(System.in);
        administrativo administrativo = new administrativo("Nose", "joselino", "1061", 38);
        docente docente = new docente("Pepito", "1061", 45, "POO");
        estudiante estudiante = new estudiante("Sistemas", 198, 5, "Julian", "1061", 15);
        padreFamilia padre = new padreFamilia("Hernado", "1066", 15, 2);
        
        System.out.println("Quien va a ingresar?");
        System.out.println("1. Estudiante");
        System.out.println("2. Administrativo");
        System.out.println("3. Profesor");
        System.out.println("4. Padre de familia");
        System.out.println("5.  Salir");
        System.out.println("Elija una opcion: ");
        int opcion = scanner.nextInt();
        
       
        while(!salir){
            switch (opcion) {
                case 1 -> {estudiante.accion();
                    salir = true;
                }
                case 2 -> {administrativo.accion();
                    salir = true;
                }
                case 3 -> {docente.accion();
                    salir = true;
                }
                case 4 ->{ padre.accion();
                    salir = true;
                }
                case 5 ->{
                    System.out.println("Saliendo del programa");
                    salir = true;
                }
                default -> System.out.print("Opcion no valida elija otra opcion");
            }
        }
    }
    
}
