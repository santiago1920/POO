package agregacion;
public class main {
    public static void main(String[] args) {
        empleado empleado1 = new empleado("Juan");
        empleado empleado2 = new empleado("María");
        
        // Crear departamento
        departamento departamento = new departamento("Recursos Humanos");

        // Agregar empleados al departamento
        departamento.agregarEmpleado(empleado1);
        departamento.agregarEmpleado(empleado2);

        // Mostrar información
        System.out.println("Departamento: " + departamento.getNombre());
        System.out.println("Empleados:");
        for (empleado empleado : departamento.getEmpleados()) {
            System.out.println("- " + empleado.getNombre());
        }
        
    }
    
}
