package primeiraLista;

import java.util.Scanner;

public class SistemaTeste {
	
	public static boolean logado = logar();
	public static final boolean Boolean = false;
	public static String produtos[] = {"ID = 0: Arroz", "ID = 1: Feijão", "D = 2: Carne", "ID = 3: Macarrão", "ID = 4: Frango"};
	public static double preço[] = {5.50, 8.50, 42.90, 3.15, 11.50};
	public static int estoque[] = {50, 50, 50, 50, 50};
	public static String cadastroClientes[] = new String[10];
	public static int IDCliente[] = new int[10];
	public static int historicoID[] = new int[10];
	public static double soma = 0;
	public static String confirmar, nomeProduto;
	public static Scanner scan = new Scanner(System.in);
	public static int cmd = 0, i=0, quant=0, IDcliente=0, IDProduto;
	public static double caixa = 0;
	//variaveis de login
	static String userName = "savio", passLogin="123";
	
public static void main(String[] args) {
	
	if(logado == true) {
		menu();
		
		while(true) {
		
			System.out.print("\nDIGITE O NUMERO:");
			cmd = scan.nextInt();
			
			if(cmd == 1) {
				mostrarProdutos();
			}
			else if(cmd == 2) {
				clientes();
			}
			else if(cmd == 3) {
				cadastro();	
			}
			else if(cmd == 4) {
				caixa();
			}
			else if(cmd == 5) {
				vender();
			}
			else if(cmd == 6) {
				for (int i = 0; i < 50; ++i) { 
					System.out.println();
				}
			}
			else if(cmd == 7) {
				System.out.println("=======================================MERCADO LUIS======================================================");
				System.out.println("                     VOCE ESTA SAINDO! MUITO OBRIGADO E VOLTE SEMPRE!                                                         ");
				break;
				
			}
		
	}
	
}
}
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
	System.out.println("6 - Limpar Tela");
	System.out.println("7 - sair");
	System.out.println("------------------------------\n");
	System.out.println("O que deseja fazer?");
	System.out.println("Escolha:");
	int opcao = scan.nextInt();
	return opcao;
}

public static void cadastro() {
System.out.println("===========================================MERCADO LUIS==========================================================");
System.out.println("==================================CADASTRADO DE CLIENTES======================================================");
System.out.print("DIGITE SEU NOME:");
cadastroClientes[i] = scan.next();
System.out.print("DIGITE SEU ID:");
IDCliente[i] = scan.nextInt();
i++;
System.out.println("DIGITE 0 PARA SAIR DO PROGRAMA:");
System.out.println("DIGITE 1 PARA VOLTAR AO MENU:\n\n\n");
int cmdo1 = scan.nextInt();
if(cmdo1 == 0) {
	cmd = 7;
}
else if(cmdo1 == 1) {
	menu();
}
}

public static void clientes() {
System.out.println("===========================================MERCADO LUIS==========================================================");
System.out.println("=======================================CLIENTES CADASTRADOS======================================================");
for(int i=0; i<10; i++) {
	if(cadastroClientes[i] != null) {
		System.out.println("\nID:" + IDCliente[i] + " NOME: " + cadastroClientes[i]);
	}
	else if(cadastroClientes[i] == null) {
		System.out.println("ID: VAZIO");
	}
	
}
System.out.println("===========================================MERCADO LUIS==========================================================");
System.out.println("=======================================CLIENTES CADASTRADOS======================================================");
System.out.println("DIGITE 0 PARA SAIR DO PROGRAMA:");
System.out.println("DIGITE 1 PARA VOLTAR AO MENU:\n\n\n");
int cmdo1 = scan.nextInt();
if(cmdo1 == 0) {
	cmd = 7;
}
else if(cmdo1 == 1) {
	menu();
}
}

public static void caixa() {
System.out.println("===========================================MERCADO LUIS==========================================================");
System.out.println("========================================DINHEIRO EM CAIXA======================================================\na");
System.out.println("                                              CAIXA:" + caixa);
System.out.println("\n===========================================MERCADO LUIS==========================================================");
System.out.println("========================================DINHEIRO EM CAIXA======================================================");
System.out.println("DIGITE 0 PARA SAIR DO PROGRAMA:");
System.out.println("DIGITE 1 PARA VOLTAR AO MENU:\n\n\n");
int cmdo1 = scan.nextInt();
if(cmdo1 == 0) {
	cmd = 7;
}
else if(cmdo1 == 1) {
	menu();
}
}



public static void vender() {
System.out.println("\n===========================================MERCADO LUIS============================================================");
System.out.println("\n========================================VENDA DE PRODUTOS==========================================================");
System.out.println("============================================PRODUTOS=================================================================");
for(int i=0; i<5; i++) {
	System.out.println(produtos[i] + " - PREÇO: " + preço[i] + " - EM ESTOQUE: " + estoque[i]);
}
System.out.println("\n============================================PRODUTOS================================================================\n");
System.out.print("                                      DIGITE O ID DO PRODUTO: ");
IDProduto = scan.nextInt();
for(int i=0; i<5; i++) {
	if(IDProduto == i) {
		System.out.print("                                      DIGITE A QUANTIDADE: ");
		quant = scan.nextInt();
		if(estoque[i] >= quant) {
			System.out.println("VOCÊ ESTA COMPRANDO:" + produtos[i]);
			System.out.println("QUANTIDADE:" + quant);
			System.out.println("PREÇO DA UNIDADE:" + preço[i]);
			soma = preço[i] * quant;
			System.out.println("O PREÇO TOTAL FOI:" + soma);
			System.out.print("DESEJA CONFIRMAR COMPRA? S/N ");
			confirmar = scan.next();
			if(confirmar.equals("S")) {
				System.out.print("DIGITE O ID DO CLIENTE:");
				IDcliente = scan.nextInt();
				System.out.println("COMPRA EFETUADA COM SUCESSO!!\n");
				caixa = caixa + soma;
				estoque[i] = estoque[i] - quant;
				System.out.println("DESEJA CONTINUAR COMPRANDO? S/N ");
				confirmar = scan.next();
				if(confirmar.equals("S")) {
					menu();
				}
				else if(confirmar.equals("N")) {
					cmd = 7;
				}
			}	
		}
	}
}
}

public static void mostrarProdutos() {
System.out.println("\n\n\n=======================================MERCADO LUIS======================================================");
System.out.println("=========================================PRODUTOS======================================================");
for(int i=0; i<5; i++) {
	System.out.println(produtos[i] + " - PREÇO: " + preço[i] + " - EM ESTOQUE: " + estoque[i]);
}
System.out.println("\n=========================================PRODUTOS======================================================");
System.out.println("=======================================MERCADO LUIS======================================================");
System.out.println("DIGITE 0 PARA SAIR DO PROGRAMA:");
System.out.println("DIGITE 1 PARA VOLTAR AO MENU:\n\n\n");
int cmdo1 = scan.nextInt();
if(cmdo1 == 0) {
	cmd = 7;
}
else if(cmdo1 == 1) {
	menu();
}



}
}
