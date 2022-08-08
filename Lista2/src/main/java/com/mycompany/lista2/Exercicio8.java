
package com.mycompany.lista2;
import java.util.Scanner;
/**
 *
 * @author gumiy
 */
public class Exercicio8 {
    public static void main(String[] args) {
       Scanner ler = new Scanner (System.in);
       int n1, n2, n3, n4, n5;
        System.out.println("Informe o primeiro número: ");
        n1 = (int) ler.nextInt ();
        System.out.println("Informe o segundo número: ");
        n2 = (int) ler.nextInt ();
        System.out.println("Informe o terceiro número: ");
        n3 = (int) ler.nextInt ();
        System.out.println("Informe o quarto número: ");
        n4 = (int) ler.nextInt ();
        System.out.println ("Informe o quinto número: ");
        n5 = (int) ler.nextInt ();
        if ((n1 < n2 || n2 < n3  || n3 < n4 || n4 < n5)){
            System.out.println("A ordem dos números é: " + n1 + n2 + n3 + n4 + n5);   
        } else {
        if (n1 < n2 || n3 < n2 || n2 < n3 || n3 < n4 || n4 < n5){
        } else {
        if (n1 < n2 || n3 < n2 || n2 > n3 || n3 < n4 || n4 < n5){
           System.out.println("A ordem dos números é: " + n1 + n3 + n2 + n4 + n5);   
        } else {
        if (n1 < n2 || n3 < n2 || n2 > n3 || n3 > n4 || n4 < n5){
           System.out.println("A ordem dos números é: " + n1 + n3 + n2 + n4 + n5);
        } else {
        if (n1 < n2 || n3 < n2 || n2 > n3 || n3 > n4 || n4 < n5){
           System.out.println("A ordem dos números é: " + n1 + n3 + n2 + n4 + n5);
           }
         }
       } 
     }
   }
 }
}
