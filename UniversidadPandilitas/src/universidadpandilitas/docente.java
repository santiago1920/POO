package universidadpandilitas;
public class docente extends persona{
    private String materia;
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
    
    @Override
    public void accion(){
        
    }
}
