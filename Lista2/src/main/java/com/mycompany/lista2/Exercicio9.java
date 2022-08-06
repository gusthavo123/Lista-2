
package com.mycompany.lista2;
import java.util.Scanner;
/**
 *
 * @author gumiy
 */
public class Exercicio9 {
    public static void main(String[] args) {
      Scanner ler = new Scanner (System.in);
      float a, calc;
      String sexo = null;
        System.out.println("Informe aqui sua altura: ");
        a = (float) ler.nextFloat ();
        System.out.println("Informe aqui seu sexo" + "\n" + "M - Masculino!" + "\n" + "F - Feminino!");
        sexo = ler.next ();
        if (sexo.equals ("M")){
        calc = (float) (72.7 * a) - 58;
        System.out.println("O peso ideal é de: " + calc);
        } else {
        if (sexo.equals ("F")){
         }
        }
        calc = (float) ((float) (62.1 * a) - 44.7);
            System.out.println("O peso ideal é de: " + calc);  
    }
}