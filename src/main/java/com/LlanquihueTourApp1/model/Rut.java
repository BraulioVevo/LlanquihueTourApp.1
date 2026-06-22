package com.LlanquihueTourApp1.model;

import com.LlanquihueTourApp1.util.rutInvalidoException;

public class Rut {
    
        private String numero;
/**
 * Constructor de la clase Rut.Valida que el formato ingresado sea el correcto
 * @param numeroRut String(cadena de texto) con el formato "12345678-K".
 * @param indicador String para saber que instancia es la que falla
 * @throws rutInvalidoException En caso de que el formato no coincida con el patron numerico y guíon
 */    
    public Rut(String numeroRut, String indicador) throws rutInvalidoException{
        //Validación simple: solo permite numeros y letras en el codigo verificador.(numero o K)
        if (!numeroRut.matches("[0-9]+-[0-9kK]")){
            throw new rutInvalidoException("Formato de RUT invalido para: " + indicador);
        }
        this.numero = numeroRut;
    }
    /**
     * @return Retorna numero rut.
     */
    public String getNumero(){
        return numero;
    }
   @Override
       public String toString(){
        return "RUT: " + numero;
   }
}
