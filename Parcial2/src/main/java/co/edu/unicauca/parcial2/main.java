package co.edu.unicauca.parcial2;
import static spark.Spark.*;
import com.google.gson.Gson;
import java.util.LinkedList;

public class main {
    public static void main(String[] args) {
        Gson gson = new Gson();
        
        LinkedList <Vehiculo> automoviles = new LinkedList<>();
        LinkedList <Vehiculo> motos = new LinkedList<>();
        LinkedList <Vehiculo> automovilesActuales = new LinkedList<>();
        LinkedList <Vehiculo> motosActuales = new LinkedList<>();
        LinkedList <Vehiculo> automovilesReporte = new LinkedList<>();
        LinkedList <Vehiculo> motosReporte = new LinkedList<>();
        
        Automovil auto = new Automovil(4, "Mazda", "3", "ZYX987","11:00",null);
        automoviles.add(auto);
        
        Motocicleta moto = new Motocicleta("Honda", "CBR600", "XYZ789","11:57",null,600);
        motos.add(moto);
        
        for (Vehiculo auto1 : automoviles) {
            if (auto1.getHoraSalida() == null || auto.getHoraSalida().isEmpty() && !automovilesActuales.contains(auto)) {
                automovilesActuales.add(auto1);
            }
        }
        
        for (Vehiculo moto1 : motos) {
            if (moto1.getHoraSalida() == null || moto.getHoraSalida().isEmpty() && !motosActuales.contains(moto)) {
                motosActuales.add(moto1);
            }
        }
        
        for (Vehiculo auto1 : automoviles) {
            if (auto1.getHoraSalida() != null) {
                automovilesReporte.add(auto1);
            }
        }
        
        for (Vehiculo moto1 : motos) {
            if (moto1.getHoraSalida() != null) {
                motosReporte.add(moto1);
            }
        }
        
        get("/automoviles", (req, res) -> {
            res.type("application/json");
            return gson.toJson(automoviles);
        });
        
        get("/motos", (req, res) -> {
            res.type("application/json");
            return gson.toJson(motos);
        });
        
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
            
            for (Vehiculo auto1 : automoviles) {
                if (auto1.getPlaca().equals(placa)) {
                    return gson.toJson("Ya hay un vehiculo con placa "+placa+" registrado");
               }
            }
            
            for (Vehiculo moto1 : motos) {
                if (moto1.getPlaca().equals(placa)) {
                    return gson.toJson("Ya hay un vehiculo con placa "+placa+" registrado");
               }
            }
            
            Automovil nuevoAuto = new Automovil(numeroPuertas, marca, modelo, placa, horaIngreso, horaSalida);
            automoviles.add(nuevoAuto);
            automovilesActuales.add(nuevoAuto);
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
            
            for (Vehiculo moto1 : motos) {
                if (moto1.getPlaca().equals(placa)) {
                    return gson.toJson("Ya hay un vehiculo con placa "+placa+" registrado");
               }
            }
            
            for (Vehiculo auto1 : automoviles) {
                if (auto1.getPlaca().equals(placa)) {
                    return gson.toJson("Ya hay un vehiculo con placa "+placa+" registrado");
               }
            }
            
            Motocicleta nuevaMoto = new Motocicleta(marca, modelo, placa, horaIngreso, horaSalida,cilindrada);
            motos.add(nuevaMoto);
            motosActuales.add(nuevaMoto);
            return gson.toJson(nuevaMoto);    
        });
        
        get("/AutomovilesActuales", (req, res) -> {
        res.type("application/json");
        if (automovilesActuales.isEmpty()) {
        return gson.toJson("No hay automóviles actuales sin hora de salida registrada.");
        } else {
            return gson.toJson(automovilesActuales);
        }
        });
        
        get("/motosActuales", (req, res) -> {
        res.type("application/json");
        if (motosActuales.isEmpty()) {
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
                    
                    if(auto1.verificarHoras()==true){
                        auto1.setHoraSalida(null);
                        return gson.toJson("Error: la hora de salida es menor o igual que la hora de ingreso");
                    }
                    
                    automovilesReporte.add(auto1);

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
                    
                    if(moto1.verificarHoras()==true){
                        moto1.setHoraSalida(null);
                        return gson.toJson("Error: la hora de salida es menor o igual que la hora de ingreso. Escribala de nuevo");
                    }
                    
                    motosReporte.add(moto1);

                    // Eliminar el automóvil de la lista automovilesActuales si tenía hora de salida nula
                    if (moto1.getHoraSalida() != null && !moto1.getHoraSalida().isEmpty()) {
                       motosActuales.removeIf(a -> a.getPlaca().equals(placa));
                    }
                    return gson.toJson("Hora de salida actualizada para la moto con placa: " + placa);
               }
            }
            return gson.toJson("No se encontró ningún vehiculo con la placa proporcionada.");
        });
        
        get("/automovilesReporte", (req, res) -> {
            res.type("application/json");
            if (automovilesReporte.isEmpty()) {
                return gson.toJson("Ningun automovil a salido del parqueadero");
            } else {
                LinkedList<String> preciosAutomoviles = new LinkedList<>();
                for (Vehiculo auto1 : automovilesReporte) {
                    preciosAutomoviles.add("Precio total del auto con placa " + auto1.getPlaca() + ": $" + auto1.precioHora());
                }
                return gson.toJson(preciosAutomoviles);
            }
        });
        
        get("/motosReporte", (req, res) -> {
            res.type("application/json");
            if (motosReporte.isEmpty()) {
                return gson.toJson("Ninguna moto a salido del parqueadero");
            } else {
                LinkedList<String> preciosMotos = new LinkedList<>();
                for (Vehiculo moto1 : motosReporte) {
                    preciosMotos.add("Precio total de la moto con placa " + moto1.getPlaca() + ": $" + moto1.precioHora());
                }
                return gson.toJson(preciosMotos);
            }
        });
        
        get("/gananciaMotosAutos", (req, res)->{
            res.type("application/json");
            
            if (automovilesReporte.isEmpty() && motosReporte.isEmpty()) {
                return gson.toJson("Ningún vehículo ha salido del parqueadero");
            }else{
                double totalAutos = automovilesReporte.stream().mapToDouble(Vehiculo::precioHora).sum();
                double totalMotos = motosReporte.stream().mapToDouble(Vehiculo::precioHora).sum();

                StringBuilder message = new StringBuilder();
                if (totalAutos > 0) {
                    message.append("Ganancias total por autos: $").append(totalAutos);
                } else {
                    message.append("No ha habido ganancias por autos");
                }

                if (totalMotos > 0) {
                     if (totalAutos > 0) {
                        message.append(", ");
                    }
                    message.append("Ganancias total por motos: $").append(totalMotos);
                } else {
                    if (totalAutos > 0) {
                        message.append(", No ha habido ganancias por motos");
                    }
                }

                return gson.toJson(message.toString());
            }
        });
        
        get("/gananciaTotales", (req, res)->{
           res.type("application/json");

            double totalGananciasAutos = automovilesReporte.stream().mapToDouble(Vehiculo::precioHora).sum();
            double totalGananciasMotos = motosReporte.stream().mapToDouble(Vehiculo::precioHora).sum();
            double gananciaTotal = totalGananciasAutos + totalGananciasMotos;

            if (gananciaTotal > 0) {
                return gson.toJson("Ganancia total: $" + gananciaTotal);
            } else {
                return gson.toJson("Ningún vehículo ha salido del parqueadero, por ende, no hay ganancias totales");
            } 
        });
    }
}
