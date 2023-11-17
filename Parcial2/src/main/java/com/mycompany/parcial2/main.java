package com.mycompany.parcial2;
import static spark.Spark.*;
import com.google.gson.Gson;
import java.util.LinkedList;

public class main {
    public static void main(String[] args) {
         /*
        * Esto nos sirve para generar un formato json para retornar la data del array
        * sin tener que acomodarla bonita de manera manual
        */
        Gson gson = new Gson();
        
        LinkedList <Vehiculo> automoviles = new LinkedList<>();
        LinkedList <Vehiculo> motos = new LinkedList<>();
        
        // Automovil creado por defecto
        Automovil auto = new Automovil(4, "Mazda", "3", "ZYX987");
        automoviles.add(auto);
        
        Motocicleta moto = new Motocicleta("Honda", "CBR600", "XYZ789","11:57","11:45",600);
        motos.add(moto);
        
        
        // Definir endpoints
        
        // Por defecto 
        
        // Listado de automovile
        get("/automoviles", (req, res) -> {
            res.type("application/json");
            return gson.toJson(automoviles);
        });
        
        get("/motos", (req, res) -> {
            res.type("application/json");
            return gson.toJson(motos);
        });
        
        
        // Guardar automovil
        // endpoint GET para agregar un automóvil
        get("/agregarAutomovil/:marca/:modelo/:placa/:numeroPuertas", (req, res) -> {
            
            // Añadimos esto para retornar en formato Json
            res.type("application/json");

            // Obtener parámetros de la URL
            String marca = req.params(":marca");
            String modelo = req.params(":modelo");
            String placa = req.params(":placa");
            
            // No olvidar convertir en integer los string numericos que llegan por url
            int numeroPuertas = Integer.parseInt(req.params(":numeroPuertas"));

            // Crear un nuevo automóvil y agregarlo al parqueadero
            Automovil nuevoAuto = new Automovil(numeroPuertas, marca, modelo,placa);
            automoviles.add(nuevoAuto);

            return gson.toJson(nuevoAuto);
        });
        
        
        
        
        get("/agregarMoto/:marca/:modelo/:placa/:horaIngreso/:horaSalida/:cilindrada",(req, res) -> {
           
            res.type("application/json");
            
            String marca = req.params(":marca");
            String modelo = req.params(":modelo");
            String placa = req.params(":placa");
            String horaIngreso = req.params(":horaIngreso");
            String horaSalida = req.params(":horaSalida");
            
            int cilindrada = Integer.parseInt(req.params(":cilindrada"));
            
            Motocicleta nuevaMoto = new Motocicleta(marca, modelo, placa, horaIngreso, horaSalida,cilindrada);
            motos.add(nuevaMoto);
            
            return gson.toJson(nuevaMoto);
        });
    }
    
}
