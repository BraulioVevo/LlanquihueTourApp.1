package com.LlanquihueTourApp1.service;

import com.LlanquihueTourApp1.model.Persona;
import com.LlanquihueTourApp1.model.Colaborador;

import java.util.ArrayList;
        
public class ColaboradorService {
    
    private ArrayList<Persona> personas;
    
    public ColaboradorService(ArrayList<Persona> personas){this.personas = personas;}
        /**
         * listaPersonas muestra todos los registros, sin distinción
         */
        public void listaPersonas(){
            if (personas.isEmpty()){
                System.out.println("No hay registro de usuarios o colaboradores.");
            }else{
                for (Persona persona : personas){
                    System.out.println(persona);   
                }
            }
        }
        /**
         * Filtro para los usuarios de Llanquihue Tour 
         * Muestra la lista de personas que NO pertenecen a la subclase Colaborador
         */
        public void mostrarUsuarios(){
            boolean encontrado = false;
            
            for (Persona persona : personas){
                if(persona != null && persona.getCargo().equalsIgnoreCase("Usuario")){
                    System.out.println(persona);
                    encontrado = true;
                }
            }
                if (!encontrado){
                    System.out.println("No hay usuarios en el archivo");
                }
            }
        /**
         * Filtro para los colaboradores de Llanquihue Tour
         * Muestra la lista de personas que trabajan con Llanquihue Tour
         */
        public void mostrarColaboradores(){
            boolean encontrado = false;
            
            for (Persona persona : personas){
                if (persona != null && !persona.getCargo().equalsIgnoreCase("Usuario")) {
                    System.out.println(persona);
                    
                    encontrado = true;
                }
            }
            if (!encontrado){
                System.out.println("No hay trabajadores asociados");
            }
        }
        /**
         * Filtro para buscar un Cargo especifico
         * @param cargoBuscado se refiere al nombre del cargo buscado
         */
        public void buscarPorCargo(String cargoBuscado){
            boolean encontrado = false;
            
            for (Persona persona:personas){
                if (persona != null && persona.getCargo().equalsIgnoreCase(cargoBuscado)){
                    System.out.println(persona);
                    encontrado = true;
                }
            }
            if(!encontrado){
                System.out.println("No se encontraron cargos con ese nombre");
            }
        }

}

