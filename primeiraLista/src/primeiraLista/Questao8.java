package primeiraLista;

import java.util.Scanner;

public class Questao8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner ler = new Scanner(System.in);

	    int i, j, n =10; 
	    
	    int vetor[] = new int[n];
	    
	    for (i = 0; i < n; i++) {
			System.out.println("Digite o numero: ");
			vetor[i] = ler.nextInt();
		}
	    
	    for (i = 0; i < n; i++) {
			
	    	for (j=i+1; j< n; j++) {
				if (vetor[i]==vetor[j]) {
					System.out.println(vetor[i]);
				}
			}
		}
	    
	    
	}
}
//Leia um vetor de 10 posições e verifique se existem valores iguais (no mesmo vetor) e os escreva na tela.