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
public class Automovil extends Vehiculo_terrestre {
    private String carroceria,marca,tarjeta_circulacion,numero_puertas,numero_asientos;

    public Automovil(String carroceria, String marca, String tarjeta_circulacion, String numero_puertas, String numero_asientos, String tipo_luces, String tipo_frenos, String tipo_escape, String numero_placa, String modelo, String tipo_motor, String color, String numero_llantas, String numero_chasis) {
        super(tipo_luces, tipo_frenos, tipo_escape, numero_placa, modelo, tipo_motor, color, numero_llantas, numero_chasis);
        this.carroceria = carroceria;
        this.marca = marca;
        this.tarjeta_circulacion = tarjeta_circulacion;
        this.numero_puertas = numero_puertas;
        this.numero_asientos = numero_asientos;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTarjeta_circulacion() {
        return tarjeta_circulacion;
    }

    public void setTarjeta_circulacion(String tarjeta_circulacion) {
        this.tarjeta_circulacion = tarjeta_circulacion;
    }

    public String getNumero_puertas() {
        return numero_puertas;
    }

    public void setNumero_puertas(String numero_puertas) {
        this.numero_puertas = numero_puertas;
    }

    public String getNumero_asientos() {
        return numero_asientos;
    }

    public void setNumero_asientos(String numero_asientos) {
        this.numero_asientos = numero_asientos;
    }
    
    
}
