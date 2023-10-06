package parcial_1;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int limitObjet = 10;
        Scanner scanner = new Scanner(System.in);
        Automovil[] arrayAutomovil = new Automovil[limitObjet];
        Motocicleta[] arrayMotocileta = new Motocicleta[limitObjet];
        boolean placaRepetida = false;
        int anioCirculacion;
        int placasRepetidas = 0;
        
        for (Automovil auto : arrayAutomovil) {
            System.out.println("Ingrese el modelo del vehiculo: ");
            String modelo = scanner.next();
            auto.setModelo(modelo);
            
            System.out.println("Ingrese el marca del vehiculo: ");
            String marca = scanner.next();
            auto.setMarca(marca);
            
            System.out.println("Ingrese el anio del vehiculo: ");
            int anio = scanner.nextInt();
            auto.setAnio(anio);
            
        }
        
        arrayAutomovil[0] = new Automovil(4, "Nose", "nose", 2005, "persona1", "SRF988");
        arrayAutomovil[1] = new Automovil(4, "Nose", "nose", 2004, "persona2", "SRF988");
        arrayAutomovil[2] = new Automovil(2, "Nose", "nose", 2016, "persona3", "WER985");
        arrayAutomovil[3] = new Automovil(2, "Nose", "nose", 2018, "persona4", "WER666");
        arrayAutomovil[4] = new Automovil(2, "Nose", "nose", 2020, "persona5", "WPR455");
        arrayAutomovil[5] = new Automovil(2, "Nose", "nose", 2014, "persona6", "STR789");
        arrayAutomovil[6] = new Automovil(2, "Nose", "nose", 2014, "persona7", "CAC965");
        arrayAutomovil[7] = new Automovil(4, "Nose", "nose", 2015, "persona8", "NOS399");
        arrayAutomovil[8] = new Automovil(4, "Nose", "nose", 2014, "persona9", "PUT455");
        arrayAutomovil[9] = new Automovil(4, "Nose", "nose", 2019, "persona10", "LOL345");
        
        
        
        /*for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(j==i){
                    j=i+1;
                }
                if(arrayAutomovil[i].getPlaca().equals(arrayAutomovil[j].getPlaca())) {
                    placasRepetidas = placasRepetidas + 1;
                    placaRepetida = true;
                    
                }
            }
        }*/
        
        
        
        /*for (Automovil auto : arrayAutomovil) {
            System.out.println(""+auto.getPlaca());
            
            if(auto.getPlaca().equals()){
                
            }
        }*/
        
        
    }
    
}
