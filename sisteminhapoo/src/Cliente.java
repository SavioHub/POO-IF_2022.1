
public class Cliente extends Pessoa {
	private int idCliente;
	public int qtdClientes = 10;

	public Cliente(int idCliente, String nome, int idade, String cpf, String endereco) {
		super(nome, idade, cpf, endereco);
		setIdCliente(idCliente);
	}

	public int getIdCliente() {
		return this.idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public void cadastrarCliente() {
		System.out.println("Add quantos clientes?");
		int qtd = scan.nextInt();
		Cliente cli[] = new Cliente[qtd];

		for (int i = 0; i < qtd; i++) {
			cli[i] = new Cliente(getIdCliente(), getNome(), getIdade(), getCpf(), getEndereco());
			// String nome, cpf, endereco;
			System.out.println("Informe o nome do cliente para cadastro:");
			cli[i].setNome(scan.nextLine());
			cli[i].setNome(scan.nextLine());
			System.out.println("Informe o CPF do cliente para cadastro:");
			cli[i].setCpf(scan.nextLine());
			System.out.println("Informe o Endereço do cliente para cadastro (CIDADE):");
			cli[i].setEndereco(scan.nextLine());
			System.out.println("Digite o ID:");
			cli[i].setIdCliente(scan.nextInt());
			i++;
		}

		if (getIdCliente() > -1) {
			System.out.println("Cliente cadastrado com sucesso!");
		}

		System.out.println("Pressione 0 para voltar ao menu do programa ou 1 para cadastrar mais clientes");
		System.out.println("Escolha:");
		int op = scan.nextInt();
		if (op == 0) {
			LoginTeste.menu();
		} else {
			while (op == 1) {
				cadastrarCliente();

				System.out.println("Pressione 0 para voltar ao menu do programa ou 1 para cadastrar mais clientes");
				System.out.println("Escolha:");
				op = scan.nextInt();
				if (op == 0) {
					LoginTeste.menu();
				}
				while (op != 0 && op != 1) {
					System.out.println("Erro, tente novamente!\n");
					System.out.println("Pressione 1 para cadastrar mais clientes ou qualquer numero para abrir Menu");
					System.out.println("Escolha:");
					op = scan.nextInt();
				}
			}
		}

	}

	public void mostrarCliente() {
		Cliente cli[] = new Cliente[qtdClientes];
		System.out.println("\n--------------CLIENTES-------------");

		for (int i = 0; i < qtdClientes; i++) {
			cli[i] = new Cliente(getIdCliente(), getNome(), getIdade(), getCpf(), getEndereco());
			if (cli[i].getNome() == null) {
				System.out.println("Vazio!");
			} else {
				System.out.println("ID:" + cli[i].getIdCliente() + " - Nome:" + cli[i].getNome() + " - CPF:"
						+ cli[i].getCpf() + " - Endereço:" + cli[i].getEndereco() + " - Idade:" + cli[i].getIdade());
			}

		}

		System.out.println("Pressione 1 para abrir Menu");
		System.out.println("Escolha:");
		int op = scan.nextInt();
		if (op == 1) {
			LoginTeste.menu();
		}
		while (op != 1) {
			System.out.println("Opção inválida!, tente novamente\n");
			System.out.println("Pressione 1 para abrir Menu");
			System.out.println("Escolha:");
			op = scan.nextInt();
		}
	}

}