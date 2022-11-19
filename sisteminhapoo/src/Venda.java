import java.util.ArrayList;
import java.util.Scanner;
public class Venda {
    Scanner scan = new Scanner(System.in);


    public void venderProduto(ArrayList<Produto>prod,ArrayList<Cliente>cli, ArrayList<Vendedor>vende) {
        System.out.println("----------Comprar Produto------------");
        System.out.println("\n-----------PRODUTOS------------------");
        for (int i = 0; i < prod.size(); i++) {
            if (prod.get(i).getNomeProduto()!="") {
                System.out.println(
                        "ID:" + prod.get(i).getIdProduto() + " - Produto:" + prod.get(i).getNomeProduto());
                        System.out.println("ID - " + prod.get(i).getIdProduto()+"Produto - "+prod.get(i).getNomeProduto()+"Qtd - "+prod.get(i).getQtdProdutos()+"Preço - "+prod.get(i).getPreco());
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
                            System.out.println("-------Recibo--------");
                            System.out.println("Produto: " + prod.get(i).getIdProduto());
                            System.out.println("Preço da unidade: " + prod.get(i).getPreco());
                            System.out.println("Quantidade sendo comprada:" + qtdCompra);
                            double somaPreco = (prod.get(i).getPreco() * qtdCompra);

                            System.out.println("O preço total foi: " + somaPreco);
                            System.out.println("\nComfirmar compra? 0-Sim 1-Não (para cancelar compra)");
                            int comfirma = scan.nextInt();

                            if (comfirma == 0) {
                                double saldoCaixa =0;
                                int idCliente=0,idVendedor=0;
                                System.out.println("Informe o ID do cliente:");
                                idCliente = scan.nextInt();
                                System.out.println("informe o id do vendedor:");
                                idVendedor = scan.nextInt();

                                if(idCliente==cli.get(i).getIdCliente()&&idVendedor==vende.get(i).getIdVendedor()){
                                    System.out.println("Compra efetuada com sucesso!");
                                    System.out.println("Cliente:"+cli.get(i).getNome()+"Vendedor(a):"+vende.get(i).getNome());
                                    saldoCaixa = saldoCaixa + somaPreco;
                                }

                               int qtd = (prod.get(i).getQtdProdutos()-qtdCompra);
                                System.out.println("Deseja realizar outra compra? 1 = SIM | 2 = NÃo");
                                int comfirma1 = scan.nextInt();
                                if (comfirma1 == 1) {
                                    venderProduto(prod,cli,vende);
                                } else {
                                    LoginTeste.menu();
                                }
                            } else {
                                LoginTeste.menu();
                            }
                        } else {
                            System.out.println("Valor inválido, tente novamente!");
                            venderProduto(prod,cli,vende);
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
