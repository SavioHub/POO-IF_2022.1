package primeiraLista;
import java.util.Arrays;
import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n = 7;
		int[] vetor = new int[n];

		
		// Entrada de Dados
		for (int i = 0; i < n; i++) {
			System.out.printf("Informe 20 numeros:");
			vetor[i] = ler.nextInt();
		}
		
		Arrays.sort(vetor); //Comando para ordenar os números do vetor em ordem crescente

		// Processamento: 
	    System.out.println("Em ordem decrescente.");
	    
	    for(int i =0; i < vetor.length; i++){
	        vetor[i] = vetor.length - i;
	        System.out.println(vetor[i]);

	    }
		
		
	}
}

//02) Leia um vetor de 20 posições e mostre-o. Em seguida, mostre o conteúdo em ordem decrescente.

