package sistemajava.com.br;

import java.util.Scanner;

public class CadastroClientes {
	public static Scanner scan = new Scanner(System.in);
	//variaveis de login
	static String userName = "admin", passLogin="123";
	//var que indica o tamando dos vetores
	public static int tam = 10;  
	
	public static int i=0, idClientes=0, op;
	//var que armazena os clientes
    public static String nomeCliente[] = new String[tam]; 
	public static int idCliente[] = new int[tam];
	public static int historicoId[] = new int[tam];
    //estoque de produtos
    public static String produtos[] = new String[tam];
    public static double precoProdutos[] = new double[tam];	
    public static int quantidadeProduto[] = new int[tam];
    public static int idProdutos[] = new int[tam];
    //login
	public static boolean logado = logar();
	
	public static void main(String[] args) {
		int opcaoMenu = 0;
		do {
			if (logado) {
				
				opcaoMenu = menu();
				
				switch (opcaoMenu) {
				case 1:
					mostrarProdutos();
		
					break;
					
				case 2:
					mostrarCliente();
					break;
					
				case 3:
					cadastrarCliente();
					break;

				case 4:
		
						
					break;
				case 5:
					
					break;
				case 6:
					novoProduto();
				case 7:
					limparTela();

				default:
                    System.out.println("opção inválida!");
                    break;
				}
				
                if(opcaoMenu == 8){
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

public static int menu() {
	System.out.println("------------ Menu-----------\n");
	System.out.println("1 - Mostrar produtos em estoque");
	System.out.println("2 - Mostrar clientes");
	System.out.println("3 - Cadastrar novo cliente");
	System.out.println("4 - Mostrar dinheiro em caixa");
	System.out.println("5 - vender produtos");
	System.out.println("6 - Adicionar novo produto");
	System.out.println("7 - Limpar Tela");
	System.out.println("8 - sair");
	System.out.println("------------------------------\n");
	System.out.println("O que deseja fazer?");
	System.out.println("Escolha:");
	int opcao = scan.nextInt();
	return opcao;
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
		op = scan.nextInt();
		if(op==0) {
			menu();
		}
		
		while(op==1) {
			cadastrarCliente();
			
			System.out.println("Pressione 0 para voltar ao menu do programa ou 1 para cadastrar mais clientes");
			System.out.println("Escolha:");
			op = scan.nextInt();
			if(op==0) {
				menu();
			}
			while(op!=0 && op!=1) {
				System.out.println("Erro, tente novamente!\n");
				System.out.println("Pressione 1 para cadastrar mais clientes ou qualquer numero para abrir Menu");
				System.out.println("Escolha:");
				op = scan.nextInt();
		
			}
		
		}
// 

 } 

 public static void mostrarCliente() {
     System.out.println("\n--------------CLIENTES-------------");
     for(int i = 0; i <10; i++){
         if(nomeCliente[i]==null) {
        	 System.out.println("Vazio!");
   	}else {
   		System.out.println("ID:" + idCliente[i] + " - Cliente:" + nomeCliente[i]);
   	}

     }
		System.out.println("Pressione 1 para abrir Menu");
		System.out.println("Escolha:");
		op = scan.nextInt();
		while(op!=1) {
			System.out.println("Opção inválida!, tente novamente\n");
			System.out.println("Pressione 1 para abrir Menu");
			System.out.println("Escolha:");
			op = scan.nextInt();
		}
 }
 
 public static void mostrarProdutos(){
     
     System.out.println("\n--------------PRODUTOS-------------");
     
     for(int i = 0; i <tam; i++){
    	 if(produtos[i]==null) {
    		 System.out.println(" ");
    	 }else {
    		 System.out.println("ID:" + idProdutos[i] + " - Produto:" + produtos[i] + " - Preço: R$" + precoProdutos[i] + " - Quantidade em estoque: " + quantidadeProduto[i]);
    	 }
     }
		
		System.out.println("Pressione 1 para abrir Menu");
		System.out.println("Escolha:");
		op = scan.nextInt();
		while(op!=1) {
			System.out.println("Opção inválida!, tente novamente\n");
			System.out.println("Pressione 1 para abrir Menu");
			System.out.println("Escolha:");
			op = scan.nextInt();
		}

 }
 
 public static void novoProduto() {
	 System.out.println("-------------Adicionar novo produto-----------\n");
	 System.out.println("Nome do produto:");
	 produtos[i]=scan.nextLine();
	 produtos[i]=scan.nextLine();
	 System.out.println("ID do produto:");
	 idProdutos[i]=scan.nextInt();
	 System.out.println("Preço do produto:");
	 precoProdutos[i]=scan.nextDouble();
	 System.out.println("Quantidade de produto:");
	 quantidadeProduto[i]=scan.nextInt();
	 i++;
	 
		System.out.println("Pressione 0 para voltar ao menu do programa ou 1 para cadastrar mais produtos");
		System.out.println("Escolha:");
		op = scan.nextInt();
		if(op==0) {
			menu();
		}
		while(op==1) {
			novoProduto();
//			System.out.println("Pressione 1 para abrir Menu");
//			System.out.println("Escolha:");
//			op = scan.nextInt();
			while(op!=0 && op!=1) {
				System.out.println("Opção inválida!, tente novamente\n");
				System.out.println("Pressione 1 para abrir Menu");
				System.out.println("Escolha:");
				op = scan.nextInt();
			}
		}
	 
 }
 
 public static void limparTela() {
		for (int i = 0; i < 100; ++i) { 
			System.out.println();
		}
 }

}
	//final das funções