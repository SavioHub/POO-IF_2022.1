import java.util.ArrayList;
import java.util.Scanner;

public class Venda {
    Scanner scan = new Scanner(System.in);
    public double somaPreco;

    public void venderProduto(ArrayList<Produto> prod, ArrayList<Cliente> cli, ArrayList<Vendedor> vende) {
        System.out.println("----------Comprar Produto------------");
        for (int i = 0; i < prod.size(); i++) {
            if (prod.get(i).getNomeProduto() != "") {
                System.out.println("\n-----------PRODUTOS------------------");
                System.out.println("ID - " + prod.get(i).getIdProduto() + " Produto - " + prod.get(i).getNomeProduto()
                        + " Qtd - " + prod.get(i).getQtdProdutos() + " Preço - " + prod.get(i).getPreco());
                System.out.println("\n-----------PRODUTOS------------------");
            } else {
                System.out.println("vazio!");
            }

            if (prod.get(i).getQtdProdutos() >= 0) {
                System.out.println("ID do produto que deseja comprar: ");
                int IDProduto = scan.nextInt();

                while (true) {

                    if (IDProduto == prod.get(i).getIdProduto()) {
                        System.out.println("Quantidade que deseja comprar:");
                        int qtdCompra = scan.nextInt();
                        if (qtdCompra > 0 && qtdCompra <= prod.get(i).getQtdProdutos()) {
                            int idCliente, idVendedor;
                            System.out.println("-------RECIBO--------");
                            System.out.println("Produto: " + prod.get(i).getIdProduto());
                            System.out.println("Preço da unidade: " + prod.get(i).getPreco());
                            System.out.println("Quantidade sendo comprada:" + qtdCompra);
                            somaPreco = (prod.get(i).getPreco() * qtdCompra);
                            System.out.println("O preço total foi: " + somaPreco);
                            System.out.println("-------RECIBO--------\n");

                            System.out.println("Para comprar o produto, digite o seu ID e o do vendedor");
                            System.out.println("Informe o seu ID:");
                            idCliente = scan.nextInt();
                            // nomeCliente = scan.nextLine();
                            System.out.println("informe o ID do vendedor:");
                            idVendedor = scan.nextInt();
                            System.out.println("\nComfirmar compra? 0-Sim 1-Não (para cancelar compra)");
                            int comfirma = scan.nextInt();

                            if (comfirma == 0) {

                                if (idCliente == cli.get(i).getIdCliente()
                                        && idVendedor == vende.get(i).getIdVendedor()) {
                                    System.out.println("Compra efetuada com sucesso!");
                                    System.out.println("-------RECIBO DE COMPRA--------");
                                    System.out.println("Produto: " + prod.get(i).getIdProduto());
                                    System.out.println("Preço da unidade: " + prod.get(i).getPreco());
                                    System.out.println("Quantidade sendo comprada:" + qtdCompra);
                                    somaPreco = (prod.get(i).getPreco() * qtdCompra);
                                    System.out.println("O preço total foi: " + somaPreco);
                                    System.out.println("Cliente:" + cli.get(i).getNome() + " Vendedor(a):"
                                            + vende.get(i).getNome());
                                    System.out.println("-------RECIBO DE COMPRA--------");

                                    double saldoCaixa = 0;
                                    saldoCaixa = saldoCaixa + somaPreco;

                                    int qtd = (prod.get(i).getQtdProdutos() - qtdCompra);
                                    System.out.println("Deseja realizar outra compra? 1 = SIM | 2 = NÃo");
                                    int comfirma1 = scan.nextInt();
                                    if (comfirma1 == 1) {
                                        venderProduto(prod, cli, vende);
                                    } else {
                                        break;
                                    }
                                } else {
                                    System.out.println("Nomes não correpondem, tente fazer a compra novamente!");
                                    venderProduto(prod, cli, vende);
                                }

                            } else {
                                System.out.println("Compra cancelada!");
                                LoginTeste.menu();
                            }
                        } else {
                            System.out.println("Valor inválido, tente novamente!");
                            venderProduto(prod, cli, vende);
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

    }

}
