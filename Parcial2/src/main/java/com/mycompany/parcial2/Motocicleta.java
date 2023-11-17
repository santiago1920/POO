/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial2;

/**
 *
 * @author IngSis
 */
public class Motocicleta extends Vehiculo {
    private int cilindrada;
    
    public Motocicleta(String marca, String modelo, String placa,String horaIngreso, String horaSalida, int cilindrada) {
        super(marca, modelo, placa, horaIngreso, horaSalida);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

     // Otros métodos específicos para motocicletas
}
