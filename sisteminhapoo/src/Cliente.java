import java.util.ArrayList;

public class Cliente extends Pessoa {
	private int idCliente;

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

	public void cadastrarCliente(ArrayList<Cliente> cliente) {

		char controle = 's';
		do {
			System.out.println("Digite o ID:");
			int id = scan.nextInt();
			System.out.println("Informe o nome do cliente para cadastro:");
			String nome = scan.nextLine();
			nome = scan.nextLine();
			System.out.println("Digite a idade:");
			int idade = scan.nextInt();
			System.out.println("Informe o CPF do cliente para cadastro:");
			String cpf = scan.nextLine();
			cpf = scan.nextLine();
			System.out.println("Informe o Endereço do cliente para cadastro (CIDADE):");
			String end = scan.nextLine();

			Cliente cli = new Cliente(id, nome, idade, cpf, end);
			cliente.add(cli);

			System.out.println("Deseja add mais clientes?");
			controle = scan.next().charAt(0);

		} while (controle == 's' || controle == 'S');

		if (getNome() != "") {
			System.out.println("Cliente cadastrado com sucesso!");
		}

	}

	public void mostrarCliente(ArrayList<Cliente> cliente) {
		System.out.println("\n--------------CLIENTES-------------");

		for (int i = 0; i < cliente.size(); i++) {
			System.out
					.println("ID - " + cliente.get(i).getIdCliente() + " Nome - " + cliente.get(i).getNome() + " CPF - "
							+ cliente.get(i).getCpf() + " Endereço - " + cliente.get(i).getEndereco());
		}

		// System.out.println("Pressione 1 para abrir Menu");
		// System.out.println("Escolha:");
		// int op = scan.nextInt();
		// if (op == 1) {
		// 	LoginTeste.menu();
		// }
		// while (op != 1) {
		// 	System.out.println("Opção inválida!, tente novamente\n");
		// 	System.out.println("Pressione 1 para abrir Menu");
		// 	System.out.println("Escolha:");
		// 	op = scan.nextInt();
		// }
	}

}