/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        // TODO code application logic here
        
        
        String miCiudad = obtenerCiudadMayuscula("Loja");
        System.out.printf("%s\n", miCiudad);
        //obtenerMultiplicacion(7,50);
        /* Aqui llamo directamenta a obtenerMultiplicacion por que es un 
        procedimiento y 
        */
        String miMensaje= obtenerMultiplicacion(7,50);
        /*n En cambio aqui obtenerMultiplicacion es una funcion y espero que me 
        retorne un valor en este caso de tipo cadena 
        
        */
        System.out.printf("%s", miMensaje);
    }
     public static String obtenerMultiplicacion(int tabla, int limite){
        int m=0;
        String cadena="";
        for (int i = 1; i <= limite; i++) {
            m= tabla*i;
            cadena = String.format("%s%d + %d = %d\n", cadena, 
                    tabla, i, m);

        }
        return cadena;
    }
    
    public static String obtenerCiudadMayuscula(String m){
        String m2 = m.toUpperCase();
        return m2;
    }
    
    /*public static void obtenerMultiplicacion(int tabla, int limite){
        int m=0;
        String cadena="";
        for (int i = 1; i <= limite; i++) {
            m= tabla*i;
            cadena = String.format("%s%d + %d = %d\n", cadena, 
                    tabla, i, m);

        }
        System.out.printf("%s", cadena);
    }*/
    
    public static String obtenerNombre(){
        return "Luis";
    }
    
    
}
