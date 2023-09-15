package animal;
public class main {
    public static void main(String[] args) {
        Dog dog = new Dog("Firulais", 5, "Omnivoro", "Pastor Aleman");
        dog.sonidoAnimal();
        
        Cat cat = new Cat("Michi", 4, "Omnivoro", "Gato Egipcio");
        cat.sonidoAnimal();
    }
    
}
