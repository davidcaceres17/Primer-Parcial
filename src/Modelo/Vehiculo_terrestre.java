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
public class Vehiculo_terrestre extends Vehiculo {
    private String tipo_luces,tipo_frenos,tipo_escape,numero_placa;

    public Vehiculo_terrestre(String tipo_luces, String tipo_frenos, String tipo_escape, String numero_placa, String modelo, String tipo_motor, String color, String numero_llantas, String numero_chasis) {
        super(modelo, tipo_motor, color, numero_llantas, numero_chasis);
        this.tipo_luces = tipo_luces;
        this.tipo_frenos = tipo_frenos;
        this.tipo_escape = tipo_escape;
        this.numero_placa = numero_placa;
    }

    public String getTipo_luces() {
        return tipo_luces;
    }

    public void setTipo_luces(String tipo_luces) {
        this.tipo_luces = tipo_luces;
    }

    public String getTipo_frenos() {
        return tipo_frenos;
    }

    public void setTipo_frenos(String tipo_frenos) {
        this.tipo_frenos = tipo_frenos;
    }

    public String getTipo_escape() {
        return tipo_escape;
    }

    public void setTipo_escape(String tipo_escape) {
        this.tipo_escape = tipo_escape;
    }

    public String getNumero_placa() {
        return numero_placa;
    }

    public void setNumero_placa(String numero_placa) {
        this.numero_placa = numero_placa;
    }
    
    
}
