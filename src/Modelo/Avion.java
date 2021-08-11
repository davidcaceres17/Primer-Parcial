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
public class Avion extends Vehiculo_aereo {
    private String tipo_alerones,tipo_estabilizadores,tipo_tren_aterrizaje;

    public Avion(String tipo_alerones, String tipo_estabilizadores, String tipo_tren_aterrizaje, String tipo_cola, String tipo_fuselaje, String modelo, String tipo_motor, String color, String numero_llantas, String numero_chasis) {
        super(tipo_cola, tipo_fuselaje, modelo, tipo_motor, color, numero_llantas, numero_chasis);
        this.tipo_alerones = tipo_alerones;
        this.tipo_estabilizadores = tipo_estabilizadores;
        this.tipo_tren_aterrizaje = tipo_tren_aterrizaje;
    }

    public String getTipo_alerones() {
        return tipo_alerones;
    }

    public void setTipo_alerones(String tipo_alerones) {
        this.tipo_alerones = tipo_alerones;
    }

    public String getTipo_estabilizadores() {
        return tipo_estabilizadores;
    }

    public void setTipo_estabilizadores(String tipo_estabilizadores) {
        this.tipo_estabilizadores = tipo_estabilizadores;
    }

    public String getTipo_tren_aterrizaje() {
        return tipo_tren_aterrizaje;
    }

    public void setTipo_tren_aterrizaje(String tipo_tren_aterrizaje) {
        this.tipo_tren_aterrizaje = tipo_tren_aterrizaje;
    }
    
    
}
