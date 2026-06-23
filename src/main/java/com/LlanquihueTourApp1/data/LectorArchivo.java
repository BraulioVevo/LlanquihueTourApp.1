package com.LlanquihueTourApp1.data;

import com.LlanquihueTourApp1.model.*;
import com.LlanquihueTourApp1.util.correoInvalidoException;
import com.LlanquihueTourApp1.util.rutInvalidoException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
      

 // Clase que se encarga de leer datos desde un archivo .txt o .csv
 
public class LectorArchivo {
    
    /**
     * Clase encargada de leer archivo de texto y procesar cada línea 
     * @param rutaArchivo String con la ubicación del archivo .txt y que debe leer
     * @return ArrayList de objetos 'Persona' con los datos del archivo
     */
    public ArrayList <Persona> listaPersonas (String rutaArchivo) {
        //Se crea lista dinámica donde se almacenan los datos
        ArrayList<Persona> listaPersonas = new ArrayList<>();
        
        try {
            //se abre el archivo para su lectura
            BufferedReader lector = new BufferedReader (new FileReader(rutaArchivo));
            
            //Lectura, linea por linea
            String linea;
            
            while ((linea = lector.readLine())!= null){
                
                //Realizamos separación de linea usando coma (",")
                String [] partes = linea.split(",");
                
                //Validamos que tenga todos los atributos
                if (partes.length == 10){
                    
                    //se realiza la conversión de datos al tipo correspondiente
                    String nombre = partes[0].trim();
                    String numeroRut = partes[1].trim();
                    String direccionCorreo = partes[2].trim();
                    String contacto = partes[3].trim();
                    
                    //datos Dirección 
                    String calle = partes[4].trim();
                    int numero = Integer.parseInt(partes[5].trim());
                    String comuna = partes[6].trim();
                    String ciudad = partes[7].trim();
                    String region = partes[8].trim();
                    
                    String cargo = partes[9].trim();
                try{
                    //Se crean los objetos con los datos leidos
                    Rut rut = new Rut (numeroRut, nombre);
                    Correo correo = new Correo(direccionCorreo, nombre);
                    Direccion direccion = new Direccion(calle,numero,comuna,ciudad,region);
                    /**
                     * Si se encuentra con una Persona que no tiene un cargo asociado, 
                     * se creara un Usuario/Cliente
                     */
                    if (cargo.equalsIgnoreCase("Usuario")){
                        Persona usuario = new Persona(nombre, rut, correo, contacto, direccion);
                        listaPersonas.add(usuario);
                    }else{
                    Colaborador colaborador = new Colaborador (nombre, rut, correo,contacto ,direccion,cargo);
                        //Agregamos el objeto a la lista
                        listaPersonas.add(colaborador);
                        }
                    }catch (rutInvalidoException | correoInvalidoException e){
                        System.out.println("Error por datos invalidos : " + e.getMessage());
                    }
                }
            }
                }catch (IOException e){
            System.out.println("Error al leer archivo: " + e.getMessage());
        }
   
    return listaPersonas; 
    }
  }


