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
public class Moto extends Vehiculo_terrestre {
    private String marca,tipo_manigueta,tipo_pedales,numero_rin;

    public Moto(String marca, String tipo_manigueta, String tipo_pedales, String numero_rin, String tipo_luces, String tipo_frenos, String tipo_escape, String numero_placa, String modelo, String tipo_motor, String color, String numero_llantas, String numero_chasis) {
        super(tipo_luces, tipo_frenos, tipo_escape, numero_placa, modelo, tipo_motor, color, numero_llantas, numero_chasis);
        this.marca = marca;
        this.tipo_manigueta = tipo_manigueta;
        this.tipo_pedales = tipo_pedales;
        this.numero_rin = numero_rin;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo_manigueta() {
        return tipo_manigueta;
    }

    public void setTipo_manigueta(String tipo_manigueta) {
        this.tipo_manigueta = tipo_manigueta;
    }

    public String getTipo_pedales() {
        return tipo_pedales;
    }

    public void setTipo_pedales(String tipo_pedales) {
        this.tipo_pedales = tipo_pedales;
    }

    public String getNumero_rin() {
        return numero_rin;
    }

    public void setNumero_rin(String numero_rin) {
        this.numero_rin = numero_rin;
    }
    
    
    
    
}
