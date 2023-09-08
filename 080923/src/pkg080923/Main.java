package pkg080923;
import excercise.Persona;
public class Main {
    public static void main(String[] args) {
        
        int limitObjet = 3;
        Persona[] arrayPerson = new Persona[limitObjet];
        
        //instancia //Generar ciclo para guardar estos datos en los limites que el programa define ingresado por teclado
        arrayPerson[0] = new Persona("Jordan","1061","Colombia");
        arrayPerson[1] = new Persona("Camilo","1098","Panama");
        arrayPerson[2] = new Persona("Ana","9898","Chile");
        
        for (int i = 0; i < limitObjet; i++) {
            System.out.println("Name: "+arrayPerson[i].getName());
            System.out.println("Document: "+arrayPerson[i].getDocument());
            System.out.println("Country: "+arrayPerson[i].getCountry());
            System.out.println("--------------");
        }
        
        for (Persona persona : arrayPerson) {
            System.out.println("Name: "+persona.getName());
            System.out.println("Document: "+persona.getDocument());
            System.out.println("Country: "+persona.getCountry());
            System.out.println("--------------");
        }
        
    }
    
}
