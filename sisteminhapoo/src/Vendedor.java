import java.util.ArrayList;

public class Vendedor extends Pessoa {
	private int IdVendedor;

	public Vendedor(int id, String nome, int idade, String cpf, String endereco) {
		super(nome, idade, cpf, endereco);
		setIdVendedor(id);
	}

	public int getIdVendedor() {
		return this.IdVendedor;
	}

	public void setIdVendedor(int IdVendedor) {
		this.IdVendedor = IdVendedor;
	}

	public void cadastrarVendedor(ArrayList<Vendedor> vendedor1) {

		char controle = 's';
		do {
			System.out.println("Digite o ID:");
			int id = scan.nextInt();
			System.out.println("Informe o nome do vendedor para cadastro:");
			String nome = scan.nextLine();
			nome = scan.nextLine();
			System.out.println("Digite a idade:");
			int idade = scan.nextInt();
			System.out.println("Informe o CPF do vendedor para cadastro:");
			String cpf = scan.nextLine();
			cpf = scan.nextLine();
			System.out.println("Informe o Endereço do vendedor para cadastro (CIDADE):");
			String end = scan.nextLine();

			Vendedor vend = new Vendedor(id, nome, idade, cpf, end);
			vendedor1.add(vend);

			System.out.println("Deseja add mais vendedores?");
			controle = scan.next().charAt(0);

		} while (controle == 's' || controle == 'S');

		if (getNome() != "") {
			System.out.println("Vendedor cadastrado com sucesso!");
		}
	}

	public void mostrarVendedor(ArrayList<Vendedor> vendedor1) {
		System.out.println("\n--------------Vendedores-------------");

		for (int i = 0; i < vendedor1.size(); i++) {
			System.out.println("ID - " + vendedor1.get(i).getIdVendedor() + " Nome - " + vendedor1.get(i).getNome()
					+ " CPF - " + vendedor1.get(i).getCpf() + " Endereço - " + vendedor1.get(i).getEndereco());
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
