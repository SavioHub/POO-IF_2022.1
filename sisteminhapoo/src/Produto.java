import java.util.ArrayList;
import java.util.Scanner;

public class Produto {
    public static Scanner scan = new Scanner(System.in);
    private int idProduto;
    private String nomeProduto;
    private int qtdProdutos=0;
    private double preco;

    // ArrayList<Produto>listaProduto = new ArrayList<Produto>();


    public Produto(){

    }
    public Produto(int idProduto, String nomeProduto, int qtdProdutos, double preco) {
        setIdProduto(idProduto);
        setNomeProduto(nomeProduto);
        setPreco(preco);
        setQtdProdutos(qtdProdutos);
    }

    public int getIdProduto() {
        return this.idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return this.nomeProduto;
    }

    public void setNomeProduto(String nome) {
        this.nomeProduto= nome;
    }

    public int getQtdProdutos() {
        return this.qtdProdutos;
    }

    public void setQtdProdutos(int estoque) {
        this.qtdProdutos=estoque;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco1) {
        this.preco=preco1;
    }

    public void entradaEstoque(int quantidade) {
        qtdProdutos += quantidade;
    }

    public void saidaEstoque(int quantidade) {
        qtdProdutos -= quantidade;
    }

    public void novoProduto(ArrayList<Produto>prod) {
        int op;
        
        Produto prod1 = new Produto();
        
        char controle = 's';
		do {
            System.out.println("-------------Adicionar novo produto-----------\n");
            System.out.println("ID do produto:");
            int idProdutos = scan.nextInt();
            System.out.println("Nome do produto:");
            String nome = scan.nextLine();
            nome = scan.nextLine();
            System.out.println("Preço do produto:");
            double precoProdutos = scan.nextDouble();
            System.out.println("Quantidade de produto:");
            int qtd = scan.nextInt();
            
            prod1 = new Produto(idProdutos, nome, qtd, precoProdutos);
			prod.add(prod1);

			System.out.println("Deseja add mais vendedores?");
			controle = scan.next().charAt(0);
			
		} while (controle == 's' || controle =='S');

		// System.out.println("Pressione 0 para voltar ao menu do programa ou 1 para cadastrar mais produtos");
		// System.out.println("Escolha:");
		// op = scan.nextInt();
		// if (op == 0) {
		// 	LoginTeste.menu();
		// }
		// while (op == 1) {
		// 	novoProduto(prod);
		// 	System.out.println("Pressione 1 para abrir Menu");
		// 	System.out.println("Escolha:");
		// 	op = scan.nextInt();
		// 	if (op == 0) {
		// 		LoginTeste.menu();
		// 	}
		// 	while (op != 0 && op != 1) {
		// 		System.out.println("Opção inválida!, tente novamente\n");
		// 		System.out.println("Pressione 1 para abrir Menu");
		// 		System.out.println("Escolha:");
		// 		op = scan.nextInt();
		// 		if (op == 0) {
		// 			LoginTeste.menu();
		// 		}
		// 	}
		// }

	}

    public void mostrarProdutos(ArrayList<Produto>prod) {

		System.out.println("\n--------------PRODUTOS-------------");
        if (getNomeProduto()!="") {
        
            for(int i = 0; i < prod.size(); i++)
            {
                System.out.println("ID - " + prod.get(i).getIdProduto()+"Nome - "+prod.get(i).nomeProduto+"Qtd - "+prod.get(i).getQtdProdutos()+"Preço - "+prod.get(i).getPreco());
            }

        }else{
            System.out.println("Vazio!");
        }

		// System.out.println("Pressione 1 para abrir Menu");
		// System.out.println("Escolha:");
		// int op = scan.nextInt();
		// if (op == 1) {
			
		// }
		// while (op != 1) {
		// 	System.out.println("Opção inválida!, tente novamente\n");
		// 	System.out.println("Pressione 1 para abrir Menu");
		// 	System.out.println("Escolha:");
		// 	op = scan.nextInt();
		// }

	}

}
