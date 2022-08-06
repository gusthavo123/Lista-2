
package com.mycompany.lista2;
import java.util.Scanner;
/**
 *
 * @author gumiy
 */
public class Exercicio5 {
      public static void main(String[] args) {
      Scanner ler = new Scanner (System.in);
      int numero = 0;
      int multi = 0;
      System.out.println ("Informe um número: ");
      numero = (int) ler.nextInt ();
      if (numero > 0){
      multi = numero * 2;
      System.out.println ("O requisito cumprido foi para haver uma multiplicação por 2!"+"\n"+"O resultado é: " + multi);
      } else {
      if (numero < 0){
      multi = numero * 3;   
       }
      }
      System.out.println ("O requisito cumprido foi para haver uma multiplicação por 3!"+"\n"+"O resultado é: " + multi);
   }
}
 
