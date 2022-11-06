package sisteminha;

import java.util.Scanner;

public class Sistema {
	public static Scanner scan = new Scanner(System.in);
	//variaveis de login
	static String userName = "admin", passLogin="123";
	
	public static int tam = 10; //var que indica o tamando dos vetores 
	public static int aux, count=10, i=0, idClientes=0;
	public static int ver[] = new int[tam]; //vetor de verificação
    public static String nomeCliente[] = new String[tam]; //vetor que armazena o nome
	public static int idCliente[] = new int[tam];
	public static int historicoId[] = new int[tam];
    //estoque de produtos
    public static String produtos[] = {"arroz", "feijão", "carne", "frango", "açucar", "açucar"};
    public static double preco[] = {5.90, 8.50, 35.90, 13.50, 5.50, 8.80};	
    public static int quantidadeProduto[] = {45,34,22,12,54,12};
    public static int opcaoMenu = 0; //var do menu
	public static boolean logado = logar();
	
	public static void main(String[] args) {
		int opcaoMenu = 0;
		do {
			if (logado) {
				
				opcaoMenu = menu();
				
				switch (opcaoMenu) {
				case 1:
					mostrarProdutos();
					
					System.out.println("Pressione 1 para abrir Menu");
					System.out.println("Escolha:");
					opcaoMenu = scan.nextInt();
					while(opcaoMenu!=1) {
						System.out.println("Opção inválida!, tente novamente\n");
						System.out.println("Pressione 1 para abrir Menu");
						System.out.println("Escolha:");
						opcaoMenu = scan.nextInt();
					}
					break;
					
				case 2:
					mostrarCliente();
					break;
					
				case 3:
					cadastrarCliente();
					break;

				case 4:
					System.out.println("dinheiro em caixa\n");
					
					System.out.println("Pressione 1 para abrir Menu");
					System.out.println("Escolha:");
					opcaoMenu = scan.nextInt();
					while(opcaoMenu!=1) {
						System.out.println("Opção inválida!, tente novamente\n");
						System.out.println("Pressione 1 para abrir Menu");
						System.out.println("Escolha:");
						opcaoMenu = scan.nextInt();
					}
						
					break;
				case 5:
					System.out.println("Vender produtos");
					System.out.println("Pressione 1 para abrir Menu");
					System.out.println("Escolha:");
					opcaoMenu = scan.nextInt();
					while(opcaoMenu!=1) {
						System.out.println("Opção inválida!, tente novamente\n");
						System.out.println("Pressione 1 para abrir Menu");
						System.out.println("Escolha:");
						opcaoMenu = scan.nextInt();
					}
					
					break;
				case 6:
					limparTela();
				default:
                    System.out.println("opção inválida!");
                    break;
				}
				
                if(opcaoMenu == 7){
                    System.out.println("- - - - - - Desconectado! COM SUCESSO - - - - - ");
                    break;
                }
			}
		} while (opcaoMenu !=5);

	}


//funções
public static boolean logar() {
             
     boolean logado = false;
     String user, pass;
     
     System.out.println("-------Login do Sistema------");
     
     System.out.println("Informe o nome de usuário:");
     user = scan.nextLine();
     System.out.println("Informe a senha de login:");
     pass = scan.nextLine();
     
     if(user.equals(userName)&&pass.equals(passLogin)){
         logado = true;
     }else{
         System.out.println("Usuario Incorreto ou Senha Incorreta!!!\n\n");
         return logar();
     }
     
 return logado;
 }
 
 public static void cadastrarCliente() {
		System.out.println("Informe o nome do cliente para cadastro:");
		nomeCliente[i] = scan.nextLine();
		nomeCliente[i] = scan.nextLine();
		System.out.println("Digite o ID:");
		idCliente[i] = scan.nextInt();
		i++;
		
		if(i>0) {
	      	System.out.println("Cliente cadastrado com sucesso!");
	     }


		System.out.println("Pressione 0 para voltar ao menu do programa ou 1 para cadastrar mais clientes");
		System.out.println("Escolha:");
		opcaoMenu = scan.nextInt();
		if(opcaoMenu==0) {
			menu();
		}
		
		while(opcaoMenu==1) {
			cadastrarCliente();
			
			System.out.println("Pressione 0 para voltar ao menu do programa ou 1 para cadastrar mais clientes");
			System.out.println("Escolha:");
			opcaoMenu = scan.nextInt();
			
			while(opcaoMenu!=0 && opcaoMenu!=1) {
				System.out.println("Erro, tente novamente!\n");
				System.out.println("Pressione 1 para cadastrar mais clientes ou qualquer numero para abrir Menu");
				System.out.println("Escolha:");
				opcaoMenu = scan.nextInt();
			}
		
		}
// 

 } 

 public static void mostrarCliente() {
     System.out.println("\n--------------CLIENTES-------------");
     for(int i = 0; i <10; i++){
         if(nomeCliente[i]!=null) {
        	 System.out.println("ID:" + idCliente[i] + " - Cliente:" + nomeCliente[i]);
   	}else {
   		nomeCliente[i]="ID:";
   	}

     }
		System.out.println("Pressione 1 para abrir Menu");
		System.out.println("Escolha:");
		opcaoMenu = scan.nextInt();
		if(opcaoMenu==1) {
			menu();
		}
		while(opcaoMenu!=1) {
			System.out.println("Opção inválida!, tente novamente\n");
			System.out.println("Pressione 1 para abrir Menu");
			System.out.println("Escolha:");
			opcaoMenu = scan.nextInt();
		}
 }
 
 public static void mostrarProdutos(){
     
     System.out.println("\n--------------PRODUTOS-------------");
     
     for(int i = 0; i <5; i++){
         System.out.println("ID:" + (i+1) + " - Produto:" + produtos[i] + " - Preço: R$" + preco[i] + " - Quantidade em estoque: " + quantidadeProduto[i]);
         }

 }
 
 public static void limparTela() {
		for (int i = 0; i < 50; ++i) { 
			System.out.println();
 }
 }
	public static int menu() {
		System.out.println("------------ Menu-----------\n");
		System.out.println("1 - Mostrar produtos em estoque");
		System.out.println("2 - Mostrar clientes");
		System.out.println("3 - Cadastrar novo cliente");
		System.out.println("4 - Mostrar dinheiro em caixa");
		System.out.println("5 - vender produtos");
		System.out.println("6 - Limpar Tela");
		System.out.println("7 - sair");
		System.out.println("------------------------------\n");
		System.out.println("O que deseja fazer?");
		System.out.println("Escolha:");
		int opcao = scan.nextInt();
		return opcao;
	}
}
	//final das funções