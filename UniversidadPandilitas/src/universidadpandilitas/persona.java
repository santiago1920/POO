package universidadpandilitas;
abstract class persona {
    private String nombre, documento;
    private int edad;
    
    public persona(String nombre, String documento, int edad){
        this.nombre=nombre;
        this.documento=documento;
        this.edad=edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public abstract void accion();
}
