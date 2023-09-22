package universidadpandilitas;
public class Administrativo extends persona{
    String cargo;

    public Administrativo(String cargo, String nombre, String documento, int edad) {
        super(nombre, documento, edad);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public void registrarEstudiante(String carrera, 
        String codigo, 
        int semestre,
        String nombre, 
        String documento, 
        int edad){
        estudiante estudiante = new estudiante(carrera, codigo, semestre, nombre, documento, edad);
        
    }
    
    @Override
    public void accion(){
        
    }
}
