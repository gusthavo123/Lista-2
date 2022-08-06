
package com.mycompany.lista2;
import java.util.Scanner;
/**
 *
 * @author gumiy
 */
public class Exercicio11 {
    public static void main(String[] args) {
      Scanner ler = new Scanner (System.in);  
      float din, des = 0, juros = 0, op = 0;
        System.out.println("Informe o preço aqui: ");
        din = (float) ler.nextFloat ();
        System.out.println("De qual forma você gostaria de pagar:?" + "\n" + "1 - Dinheiro ou Cheque" + "\n" + "2 -A vista ou cartão" + "\n" + "3 - Em duas vezes, preço normal" + "\n" + "4 - Em três vezes, preço normal, mais 10% de juros");
        op = (int) ler.nextFloat ();
        if (op == 1){
            System.out.println("Selecionado Dinheiro ou cheque!");
            des = (float) (din * 0.10);
            System.out.println (des + "Recebeu 10% de desconto!");
        }
        if (op == 2){ 
            System.out.println("Selecionado a Vista!");
            des = (float) (din * 0.15);
            System.out.println(des + "Recebeu 15% de desconto!");
        }
        if (op == 3){
            System.out.println("Selecionado em duas vezes!");
            System.out.println(din + "Você não recebeu desconto!");
        } 
        if (op ==4){ 
            System.out.println("Selecionado em três vezes!");
            des = (float) (din * 0.10);
            juros = (float) (juros + din);
            System.out.println(juros + "Recenbeu 10% de juros!");
        }
    }
}
