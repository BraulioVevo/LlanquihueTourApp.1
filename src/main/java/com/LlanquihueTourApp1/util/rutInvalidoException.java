package com.LlanquihueTourApp1.util;


/**
 * Excepción personalizada para RUT invalido
 */
public class rutInvalidoException extends Exception {
    
    public rutInvalidoException(String mensaje){
        super(mensaje);
        
    }
}
