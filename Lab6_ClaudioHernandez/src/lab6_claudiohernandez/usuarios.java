/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_claudiohernandez;

import java.util.ArrayList;

/**
 *
 * @author Claudio Hernandez
 */
public class usuarios {
    /*
    De los clientes se conoce su ID, nombre, apellido, 
    nacionalidad, lugar de trabajo, puesto de su lugar de trabajo, 
    nombre de usuario y contraseña (para entrar al sistema), 
    dinero actual(en lempiras)y una lista de los VIN de los autos que compró. 
    
    
    */
    private String nombre,id,usuario,apellido;
    private String contraseña;
    private String nacionalidad;
    private String lugarTrabajo;
    private int dinero;
    private ArrayList<Integer> vins  =  new ArrayList();

    public usuarios(String nombre, String id, String usuario, String apellido, String contraseña, String nacionalidad, String lugarTrabajo, int dinero) {
        this.nombre = nombre;
        this.id = id;
        this.usuario = usuario;
        this.apellido = apellido;
        this.contraseña = contraseña;
        this.nacionalidad = nacionalidad;
        this.lugarTrabajo = lugarTrabajo;
        this.dinero = dinero;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
    public usuarios(String nombre, String contraseña) {
        this.nombre = nombre;
        this.contraseña = contraseña;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getLugarTrabajo() {
        return lugarTrabajo;
    }

    public void setLugarTrabajo(String lugarTrabajo) {
        this.lugarTrabajo = lugarTrabajo;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public ArrayList<Integer> getVins() {
        return vins;
    }

    public void setVins(ArrayList<Integer> vins) {
        this.vins = vins;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return  usuario + ";" + contraseña + ";" + nombre + ";" + apellido + ";" + id +";" + nacionalidad +";" + lugarTrabajo + ";" + dinero + ";" + vins+";";
    }

  
    
}
