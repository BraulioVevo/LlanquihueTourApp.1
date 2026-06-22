package com.LlanquihueTourApp1.app;

import com.LlanquihueTourApp1.model.*;
import com.LlanquihueTourApp1.data.LectorArchivo;
import com.LlanquihueTourApp1.service.ColaboradorService;
import com.LlanquihueTourApp1.util.*;
        
import java.util.ArrayList;
import java.util.Scanner;

/**
 *Clase Principal del proyecto Llanquihue Tour 
 */

public class Main {

    public static void main(String[] args) {
        
        System.setOut (new java.io.PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        Scanner scanner = new Scanner(System.in);
        
        
        //rutaArchivo sigue la ruta del archivo de texto
         
        LectorArchivo lector = new LectorArchivo();
        ArrayList<Persona> personas = lector.listaPersonas("DatosPersonas.csv");
        
        ColaboradorService colaboradorService = new ColaboradorService(personas);
        
        int opcion = 0;
        
        do{
            System.out.println("\n=== Gestor de Personas ===");
            System.out.println("1.- Mostrar todas las personas");
            System.out.println("2.- Mostrar solo a usuarios");
            System.out.println("3.- Mostrar todos los colaboradores de Llanquihue Tour");
            System.out.println("4.- Buscar colaborador por cargo");
            System.out.println("5.- Salir del sistema");
            
            try {
             opcion = Integer.parseInt(scanner.nextLine());
             
             switch (opcion){
                 case 1:
                     colaboradorService.listaPersonas();
                     break;
                     
                 case 2:
                     System.out.println("Listado de Usuarios");
                     colaboradorService.mostrarUsuarios();
                     break;
                 case 3:
                     System.out.println("Listado de Colaboradores");
                     colaboradorService.mostrarColaboradores();
                     break;
                     
                 case 4:
                     System.out.println("Ingresar cargo que busca");
                     String cargo = scanner.nextLine();
                     colaboradorService.buscarPorCargo(cargo);
                     break;
                 case 5:
                     System.out.println("Saliendo del sistema...");
                 default:
                     System.out.println("Opcion invalida.");
                     break;
             }
             
            }catch (NumberFormatException e){
                System.out.println("Debe ingresar un número valido");
            }
        } while (opcion !=5);
        scanner.close();
    }
}
