package animal;
public class Cat extends tipoAnimal{
    private String raza;
    public Cat(String nombre, int edad, String tipoAlimentacion, String raza){
        super(nombre, edad, tipoAlimentacion);
        this.raza=raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    @Override
     public void sonidoAnimal() {
        System.out.println("miau");
    }
    
}
