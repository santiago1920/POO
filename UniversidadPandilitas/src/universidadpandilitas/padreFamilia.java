package universidadpandilitas;

public class padreFamilia extends persona{
    private int numHijos;
    estudiante[] estudiante = new estudiante[numHijos];
    
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
    
    @Override
    public void accion(){
        
    }
}
