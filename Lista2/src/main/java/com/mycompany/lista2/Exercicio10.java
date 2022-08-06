
package com.mycompany.lista2;
import java.util.Scanner;
/**
 *
 * @author gumiy
 */
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int n1, n2, n3;
        System.out.println("Informe a medida do primeiro lado: ");
        n1 = (int) ler.nextInt ();
        System.out.println("Informe a medida do segundo lado: ");
        n2 = (int) ler.nextInt ();
        System.out.println("Informe a medida do terceiro lado: ");
        n3 = (int) ler.nextInt ();
        if (n1 < n2 + n3 || n2 < n1 + n3 || n3 < n1 + n2){ 
            if (n1 == n2 || n2 == n3){ 
                System.out.println("O triangulo é equilátero!");
            }else if (n1 == n2 || n1 == n3 || n2 == n3){
                System.out.println("O triangulo é isóceles!");
            }else{
                System.out.println("O triangulo é escaleno!");
            }
        } 
    }
}
