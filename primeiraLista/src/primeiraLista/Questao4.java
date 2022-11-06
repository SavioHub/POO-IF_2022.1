package primeiraLista;

import java.util.Scanner;

public class Questao4{
  public static void main(String args[]){
	  
    Scanner ler = new Scanner(System.in);

    int n = 10; 
    int vetor[] = new int[n];
    int i;

// Entrada de Dados
    for (i=0; i<n; i++) {
      System.out.printf("Informe %2d° valor de %d numeros: ", (i+1), n);
      vetor[i] = ler.nextInt();
    }

// Processamento: somar todos os valores, definir o maior valor e o menor.

    int soma = 0;
    int menor = vetor[0]; 
    int maior = vetor[0];
    
    for (i=0; i<n; i++) {
      soma = soma + vetor[i];

      if (vetor[i] < menor)
         menor = vetor[i];

      if (vetor[i] > maior)
         maior = vetor[i];
    }
    
// Saída de dados
    System.out.printf("\n");
    for (i=0; i<n; i++) {
    	
      if (vetor[i] == menor)
        System.out.printf("v[%d] = %2d <--- menor valor\n", i, vetor[i]);
      else if (vetor[i] == maior)
              System.out.printf("v[%d] = %2d <--- maior valor\n", i, vetor[i]);
    }
  }
}
