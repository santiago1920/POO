package universidadpandilitas;
import java.util.LinkedList;
import java.util.Scanner;
public class administrativo extends persona{
    String cargo;
    LinkedList<estudiante> estudiantes = new LinkedList<>();
    LinkedList<materias> materias = new LinkedList<>();
    Scanner scanner = new Scanner(System.in);
    boolean salir = false;

    public administrativo(String cargo, String nombre, String documento, int edad) {
        super(nombre, documento, edad);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public void registrarEstudiante(){
       System.out.println("Ingrese nombre del estudiante: ");
       String nombre = scanner.next();
       System.out.println("Ingrese documento del estudiante: ");
       String documento = scanner.next();
       System.out.println("Ingrese edad del estudiante: ");
       int edad = scanner.nextInt();
       System.out.println("Ingrese codigo del estudiante: ");
       int codigo = scanner.nextInt();
       System.out.println("Ingrese carrera del estudiante: ");
       String carrera = scanner.next();
       System.out.println("Ingrese semestre del estudiante: ");
       int semestre = scanner.nextInt();
                
       estudiante estudiante = new estudiante(carrera, codigo, semestre, nombre, documento, edad);
       estudiantes.add(estudiante);
       System.out.println("Persona agregada con exito");
    }
    public void editarEstudiante(){
        if (estudiantes.isEmpty()) {
                        System.out.println("No hay estudiantes para editar datos.");
                    } else {
                        System.out.print("Ingrese el nombre de la persona cuya edad desea cambiar: ");
                        String nombrePersona = scanner.next();

                        for (estudiante estudiante1 : estudiantes) {
                            if (estudiante1.getNombre().equals(nombrePersona)) {
                                
                                System.out.println("Elija que dato quiere cambiar del estudiante: ");
                                System.out.println("1. Carrera");
                                System.out.println("2. Semestre");
                                System.out.println("3. Nombre");
                                System.out.println("4. Edad");
                                System.out.println("5. Documento");
                                System.out.println("6. Codigo");
                                
                                int opcion = scanner.nextInt();
                                
                                switch (opcion) {
                                    case 1 -> {
                                        System.out.print("Ingrese la nueva carrera: ");
                                        String carrera = scanner.next();
                                        estudiante1.setCarrera(carrera);
                                        System.out.println("Carrera cambiada con éxito.");
                                    }
                                    case 2 -> {
                                        System.out.print("Ingrese el nuevo semestre: ");
                                        int semestre = scanner.nextInt();
                                        estudiante1.setSemestre(semestre);
                                        System.out.println("Semestre cambiado con éxito.");
                                    }
                                    case 3 -> {
                                        System.out.print("Ingrese el nuevo nombre: ");
                                        String nombre = scanner.next();
                                        estudiante1.setNombre(nombre);
                                        System.out.println("Nombre cambiado con éxito.");
                                    }
                                    case 4 -> {
                                        System.out.print("Ingrese la nueva edad: ");
                                        int edad = scanner.nextInt();
                                        estudiante1.setEdad(edad);
                                        System.out.println("Edad cambiada con éxito.");
                                    }
                                    case 5 -> {
                                        System.out.println("Ingrese el nuevo documento");
                                        String documento = scanner.next();
                                        estudiante1.setDocumento(documento);
                                        System.out.println("Documento cambiado con exito");
                                    }
                                    case 6 -> {
                                        System.out.print("Ingrese el nuevo codigo: ");
                                        int codigo = scanner.nextInt();
                                        estudiante1.setCodigo(codigo);
                                        System.out.println("Codigo cambiado con éxito.");
                                    }
                                    default -> System.out.print("Opcion no valida elija otra opcion");
                                }
                                break;
                            }
                        }
                    }
    }
    public void subirMaterias(){
        System.out.println("Ingresa el nombre de la materia: ");
        String nombre = scanner.next();
        System.out.println("Ingresa el numero de creditos: ");
        int creditos = scanner.nextInt();
        
        materias materia = new materias(nombre, creditos);
        materias.add(materia);
        System.out.println("Materia agregagada con exito");
    }

    
    @Override
    public void accion(){
        while (!salir){
        System.out.println("1. Agregar estudiante");
        System.out.println("2. Cambiar datos estudiante");
        System.out.println("3. Subir materias");
        System.out.println("4. Salir");
        System.out.print("Elija una opcion: ");
        int opcion= scanner.nextInt();
        
        switch (opcion) {
            case 1 -> registrarEstudiante();
            case 2 -> editarEstudiante();
            case 3 -> subirMaterias();
            case 4 -> {
                System.out.println("Saliendo del programa");
                salir = true;
            }
            default -> System.out.print("Opcion no valida elija otra opcion");
        }
        }
    }
    
}

