package sistemajava.com.br;

import java.util.Scanner;
public class Teste {
	public static final boolean Boolean = false;
	public static String produtos[] = {" ID = 0: Arroz", "ID = 1: Feijão", "ID = 2: Carne", "ID = 3: Macarrão", "ID = 4: Frango"};
	public static double preço[] = {5.50, 8.50, 42.90, 3.15, 11.50};
	public static int estoque[] = {50, 50, 50, 50, 50};
	public static String cadastroClientes[] = new String[10];
	public static int IDCliente[] = new int[10];
	public static int historicoID[] = new int[10];
	public static double soma = 0;
	public static String confirmar, nomeProduto;
	public static Scanner sc = new Scanner(System.in);
	public static int cmd = 0, i=0, quant=0, IDcliente=0, IDProduto;
	public static double caixa = 0;
	
	
public static void main(String[] args) {
	
	if(login() == true) {
		menu();
		while(true) {
		
		System.out.print("\nDIGITE O NUMERO:");
		cmd = sc.nextInt();
		
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
			System.out.println("vc saiu do sistema!");
			break;
			
		}
		
	}
	
}
}

static boolean login() {
System.out.println("-------login-------");
System.out.print("Digite o nome de usuário:");
String login = sc.nextLine();
System.out.print("Senha:");
int senha = sc.nextInt();
if(login.equals("admin") && senha == 123) {
	boolean acesso = true;
	return true;
}
else {
	boolean acesso = false;
	return false;
}


}


public static void menu() {
System.out.println("------------ Menu-----------\n");
System.out.println("1 - Mostrar produtos em estoque");
System.out.println("2 - Mostrar clientes");
System.out.println("3 - Cadastrar novo cliente");
System.out.println("4 - Mostrar dinheiro em caixa");
System.out.println("5 - vender produtos");
System.out.println("6 - Limpar Tela");
System.out.println("7 - sair");
System.out.println("------------------------------\n");

}

public static void cadastro() {
System.out.print("Informe o nome do cliente para cadastro:");
cadastroClientes[i] = sc.next();
System.out.print("Digite o ID:");
IDCliente[i] = sc.nextInt();
i++;
System.out.println("Digite 0 para sair do programa:");
System.out.println("Digite 1 para voltar ao menu:\n\n\n");
int cmdo1 = sc.nextInt();
if(cmdo1 == 0) {
	cmd = 7;
}
else if(cmdo1 == 1) {
	menu();
}
}

public static void clientes() {
	System.out.println("--------Clientes cadastrados-------:");
for(int i=0; i<10; i++) {
	if(cadastroClientes[i] != null) {
		System.out.println("\nID:" + IDCliente[i] + " NOME: " + cadastroClientes[i]);
	}
	else if(cadastroClientes[i] == null) {
		System.out.println("ID: VAZIO");
	}
	
}
System.out.println("Digite 0 para sair do programa:");
System.out.println("Digite 1 para voltar ao menu:\n\n\n");
int cmdo1 = sc.nextInt();
if(cmdo1 == 0) {
	cmd = 7;
}
else if(cmdo1 == 1) {
	menu();
}
}

public static void caixa() {
System.out.println("------------DINHEIRO EM CAIXA-------------\n");
System.out.println("CAIXA:" + caixa);
System.out.println("------------DINHEIRO EM CAIXA-------------\n");
System.out.println("Digite 0 para sair do programa:");
System.out.println("Digite 1 para voltar ao menu:\n\n\n");
int cmdo1 = sc.nextInt();
if(cmdo1 == 0) {
	cmd = 7;
}
else if(cmdo1 == 1) {
	menu();
}
}

public static void vender() {
System.out.println("\n-----------VENDA DE PRODUTOS------------------");
System.out.println("\n-----------PRODUTOS------------------");
for(int i=0; i<5; i++) {
	System.out.println(produtos[i] + " - PREÇO: " + preço[i] + " - EM ESTOQUE: " + estoque[i]);
}
System.out.println("\n-----------PRODUTOS------------------");
System.out.print("DIGITE O ID DO PRODUTO: ");
IDProduto = sc.nextInt();
for(int i=0; i<5; i++) {
	if(IDProduto == i) {
		System.out.print("DIGITE A QUANTIDADE: ");
		quant = sc.nextInt();
		if(estoque[i] >= quant) {
			System.out.println("VOCÊ ESTA COMPRANDO:" + produtos[i]);
			System.out.println("QUANTIDADE:" + quant);
			System.out.println("PREÇO DA UNIDADE:" + preço[i]);
			soma = preço[i] * quant;
			System.out.println("O PREÇO TOTAL FOI:" + soma);
			System.out.print("DESEJA CONFIRMAR COMPRA? S/N ");
			confirmar = sc.next();
			if(confirmar.equals("S")) {
				System.out.print("DIGITE O ID DO CLIENTE:");
				IDcliente = sc.nextInt();
				System.out.println("COMPRA EFETUADA COM SUCESSO!!\n");
				caixa = caixa + soma;
				estoque[i] = estoque[i] - quant;
				System.out.println("DESEJA CONTINUAR COMPRANDO? S/N ");
				confirmar = sc.next();
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
System.out.println("---------------PRODUTOS---------------");
for(int i=0; i<5; i++) {
	System.out.println(produtos[i] + " - PREÇO: " + preço[i] + " - EM ESTOQUE: " + estoque[i]);
}
System.out.println("\n--------------------PRODUTOS------------------");
System.out.println("DIGITE 0 PARA SAIR DO PROGRAMA:");
System.out.println("DIGITE 1 PARA VOLTAR AO MENU:\n\n\n");
int cmdo1 = sc.nextInt();
if(cmdo1 == 0) {
	cmd = 7;
}
else if(cmdo1 == 1) {
	menu();
}



}}

