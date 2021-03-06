/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_claudiohernandez;

/**
 *
 * @author Claudio Hernandez
 */
public class autos {
   /*
    
    Delos autos se conoce VIN (Vehicle Identification Number), marca, modelo, tipo de carrocería, cantidad de pasajeros, capacidad de maletero (en litros), 
    color, precio, y potencia del motor (en caballos de fuerza).
    
    */ 
    private int vin,cantidadPasajeros,capacidadMaletero,precio,potencia;
    private String marca,modelo,tipoCarroceria;

    public autos(int vin, int cantidadPasajeros, int capacidadMaletero, String marca, String modelo, String tipoCarroceria,int precio,int potencia) {
        this.vin = vin;
        this.potencia = potencia;
        this.precio =  precio;
        this.cantidadPasajeros = cantidadPasajeros;
        this.capacidadMaletero = capacidadMaletero;
        this.marca = marca;
        this.modelo = modelo;
        this.tipoCarroceria = tipoCarroceria;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public int getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(int capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoCarroceria() {
        return tipoCarroceria;
    }

    public void setTipoCarroceria(String tipoCarroceria) {
        this.tipoCarroceria = tipoCarroceria;
    }

    @Override
    public String toString() {
        return  vin + ";" + cantidadPasajeros + ";" + capacidadMaletero + ";" + marca + ";" + modelo + ";" + tipoCarroceria + ";"+precio+";"+potencia+";";
    }
    
}
