package pkg080923;
import excercise.Persona;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        int limitObjet = 3;
        Scanner scanner = new Scanner(System.in);
        Persona[] arrayPerson = new Persona[limitObjet];
        
        //instancia //Generar ciclo para guardar estos datos en los limites que el programa define ingresado por teclado
        /*arrayPerson[0] = new Persona("Jordan","1061","Colombia");
        arrayPerson[1] = new Persona("Camilo","1098","Panama");
        arrayPerson[2] = new Persona("Ana","9898","Chile");*/
        
        System.out.println("Ingrese el nombre, documento y pais de 3 personas: \n");
        for(int i = 0;i < limitObjet; i++){
            System.out.println("Persona "+(i+1));
            System.out.println("Ingrese el nombre de la persona "+(i+1)+": ");
            String name = scanner.nextLine();
            System.out.println("Ingrese el documento de la persona "+(i+1)+": ");
            String document = scanner.nextLine();
            System.out.println("Ingrese el pais de la persona "+(i+1)+": ");
            String country = scanner.nextLine();
            arrayPerson[i] = new Persona(name,document,country);
        }
        
        System.out.println("--------------");
        
        for (int i = 0; i < limitObjet; i++) {
            System.out.println("Persona "+(i+1));
            System.out.println("Name: "+arrayPerson[i].getName());
            System.out.println("Document: "+arrayPerson[i].getDocument());
            System.out.println("Country: "+arrayPerson[i].getCountry());
            System.out.println("--------------");
        }
        
        /*for (Persona persona : arrayPerson) {
            System.out.println("Name: "+persona.getName());
            System.out.println("Document: "+persona.getDocument());
            System.out.println("Country: "+persona.getCountry());
            System.out.println("--------------");
        }*/
        
    }
    
}