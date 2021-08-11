/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author justo
 */
abstract class Vehiculo {
    private String modelo,tipo_motor,color,numero_llantas,numero_chasis;

    public Vehiculo(String modelo, String tipo_motor, String color, String numero_llantas, String numero_chasis) {
        this.modelo = modelo;
        this.tipo_motor = tipo_motor;
        this.color = color;
        this.numero_llantas = numero_llantas;
        this.numero_chasis = numero_chasis;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo_motor() {
        return tipo_motor;
    }

    public void setTipo_motor(String tipo_motor) {
        this.tipo_motor = tipo_motor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumero_llantas() {
        return numero_llantas;
    }

    public void setNumero_llantas(String numero_llantas) {
        this.numero_llantas = numero_llantas;
    }

    public String getNumero_chasis() {
        return numero_chasis;
    }

    public void setNumero_chasis(String numero_chasis) {
        this.numero_chasis = numero_chasis;
    }

    
    
    
}
