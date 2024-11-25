/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stomas.osoriopedroeva2.Logica;

import com.stomas.osoriopedroeva2.Exceptions.ArtistaException;

/**
 *
 * @author parag
 */
public class Artista {
    //Atributos
    private String nombre;
    private Integer cant_canciones;
    private Integer cant_reproducciones;
    private String genero;
    private Integer total_pago;
    private String aplica_bono;

    //Constructores
    public Artista() {
    }

    public Artista(String nombre,String genero, Integer cant_canciones, Integer cant_reproducciones, Integer total_pago, String aplica_bono) {

        this.nombre = nombre;
        this.genero = genero;
        this.cant_canciones = cant_canciones;
        this.cant_reproducciones = cant_reproducciones;
        this.total_pago = total_pago;
        this.aplica_bono = aplica_bono;
    }
    
    //Acesadores y mutadores
    public String getNombre() {
        return nombre;
    }
    

    public void setNombre(String nombre) throws ArtistaException {
        if (!nombre.matches("[a-zA-Z\\s]+")){
            throw new ArtistaException("El nombre solo debe contener letras y espacios");
        }else{
            this.nombre = nombre;
        }
    }

    public Integer getCant_canciones() throws ArtistaException {
        if(this.cant_canciones <= 0){
            throw new ArtistaException("La cantidad de canciones no puede ser menor o igual a 0");
        }else{
            return cant_canciones;
        }
        
    }

    public void setCant_canciones(Integer cant_canciones){   
            this.cant_canciones = cant_canciones;
    }

    public Integer getCant_reproducciones() throws ArtistaException {
        if(this.cant_reproducciones <= 0){
            throw new ArtistaException("La cantidad de reproducciones no puede ser menor o igual a 0");
        }else{
            return cant_reproducciones;
        }
        
    }

    public void setCant_reproducciones(Integer cant_reproducciones){
            this.cant_reproducciones = cant_reproducciones;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getTotal_pago() {
        return total_pago;
    }

    public void setTotal_pago(Integer total_pago) {
        this.total_pago = total_pago;
    }

    public String getAplica_bono() {
        return aplica_bono;
    }

    public void setAplica_bono(String aplica_bono) {
        this.aplica_bono = aplica_bono;
    }
    
    
    
    
    public Integer calcularPago(){
        Integer respuesta = 0;
        if (cant_reproducciones > cant_canciones){
            respuesta = (cant_reproducciones/1000)+((cant_reproducciones/1000)/10);
        }else{
            respuesta = cant_reproducciones/1000; 
        }
        return respuesta;
    }

    @Override
    public String toString() {
        return "Nombre de artista=" + nombre + ", Cantidad de canciones=" + cant_canciones + ", Cantidad de reproducciones=" + cant_reproducciones + ", Género=" + genero;
    }
    
    
}
