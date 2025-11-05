/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_18_whil3;

/**
 *
 * @author pawlu
 */
public class EVA2_18_WHIL3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //estructura basica de while
        //mientras lo que este en los parentesis sea verdadero, se repetira lo que este dentro de los corchetes...
        int i= 2;
        while(i < 11 && 1<=10 ){
            System.out.print(i + " Schnuffel party! ");
            i*=2;}
        //ahora simulando un for con do while?
        System.out.println("Now we are using Do While...");
        System.out.println("");
        i = 1;
        do{System.out.print("Yey!!");
         i++;}
        while(i <= 10);}