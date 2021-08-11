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
public class Vehiculo_aereo extends Vehiculo {
    private String tipo_cola,tipo_fuselaje;

    public Vehiculo_aereo(String tipo_cola, String tipo_fuselaje, String modelo, String tipo_motor, String color, String numero_llantas, String numero_chasis) {
        super(modelo, tipo_motor, color, numero_llantas, numero_chasis);
        this.tipo_cola = tipo_cola;
        this.tipo_fuselaje = tipo_fuselaje;
    }

    public String getTipo_cola() {
        return tipo_cola;
    }

    public void setTipo_cola(String tipo_cola) {
        this.tipo_cola = tipo_cola;
    }

    public String getTipo_fuselaje() {
        return tipo_fuselaje;
    }

    public void setTipo_fuselaje(String tipo_fuselaje) {
        this.tipo_fuselaje = tipo_fuselaje;
    }
    
    
}
