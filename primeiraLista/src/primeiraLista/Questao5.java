package primeiraLista;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Questao5 {

	public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			
	        //instância um objeto da classe Random usando o construtor padrão
	        Random gerador = new Random();
	        
	        int cod, n;
	        
	        
	        String [] times = {"Flamengo cód [22]", "Vasco[12]", "Fluminense [2]", "Atletico Paranaense [9]", "Atletico Mineiro [7]", "Palmeiras [1]", "Santos [122]", "Sao Paulo [244]", "Gremio [98]", "Inter [123]"};

	        String [] mensagem = {"Anthonius Figueiredo é um safado!", "Luis e Aninha, casalzinho de ADS.", "Eu detesto windows!", "Não aguento estudar, fazer estágio,malhar e estudar em casa", "Antonius é um traste kkkkk"};
	        
	        
	        System.out.println("\nQuantos times vc quer?");
	        n = ler.nextInt();
	        
	        //digitar código para aparecer o time escolhido
	        for (int i =0; i < n; i++) {
	        	System.out.println("\nDigite o cód do time: ");
	        	cod = ler.nextInt();
		        
		        if (cod == 22) {
					System.out.println(times[0]);
					System.out.println(mensagem[gerador.nextInt(mensagem.length)]);
				} 
		        else if (cod == 12){
					System.out.println(times[1]);
					System.out.println(mensagem[gerador.nextInt(mensagem.length)]);
				}
		        else if (cod == 2){
					System.out.println(times[2]);
					System.out.println(mensagem[gerador.nextInt(mensagem.length)]);
				}
		        else if (cod == 9){
					System.out.println(times[3]);
					System.out.println(mensagem[gerador.nextInt(mensagem.length)]);				}
		        else if (cod == 7){
					System.out.println(times[4]);
					System.out.println(mensagem[gerador.nextInt(mensagem.length)]);				}
		        else if (cod == 1){
					System.out.println(times[5]);
					System.out.println(mensagem[gerador.nextInt(mensagem.length)]);				}
		        else if (cod == 122){
					System.out.println(times[6]);
					System.out.println(mensagem[gerador.nextInt(mensagem.length)]);				}
		        else if (cod == 244){
					System.out.println(times[7]);
					System.out.println(mensagem[gerador.nextInt(mensagem.length)]);
				}
		        else if (cod == 98){
					System.out.println(times[8]);
					System.out.println(mensagem[gerador.nextInt(mensagem.length)]);				}
		        else if (cod == 123){
					System.out.println(times[9]);
					System.out.println(mensagem[gerador.nextInt(mensagem.length)]);		        }
		        else {
					System.out.println("Código inválido, tente novamente!");

				}
	        }
        	
	        
	        
	    }
	}

//Dois vetores, o primeiro com nome de 10 times e 
//o segundo com mensagens aleatórias. 
//O usuário deverá informar o código que mostrará o time e uma mensagem sorteada do segundo vetor, mostrar na tela. 
//Pesquise sobre java.util.Random.