/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_arregl0s;

/**
 *
 * @author pawlu
 */
public class EVA2_4_Arregl0s {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //WE ARE USING ARRAY TODAY, YESS
        //previously using Scanner input = new Scanner(System.in)
        int arreglo[] = new int[5]; 
        //5 espacios y 4 bytes por cada uno.. 20 bytes!
        //un entero ocupa 4 bytes.. pero mil millones??
        //Primer elemento.. 0!, entonces su ultimo elemento es el total de espacios -1, porque hemos comenzado desde 0.
        arreglo[0] = 100;
        arreglo[1] = 200;
        arreglo[2] = 300;
        arreglo[3] = 400;
        arreglo[4] = 500;
        
        System.out.println("PRIMERA POSICION!!! " + arreglo[0]);
        System.out.println("SEGUNDA POSICION!!! " + arreglo[1]);
        System.out.println("TERCERA POSICION!!! " + arreglo[2]);
        System.out.println("CUARTA POSICION!!! " + arreglo[3]);
        System.out.println("QUINTA POSICION!!! " + arreglo[4]);
    }
    
}
