/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.atividades;

import java.util.Scanner;

/**
 *
 * @author Edutec
 */
public class Atividade {
     public static void main (String[] args){
         Scanner entrada =new Scanner(System.in);
         System.out.println("Digite o primeiro número");
         int numero1 = entrada.nextInt();
         System.out.println("Digite o segundo número");
         int numero2 = entrada.nextInt();
         System.out.println("Digite a operação(A=Adição S=Subtração D=Divisão M=Multiplicação)");
         char operacao = entrada.next().toUpperCase().charAt(0);
         switch (operacao){
             case 'A':{
                  System.out.println("A resposta da Adição será "+ (numero1+numero2));
             }         break;
             case 'S':{
                  System.out.println("A resposta da Subtração será "+ (numero1-numero2));
             }break;
            case 'D':{
                  System.out.println("A resposta da Divisão será "+ (numero1/numero2));
            }break;
          case 'M':{
                  System.out.println("A resposta da Multiplicação será "+ (numero1*numero2));
          break;
             }    
         }
         
         
     }
    
}
