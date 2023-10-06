package parcial_1;
abstract class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;
    private String propietario;
    private String placa;

    public Vehiculo(String marca, String modelo, int anio, String propietario, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.propietario = propietario;
        this.placa = placa;
    }

    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    
    
    public abstract void mostrarInformacion();
    
}
