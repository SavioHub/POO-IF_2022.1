package primeiraLista;
import java.util.Scanner;

public class Questao7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int num, aux=0;
	
		do  {
			System.out.println("Digite o numero: ");
			num = ler.nextInt();
			
			if (num > 100 && num <200) {
				aux++;
			}
			
		}while (num != 0);
			
			System.out.printf("foram digitados %2d números entre 100 e 200.\n",aux);
			System.out.printf("numeros digitados:%2d",num);
		}
	
	}

//Leia vários números e informe quantos desses números entre 100 e 200 foram digitados. 
//Quando o valor 0 (zero) for lido o algoritmo deverá cessar sua execução.

