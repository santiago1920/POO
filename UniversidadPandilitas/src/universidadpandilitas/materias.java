package universidadpandilitas;
import java.util.HashMap;
public class materias {
    private String nombreMateria;
    private int creditos;
    private HashMap<estudiante, Double> notas;

    public materias(String nombreMateria, int creditos) {
        this.nombreMateria = nombreMateria;
        this.creditos = creditos;
        this.notas = new HashMap<>();
    }
    
    public void asignarNota(estudiante estudiante, double nota){
        notas.put(estudiante, nota);
    }
    
    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public HashMap<estudiante, Double> getNotas() {
        return notas;
    }

    public void setNotas(HashMap<estudiante, Double> notas) {
        this.notas = notas;
    }
    
    
    
}
