import java.util.Scanner;
public class Main{
	// public static boolean logado = false;
	public static Scanner scan = new Scanner(System.in);
	// variaveis de login
	static String userName = "admin", passLogin = "123";
	// var que indica o tamando dos vetores
	public static int tam = 10;

	public static int i = 0, idClientes = 0, op;
	// var que armazena os clientes
	public static String nomeCliente[] = new String[tam];
	public static int idCliente[] = new int[tam];
	public static int historicoId[] = new int[tam];
	// estoque de produtos
	public static String produtos[] = new String[tam];
	public static double precoProdutos[] = new double[tam];
	public static int quantidadeProduto[] = new int[tam];
	public static int idProdutos[] = new int[tam];
	// var que armazena o saldo em caixa
	public static double saldoCaixa = 0;
	// login e Menu
	public static int opcaoMenu;
	public static boolean logado = logar();
	// variaveis de vender produto
	public static int IDProduto, qtdCompra = 0;
	public static int comfirma, comfirma1, IDCliente = 0;
	public static double somaPreco = 0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		if (logado) {
			opcaoMenu = menu();

			while (true) {

				if (opcaoMenu == 1) {
					mostrarProdutos();
				} else if (opcaoMenu == 2) {
					mostrarCliente();
				} else if (opcaoMenu == 3) {
					cadastrarCliente();
				} else if (opcaoMenu == 4) {
					saldoCaixa();
				} else if (opcaoMenu == 5) {
					venderProduto();
				} else if (opcaoMenu == 6) {
					novoProduto();
				} else if (opcaoMenu == 7) {
					limparTela();
				} else if (opcaoMenu == 8) {
					System.out.println("- - - - - - Desconectado! COM SUCESSO - - - - - ");
					break;
				}
			}
		}
	}

	// funções
	public static boolean logar() {
		String user, pass;

		System.out.println("-------Login do Sistema------");

		System.out.println("Informe o nome de usuário:");
		user = scan.nextLine();
		System.out.println("Informe a senha de login:");
		pass = scan.nextLine();

		if (user.equals(userName) && pass.equals(passLogin)) {
			logado = true;
		} else {
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
		opcaoMenu = scan.nextInt();
		return opcaoMenu;
	}

	public static void cadastrarCliente() {
		System.out.println("Informe o nome do cliente para cadastro:");
		nomeCliente[i] = scan.nextLine();
		nomeCliente[i] = scan.nextLine();
		System.out.println("Digite o ID:");
		idCliente[i] = scan.nextInt();
		i++;

		if (i > 0) {
			System.out.println("Cliente cadastrado com sucesso!");
		}

		System.out.println("Pressione 0 para voltar ao menu do programa ou 1 para cadastrar mais clientes");
		System.out.println("Escolha:");
		op = scan.nextInt();
		if (op == 0) {
			menu();
		}

		while (op == 1) {
			cadastrarCliente();

			System.out.println("Pressione 0 para voltar ao menu do programa ou 1 para cadastrar mais clientes");
			System.out.println("Escolha:");
			op = scan.nextInt();
			if (op == 0) {
				menu();
			}
			while (op != 0 && op != 1) {
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
		for (int i = 0; i < 10; i++) {
			if (nomeCliente[i] == null) {
				System.out.println("Vazio!");
			} else {
				System.out.println("ID:" + idCliente[i] + " - Cliente:" + nomeCliente[i]);
			}

		}
		System.out.println("Pressione 1 para abrir Menu");
		System.out.println("Escolha:");
		op = scan.nextInt();
		if (op == 1) {
			menu();
		}
		while (op != 1) {
			System.out.println("Opção inválida!, tente novamente\n");
			System.out.println("Pressione 1 para abrir Menu");
			System.out.println("Escolha:");
			op = scan.nextInt();
		}
	}

	public static void mostrarProdutos() {

		System.out.println("\n--------------PRODUTOS-------------");

		for (int i = 0; i < tam; i++) {
			if (produtos[i] == null) {
				System.out.println(" ");
			} else {
				System.out.println("ID:" + idProdutos[i] + " - Produto:" + produtos[i] + " - Preço: R$"
						+ precoProdutos[i] + " - Quantidade em estoque: " + quantidadeProduto[i]);
			}
		}

		System.out.println("Pressione 1 para abrir Menu");
		System.out.println("Escolha:");
		op = scan.nextInt();
		if (op == 1) {
			menu();
		}
		while (op != 1) {
			System.out.println("Opção inválida!, tente novamente\n");
			System.out.println("Pressione 1 para abrir Menu");
			System.out.println("Escolha:");
			op = scan.nextInt();
		}

	}

	public static void novoProduto() {
		System.out.println("-------------Adicionar novo produto-----------\n");
		System.out.println("Nome do produto:");
		produtos[i] = scan.nextLine();
		produtos[i] = scan.nextLine();
		System.out.println("ID do produto:");
		idProdutos[i] = scan.nextInt();
		System.out.println("Preço do produto:");
		precoProdutos[i] = scan.nextDouble();
		System.out.println("Quantidade de produto:");
		quantidadeProduto[i] = scan.nextInt();
		i++;

		System.out.println("Pressione 0 para voltar ao menu do programa ou 1 para cadastrar mais produtos");
		System.out.println("Escolha:");
		op = scan.nextInt();
		if (op == 0) {
			menu();
		}
		while (op == 1) {
			novoProduto();
			System.out.println("Pressione 1 para abrir Menu");
			System.out.println("Escolha:");
			op = scan.nextInt();
			if (op == 0) {
				menu();
			}
			while (op != 0 && op != 1) {
				System.out.println("Opção inválida!, tente novamente\n");
				System.out.println("Pressione 1 para abrir Menu");
				System.out.println("Escolha:");
				op = scan.nextInt();
				if (op == 0) {
					menu();
				}
			}
		}

	}

	public static void limparTela() {
		for (int i = 0; i < 100; ++i) {
			System.out.println();
		}
	}

	public static void saldoCaixa() {
		System.out.println("O saldo em caixa é R$ " + saldoCaixa);
		System.out.println("Pressione 1 para abrir Menu");
		System.out.println("Escolha:");
		op = scan.nextInt();
		if (op == 1) {
			menu();
		}
		while (op != 1) {
			System.out.println("Opção inválida!, tente novamente\n");
			System.out.println("Pressione 1 para abrir Menu");
			System.out.println("Escolha:");
			op = scan.nextInt();
		}
	}

	public static void venderProduto() {
		System.out.println("----------Comprar Produto------------");
		System.out.println("\n-----------PRODUTOS------------------");
		for (int i = 0; i <= quantidadeProduto[i]; i++) {
			if (produtos[i] == null) {
				System.out.println("vazio!");
			} else {
				System.out.println(
						"ID:" + idProdutos[i] + " - Produto:" + produtos[i] + " - PREÇO: " + precoProdutos[i]
								+ " - EM ESTOQUE: " + quantidadeProduto[i]);
			}

			if (quantidadeProduto[i] >= 0) {
				System.out.println("ID do produto que deseja comprar: ");
				IDProduto = scan.nextInt();

				while (true) {

					if (IDProduto == idProdutos[i]) {
						System.out.println("Quantidade que deseja comprar:");
						qtdCompra = scan.nextInt();
						if (qtdCompra > 0 && qtdCompra <= quantidadeProduto[i]) {
							System.out.println("-------Recibo--------");
							System.out.println("Produto: " + idProdutos[i]);
							System.out.println("Preço da unidade: " + precoProdutos[i]);
							System.out.println("Quantidade sendo comprada:" + qtdCompra);
							somaPreco = (precoProdutos[i] * qtdCompra);

							System.out.println("O preço total foi: " + somaPreco);
							System.out.println("\nComfirmar compra? 0-Sim 1-Não (para cancelar compra)");
							comfirma = scan.nextInt();

							if (comfirma == 0) {
								System.out.println("Informe o ID do cliente:");
								IDCliente = scan.nextInt();
								System.out.println("Compra efetuada com sucesso!");
								saldoCaixa = saldoCaixa + somaPreco;
								quantidadeProduto[i] = (quantidadeProduto[i] - qtdCompra);
								System.out.println("Deseja realizar outra compra? 1 = SIM | 2 = NÃo");
								comfirma1 = scan.nextInt();
								if (comfirma1 == 1) {
									venderProduto();
								} else {
									menu();
								}
							} else {
								menu();
							}
						} else {
							System.out.println("Valor inválido, tente novamente!");
							venderProduto();
						}
					} else {
						System.out.println("Não existe nenhum produto com esse ID.");
						break;
					}
				}
			} else {
				System.out.println("não existe produto em estoque!\n");
				System.out.println("Pressione 1 para abrir Menu");
				System.out.println("Escolha:");
				op = scan.nextInt();
				if (op == 1) {
					menu();
				}
				while (op != 1) {
					System.out.println("Opção inválida!, tente novamente\n");
					System.out.println("Pressione 1 para abrir Menu");
					System.out.println("Escolha:");
					op = scan.nextInt();
				}
			}
		}

	}
}

// final das funções