package com.LlanquihueTourApp1.model;

public class Colaborador extends Persona{
    
        private String cargo;

    /**
     * Esta clase hereda los atributos de persona
     * @param cargo con este String se representa el cargo que tiene una persona
     * en caso de que sea trabajador o colaborador de Llanquihue tour.
     */
    public Colaborador(String nombre, Rut rut, Correo correo, String contacto, Direccion direccion, String cargo) {
        super(nombre, rut, correo, contacto, direccion);
        this.cargo = cargo;
    }
@Override
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    /**
     * @return Sobrescribe el método y trae todos los datos personales formateados
 por la clase persona.
     */
   @Override
    public String toString(){
        return super.toString()+
                "~~~ Puesto en Llanquihue Tour ~~~" +
                "\nCargo: " + cargo +
                "\n";
    }
    
    
    
}
