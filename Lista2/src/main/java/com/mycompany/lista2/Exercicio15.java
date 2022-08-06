
package com.mycompany.lista2;
import java.util.Scanner;
/**
 *
 * @author gumiy
 */
public class Exercicio15 {
    public static void main(String[] args) {
      Scanner ler = new Scanner (System.in);
      int a1, a2, a3;
        System.out.println("Informe o primeiro angulo: ");
        a1 = (int) ler.nextInt ();
        System.out.println("Informe o segundo angulo: ");
        a2 = (int) ler.nextInt ();
        System.out.println("Informe o terceiro angulo: ");
        a3 = (int) ler.nextInt ();
        if (a1 == 90 || a2 == 90 || a3 == 90){
        System.out.println("É um triangulo retângulo!");  
        } else if (a1 > 90 || a2 > 90 || a3 > 90){
        System.out.println ("É um triangulo com angulo obtuso!");
        } else if (a1 < 90 || a2 < 90 || a3 < 90){
            System.out.println("É um triangulo com angulo augo!");
        }
    }
}
