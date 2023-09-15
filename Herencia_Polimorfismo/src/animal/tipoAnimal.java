package animal;

abstract class tipoAnimal {
    private String nombre;
    private int edad;
    private String tipoAlimentacion;

    public tipoAnimal(String nombre, int edad, String tipoAlimentacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipoAlimentacion = tipoAlimentacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipoAlimentacion() {
        return tipoAlimentacion;
    }

    public void setTipoAlimentacion(String tipoAlimentacion) {
        this.tipoAlimentacion = tipoAlimentacion;
    }

    
    
    public abstract void sonidoAnimal();
}
