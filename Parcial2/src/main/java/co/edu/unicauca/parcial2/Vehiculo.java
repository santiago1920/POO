package co.edu.unicauca.parcial2;
public class Vehiculo {
    private String marca;
    private String modelo;
    private String placa;
    private String horaIngreso;
    private String horaSalida;
    private int precio;

    public Vehiculo(String marca, String modelo, String placa, String horaIngreso, String horaSalida, int precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.horaIngreso = horaIngreso;
        this.horaSalida = horaSalida;
        this.precio = precio;
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

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(String horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    public boolean verificarHoras(){
        String[] tiempo1 = horaIngreso.split(":");
        String[] tiempo2 = horaSalida.split(":");

        int horaInicial = Integer.parseInt(tiempo1[0]);
        int minutoInicial = Integer.parseInt(tiempo1[1]);

        int horaFinal = Integer.parseInt(tiempo2[0]);
        int minutoFinal = Integer.parseInt(tiempo2[1]);

        if (horaFinal > horaInicial || (horaFinal == horaInicial && minutoFinal > minutoInicial)) {
            return false;
        } else if (horaFinal < horaInicial || (horaFinal == horaInicial && minutoFinal < minutoInicial)) {
            return true;
        } else {
            return true;
        }
    }
    
    public double precioHora() {
        String[] tiempoInicio=horaIngreso.split(":");
        String[] tiempoFinal=horaSalida.split(":");
        
        
        int horaInicial = Integer.parseInt(tiempoInicio[0]);
        int minutoInicial = Integer.parseInt(tiempoFinal[1]);
        
        
        int horaFinal = Integer.parseInt(tiempoFinal[0]);
        int minutoFinal = Integer.parseInt(tiempoFinal[1]);
        
        int diferenciaHoras = horaFinal - horaInicial;
        int diferenciaMinutos= minutoFinal-minutoInicial;
        
       /* if(diferenciaHoras==0||minutoFinal>=minutoInicial){
            diferenciaMinutos=minutoFinal-minutoInicial;
        }else{
            diferenciaMinutos=minutoInicial-minutoFinal;
            diferenciaHoras -= 1;
        }*/
        
        if (diferenciaMinutos < 0) {
            diferenciaHoras = diferenciaHoras-1;
            diferenciaMinutos = -1*(diferenciaMinutos);
        }
        double totalHoras = (diferenciaMinutos/60) + diferenciaHoras;
        
        double costoTotal;
        double tarifa=precio;       
        if(diferenciaHoras == 0){
            costoTotal=precio;
        }else{
            costoTotal = totalHoras * tarifa;
        }
        return costoTotal;
    }
    
}
