package animal;
public class Dog extends tipoAnimal{
    private String raza;
    public Dog(String nombre, int edad, String tipoAlimentacion, String raza){
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
        System.out.println("guau");
    }
    
    
}
