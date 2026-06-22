package com.LlanquihueTourApp1.model;

public class Persona {
    /**
 * La clase persona y será la clase base de este proyecto 
 almacena datos básicos de identificación y contacto.
 */
    private String nombre; 
    private Rut rut;
    private Correo correo;
    private String contacto;
    private Direccion direccion;
/**
 * Constructor de la clase Persona
 * Se almacenan datos básicos de identificación y contacto, tanto para usuarios y trabajadores.
 * @param nombre Representa el nombre de una persona, ya sea usuario o trabajador
 * @param rut Representa el rut de la persona (Relación de composición)
 * @param correo indica el correo de una persona (Relacion composición)
 * @param contacto Representa el Telefono/Celular de contacto 
 * @param direccion Se refiere a la dirección particular de una persona (Relación de composición)
 */
    public Persona(String nombre, Rut rut, Correo correo, String contacto, Direccion direccion) {
        this.nombre = nombre;
        this.rut = rut;
        this.correo = correo;
        this.contacto = contacto;
        this.direccion = direccion;
    }
    
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Rut getRut() {
        return rut;
    }

    public void setRut(Rut rut) {
        this.rut = rut;
    }

    public Correo getCorreo() {
        return correo;
    }

    public void setCorreo(Correo correo) {
        this.correo = correo;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public Direccion getDireccion() {
        return direccion;
    }

     public String getCargo() {
        return "Usuario";
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
/**
     * Obtiene el nombre de la persona
     * @return Retorna el nombre completo, como una cadena de texto(String)
     */
    @Override
    public String toString() {
        return "\n\t~~~ Datos Personales ~~~" +
                "\nNombre: " + nombre +
                "\n" + rut +
                "\n" + correo +
                "\nContacto: " + contacto +
                "\nDireccion: " + direccion +
                "\n"
                ;
    }
}
