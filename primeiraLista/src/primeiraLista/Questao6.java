package primeiraLista;
import java.util.Scanner;

public class Questao6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);

		int n = 3;
		int v1[] = new int[n];
		int v2[] = new int[n];
		int v3[] = new int[n];
		
		//entrada de dados dos dois vetores
		for (int i = 0; i < n; i++) {
			System.out.printf("Digite o %2d° de %2d numeros do primeiro vetor: \n", (i+1), n);
			v1[i] = ler.nextInt();
		}
		for (int i = 0; i < n; i++) {
			System.out.printf("Digite o %2d° de %2d numeros do segundo vetor: \n", (i+1), n);
			v2[i] = ler.nextInt();
		}
		
		//soma dos dados dos vetores 1 e 2 e saida com vetor 3
		for (int i = 0; i < n; i++) {
			v3[i] = (v1[i] * v2[i]);
			
			System.out.println(v3[i]);
		}
	}

}
