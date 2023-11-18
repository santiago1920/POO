package co.edu.unicauca.parcial2;
import static spark.Spark.*;
import com.google.gson.Gson;
import java.util.LinkedList;

public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         /*
        * Esto nos sirve para generar un formato json para retornar la data del array
        * sin tener que acomodarla bonita de manera manual
        */
        Gson gson = new Gson();
        
        LinkedList <Vehiculo> automoviles = new LinkedList<>();
        LinkedList <Vehiculo> motos = new LinkedList<>();
        LinkedList <Vehiculo> automovilesActuales = new LinkedList<>();
        LinkedList <Vehiculo> motosActuales = new LinkedList<>();
        
        // Automovil creado por defecto
        Automovil auto = new Automovil(4, "Mazda", "3", "ZYX987","11:00",null);
        automoviles.add(auto);
        
        Motocicleta moto = new Motocicleta("Honda", "CBR600", "XYZ789","11:57","11:45",600);
        motos.add(moto);
        
        // Definir endpoints
        
        // Por defecto 
        
        // Listado de automovile
        get("/automovilesReporte", (req, res) -> {
            res.type("application/json");
            return gson.toJson(automoviles);
        });
        
        get("/motosReporte", (req, res) -> {
            res.type("application/json");
            return gson.toJson(motos);
        });
        
        
        // Guardar automovil
        // endpoint GET para agregar un automóvil
        get("/agregarAutomovil/:marca/:modelo/:placa/:numeroPuertas/:horaIngreso", (req, res) -> {
            
            // Añadimos esto para retornar en formato Json
            res.type("application/json");

            // Obtener parámetros de la URL
            String marca = req.params(":marca");
            String modelo = req.params(":modelo");
            String placa = req.params(":placa");
            String horaIngreso = req.params(":horaIngreso");
            String horaSalida = null;
            // No olvidar convertir en integer los string numericos que llegan por url
            int numeroPuertas = Integer.parseInt(req.params(":numeroPuertas"));
            
            Automovil nuevoAuto = new Automovil(numeroPuertas, marca, modelo, placa, horaIngreso, horaSalida);
                automoviles.add(nuevoAuto);
                return gson.toJson(nuevoAuto);
            
        });
        
        get("/agregarMoto/:marca/:modelo/:placa/:cilindrada/:horaIngreso",(req, res) -> {
           
            res.type("application/json");
            
            String marca = req.params(":marca");
            String modelo = req.params(":modelo");
            String placa = req.params(":placa");
            String horaIngreso = req.params(":horaIngreso");
            String horaSalida = null;
            
            int cilindrada = Integer.parseInt(req.params(":cilindrada"));
            
            
            Motocicleta nuevaMoto = new Motocicleta(marca, modelo, placa, horaIngreso, horaSalida,cilindrada);
                motos.add(nuevaMoto);
                return gson.toJson(nuevaMoto);
            
            
        });
        
        get("/AutomovilesActuales", (req, res) -> {
        // Añadimos esto para retornar en formato Json
        res.type("application/json");

    // Iterar a través de la lista de automóviles y encontrar aquellos sin hora de salida registrada
        for (Vehiculo auto1 : automoviles) {
            if (auto1.getHoraSalida() == null || auto.getHoraSalida().isEmpty() && !automovilesActuales.contains(auto)) {
                automovilesActuales.add(auto1);
            }
        }
        if (automovilesActuales.isEmpty()) {
        return gson.toJson("No hay automóviles actuales sin hora de salida registrada.");
        } else {
            return gson.toJson(automovilesActuales);
        }
        });
        
        get("/motosActuales", (req, res) -> {
        // Añadimos esto para retornar en formato Json
        res.type("application/json");

    // Iterar a través de la lista de automóviles y encontrar aquellos sin hora de salida registrada
        for (Vehiculo moto1 : motos) {
            if (moto1.getHoraSalida() == null || auto.getHoraSalida().isEmpty()) {
                motosActuales .add(moto1);
            }
        }
        if (motosActuales .isEmpty()) {
        return gson.toJson("No hay motos actuales sin hora de salida registrada.");
        } else {
            return gson.toJson(motosActuales );
        }
        });
        
        get("/actualizarHoraSalida/:placa/:horaSalida", (req, res) -> {
            res.type("application/json");
            // Obtener parámetros de la URL
            String placa = req.params(":placa");
            String horaSalida = req.params(":horaSalida");

            // Buscar el automóvil en la lista principal
            for (Vehiculo auto1 : automoviles) {
                if (auto1.getPlaca().equals(placa)) {
                    
                    if (auto1.getHoraSalida() != null && !auto1.getHoraSalida().isEmpty()) {
                        return gson.toJson("El automóvil con placa " + placa + " ya tiene una hora de salida registrada");
                    }
                    
                    // Actualizar la hora de salida
                    auto1.setHoraSalida(horaSalida);

                    // Eliminar el automóvil de la lista automovilesActuales si tenía hora de salida nula
                    if (auto1.getHoraSalida() != null && !auto1.getHoraSalida().isEmpty()) {
                       automovilesActuales.removeIf(a -> a.getPlaca().equals(placa));
                    }
                    return gson.toJson("Hora de salida actualizada para el automóvil con placa: " + placa);
               }
            }
            
            // Buscar la moto en la lista principal
            for (Vehiculo moto1 : motos) {
                if (moto1.getPlaca().equals(placa)) {
                    
                    if (moto1.getHoraSalida() != null && !moto1.getHoraSalida().isEmpty()) {
                        return gson.toJson("La moto con placa " + placa + " ya tiene una hora de salida registrada");
                    }
                    
                    // Actualizar la hora de salida
                    moto1.setHoraSalida(horaSalida);

                    // Eliminar el automóvil de la lista automovilesActuales si tenía hora de salida nula
                    if (moto1.getHoraSalida() != null && !moto1.getHoraSalida().isEmpty()) {
                       motosActuales.removeIf(a -> a.getPlaca().equals(placa));
                    }
                    return gson.toJson("Hora de salida actualizada para la moto con placa: " + placa);
               }
            }
            
            
            
            return gson.toJson("No se encontró ningún vehiculo con la placa proporcionada.");
        });
    }
    
}
