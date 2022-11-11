
package laboratorio.excepciones;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Julian jimenez
 */
public class LaboratorioExcepciones {


    public static void main(String[] args) {
        ejer_1_y_2();
        ejer3();
        ejer4();
        ejer5 ();
}   

//excepción sin tratar 
      
public static void ejer_1_y_2(){

    int numero;   
    String cadena="  1"; //tiene espacios entre las comillas y el numero 
    
    try{   
        numero = Integer.parseInt(cadena); // se convierte directamente   
    }catch(NumberFormatException ex){   
        System.out.println("No es un número, es una cadena de texto."+ex.getMessage());//se evalua la conversion del dato y genera error al usuario utilizando try cash    
        }   
    }


public static void ejer3(){
    // ejercicio 3
        int v[]= new int[3];
        try { 
		    for(int i =0; i<5;i++){
		        v[i]=i;               // da una posicion no existente dentro del arreglo 
            
            } 
        }catch (Exception e) {
            for (int j = 0; j < v.length; j++) {
               v[j]=j;                              // se maneja el arreglo hasta la cantidad de posiciones que tiene paara poder imprimirlo correctamente
            }
            System.out.println(Arrays.toString(v));
        }
    }

public static void ejer4(){
    int numero=5, resultado;
        try {
            resultado= numero/0;
        } catch (Exception e) {
            System.out.println("el divisor no puede ser cero");
        }
}

public static void ejer5 (){
    Scanner datos= new Scanner(System.in);
           
        try {
            System.out.println("Ingrese el numerador: ");
            int a = datos.nextInt();
            System.out.println("Ingrese el denominador: ");
            int b = datos.nextInt();
            float aux;
            if (a < 10){
                throw new Exception("el numero es menor que 10");
            }
            aux= a/b;
            System.out.println(a);
            System.out.println(b);
            System.out.println("el resultado es: " + aux);
        } catch (Exception e) {
            System.out.println(e);
        } 
    }
}

    

