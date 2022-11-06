package primeiraLista;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n = 5;
		double notas[] = new double[n];
		double soma = 0;
		double media = 0;
		
		// Entrada de Dados
		for (int i = 0; i < n; i++) {
			System.out.printf("Informe 5 notas:");
			notas[i] = ler.nextDouble();
		}
		
		// Processamento: somar todos os valores, logo após fazer a média
		for (int i = 0; i < n; i++) {
			soma = soma + notas[i];
			media = soma / n;
		}
		
		
		//saida de dados
		System.out.printf("A média aritimética =%.2f", media);
		
	}

}
//01) Sejam informadas 5 notas no vetor "notas". Posteriormente acesse o mesmo vetor e calcule a 
//média aritmédia entre as notas. Mostre a média ao final.
