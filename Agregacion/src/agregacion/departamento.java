package agregacion;

import java.util.ArrayList;
import java.util.List;

public class departamento {
    private String nombre;
    private List<empleado> empleados;

    public departamento(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<empleado> getEmpleados() {
        return empleados;
    }
    
    public void agregarEmpleado(empleado empleado) {
        empleados.add(empleado);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmpleados(List<empleado> empleados) {
        this.empleados = empleados;
    }
    
    
    
}
