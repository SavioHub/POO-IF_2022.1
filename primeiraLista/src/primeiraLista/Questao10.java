package primeiraLista;

import java.util.Scanner;

public class Questao10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int num=1, soma=0, qtd=0, p =0, i, impar=0;
		int v[] = new int[6];
		
		for(i=0; i<6; i++) {
			System.out.println("Digite o numero");			
			v[i] = ler.nextInt();
			
			//soma dos numeros pares
			 if(v[i] % 2 == 0)
		        {
		             soma = soma + v[i];
//		             qtd++; 
//		             
		        }else {//soma dos numeros impares
		        	impar = impar + v[i];
		        	impar++;
		        }
			 //numeros pares digitados
			 if(v[i] % 2 == 0) {
				 System.out.println("numero par: "+v[i]);
			 }else {
				 System.out.println("numeros impares: "+v[i]);
			 }
		}
		
			
			
//		
//		System.out.println("Numeros pares digitados: %2d",);
		System.out.printf("A soma dos numeros pares digitados: %2d\n", soma);
//		System.out.printf("os numeros impares digitados: %2d\n", );
		System.out.printf("Qtd numeros impares digitados: %2d\n", impar);
		
	}

}

// Faça um programa que receba 6 números inteiros e mostre: ´
//• Os números pares digitados; ´
//• A soma dos números pares digitados; ´
//• Os números ímpares digitados;
//• A quantidade de números ímpares digitados;