
package com.mycompany.lista2;
import java.util.Scanner;
/**
 *
 * @author gumiy
 */
public class Lista2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int a, b, c, soma;
        System.out.println ("Informe o valor de A: ");
        a = (int) ler.nextInt();
         System.out.println ("Informe o valor de B: ");
        b = (int) ler.nextInt ();
        System.out.println ("Informe o valor de C: ");
        c = (int) ler.nextInt ();
        soma = a + b;
        if (soma < c){
        System.out.println("A soma de A e B é menor que C");
        }else{ 
        System.out.println ("As condicionais não foram atingidas!");
        }   
    }
}
