import java.util.ArrayList;
import java.util.Scanner;
public class LoginTeste {
    public static void main(String[] args) {
		// ArrayList<Vendedor>vendedor1 = new ArrayList<>();
		ArrayList<Produto>prod = new ArrayList<>();
		ArrayList<Vendedor>listaVendedor = new ArrayList<>();
		ArrayList<Cliente>listaCliente = new ArrayList<>();

        // Cliente cliente = new Cliente(5, "sávio", 20, "093.385.075-22", "guanambi");
        // Vendedor vendedor = new Vendedor(3, null, 0, null, null);
        // Vendedor vendedor = new Vendedor(3, "Woquiton", 44, "222.222-22", "vitoria da conquista");
		
		Produto produto = new Produto();
		Vendedor vendedor = new Vendedor(0,null, 0, null, null);
        Cliente cliente = new Cliente(0, null, 0, null, null);
		Venda vende = new Venda();

	    // int opcaoMenu;
	    boolean logado = logar();

        if (logado) {
			
			while (true) {
				int opcaoMenu = menu();

				if (opcaoMenu == 1) {
					produto.mostrarProdutos(prod);
				} else if (opcaoMenu == 2) {
					cliente.mostrarCliente(listaCliente);
				} else if (opcaoMenu == 3) {
					vendedor.mostrarVendedor(listaVendedor);
				}else if (opcaoMenu == 4) {
					cliente.cadastrarCliente(listaCliente);
				}  else if (opcaoMenu == 5) {
					vendedor.cadastrarVendedor(listaVendedor);
				} else if (opcaoMenu == 6) {
					// dinheiroCaixa
				}
				else if (opcaoMenu == 7) {
					vende.venderProduto(prod, listaCliente, listaVendedor);
				} else if (opcaoMenu == 8) {
					produto.novoProduto(prod);
				} else if (opcaoMenu == 9) {
					// limparTela();
				} else if (opcaoMenu == 10) {
					System.out.println("- - - - - - Desconectado! COM SUCESSO - - - - - ");
					break;
				}
			}

		}
    }

    public static boolean logar() {
        boolean login;
        Scanner scan = new Scanner(System.in);
		String user, pass;
        String userName = "admin", passLogin = "123";

		System.out.println("-------Login do Sistema------");
		System.out.println("Informe o nome de usuário:");
		user = scan.nextLine();

		System.out.println("Informe a senha de login:");
		pass = scan.nextLine();

		if (user.equals(userName) && pass.equals(passLogin)) {
			login = true;
		} else {
            login = true;
			System.out.println("Usuario Incorreto ou Senha Incorreta!!!\n\n");
			logar();
		}
        return  login;
	}

    public static int menu() {
        Scanner scan = new Scanner(System.in);
		System.out.println("------------ Menu-----------\n");
		System.out.println("1 - Mostrar produtos em estoque");
		System.out.println("2 - Mostrar clientes");
		System.out.println("3 - Mostrar Vendedor");
		System.out.println("4 - Cadastrar novo cliente");
		System.out.println("5 - cadastrar novo Vendedor");
		System.out.println("6 - Mostrar dinheiro em caixa");
		System.out.println("7 - vender produtos");
		System.out.println("8 - Adicionar novo produto");
		System.out.println("9 - Limpar Tela");
		System.out.println("10 - sair");
		System.out.println("------------------------------\n");
		System.out.println("O que deseja fazer?");
		System.out.println("Escolha:");
		int opcaoMenu = scan.nextInt();
		return opcaoMenu;
	}
}
