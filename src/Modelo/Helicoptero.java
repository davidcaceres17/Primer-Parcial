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
public class Helicoptero extends Vehiculo_aereo {
    private String tipo_patin_cola,tipo_mastil,tipo_patin_aterrizaje,numero_elices;

    public Helicoptero(String tipo_patin_cola, String tipo_mastil, String tipo_patin_aterrizaje, String numero_elices, String tipo_cola, String tipo_fuselaje, String modelo, String tipo_motor, String color, String numero_llantas, String numero_chasis) {
        super(tipo_cola, tipo_fuselaje, modelo, tipo_motor, color, numero_llantas, numero_chasis);
        this.tipo_patin_cola = tipo_patin_cola;
        this.tipo_mastil = tipo_mastil;
        this.tipo_patin_aterrizaje = tipo_patin_aterrizaje;
        this.numero_elices = numero_elices;
    }

    public String getTipo_patin_cola() {
        return tipo_patin_cola;
    }

    public void setTipo_patin_cola(String tipo_patin_cola) {
        this.tipo_patin_cola = tipo_patin_cola;
    }

    public String getTipo_mastil() {
        return tipo_mastil;
    }

    public void setTipo_mastil(String tipo_mastil) {
        this.tipo_mastil = tipo_mastil;
    }

    public String getTipo_patin_aterrizaje() {
        return tipo_patin_aterrizaje;
    }

    public void setTipo_patin_aterrizaje(String tipo_patin_aterrizaje) {
        this.tipo_patin_aterrizaje = tipo_patin_aterrizaje;
    }

    public String getNumero_elices() {
        return numero_elices;
    }

    public void setNumero_elices(String numero_elices) {
        this.numero_elices = numero_elices;
    }
    
    
}
