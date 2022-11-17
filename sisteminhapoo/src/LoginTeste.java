import java.util.Scanner;
public class LoginTeste {
    public static void main(String[] args) {

        // Produto prod = new Produto(0, "", 3, 0);
        Cliente cliente = new Cliente(0, null, 0, null, null);
        // Cliente cliente = new Cliente(5, "sávio", 20, "093.385.075-22", "guanambi");
        Vendedor vendedor = new Vendedor(3, null, 0, null, null);
        // Vendedor vendedor = new Vendedor(3, "Woquiton", 44, "222.222-22", "vitoria da conquista");
		
		Produto prod = new Produto();


	    int opcaoMenu;
	    boolean logado = logar();

        if (logado) {
			opcaoMenu = menu();

			while (true) {

				if (opcaoMenu == 1) {
					prod.mostrarProdutos();
				} else if (opcaoMenu == 2) {
					cliente.mostrarCliente();
				} else if (opcaoMenu == 3) {
					vendedor.mostrarVendedor();
				}else if (opcaoMenu == 4) {
					cliente.cadastrarCliente();
				}  else if (opcaoMenu == 5) {
					vendedor.cadastrarVendedor();
				} else if (opcaoMenu == 6) {
					// dinheiroCaixa
				}
				else if (opcaoMenu == 7) {
					// venderProduto();
				} else if (opcaoMenu == 8) {
					prod.novoProduto();
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
