import java.util.ArrayList;

public class Vendedor extends Pessoa {
	private int IdVendedor;
	private double percentualComissao;
    // ArrayList<Vendedor>lista = new ArrayList<Vendedor>();

	public int qtdVendedor=0;
	Vendedor[] vendedores = new Vendedor[100];

	public Vendedor(int IdVendedor, String nome, int idade, String cpf, String endereco) {
		super(nome, idade, cpf, endereco);
		setIdVendedor(IdVendedor);
	}

	public int getIdVendedor() {
		return this.IdVendedor;
	}

	public void setIdVendedor(int IdVendedor) {
		this.IdVendedor = IdVendedor;
	}

	public double getPercentualComissao() {
		return percentualComissao;
	}

	public void setPercentualComissao(double percentualComissao) {
		this.percentualComissao = percentualComissao;
	}


	// public int getQtdVendedor() {
	// 	return qtdVendedor;
	// }

	// public void setQtdVendedor(int qtdVendedor) {
	// 	this.qtdVendedor = qtdVendedor;
	// }

	public void cadastrarVendedor() {

		char controle = 's';
		do {
			System.out.println("Digite o ID:");
			int id = scan.nextInt();
			System.out.println("Informe o nome do vendedor para cadastro:");
			String nome =scan.nextLine();
			nome =scan.nextLine();
			System.out.println("Digite a idade:");
			int idade = scan.nextInt();
			System.out.println("Informe o CPF do vendedor para cadastro:");
			String cpf =scan.nextLine();
			cpf =scan.nextLine();
			System.out.println("Informe o Endereço do vendedor para cadastro (CIDADE):");
			String end =scan.nextLine();
			
			Vendedor vendedor = new Vendedor(id, nome, idade, cpf, end);
			// lista.add(vendedor);

			vendedores[qtdVendedor]=vendedor;
			qtdVendedor++;

			System.out.println("Deseja add mais vendedores?");
			controle = scan.next().charAt(0);
			
		} while (controle == 's' || controle =='S');
		
		System.out.println("Pressione 0 para voltar ao menu do programa ou 1 para cadastrar mais clientes");
		System.out.println("Escolha:");
		int op = scan.nextInt();
		if (op == 0) {
			LoginTeste.menu();
		}

		while (op == 1) {
			cadastrarVendedor();

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

	public void mostrarVendedor() {
		System.out.println("\n--------------Vendedores-------------");
		if (getNome() == null || getNome() == "") {
				System.out.println("Vazio!");
		}else{
			for (Vendedor v : vendedores) {
				System.out.println("ID:"+v.getIdade()+"Nome:"+v.getNome()+"Idade:"+v.getIdade()+"CPF:"+v.getCpf()+"Endereço:"+v.getEndereco());
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
