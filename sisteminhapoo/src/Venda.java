// public class Venda {
//     private Cliente[] cliente;
//     private Vendedor[] vendedor;
//     private Produto[] produto;


//     public Venda(Cliente[] cliente, Vendedor[] vendedor, Produto[] prod) {
//         setCliente(cliente);
//         setProduto(prod);
//         setVendedor(vendedor);
//     }


//     public Cliente[] getCliente() {
//         return this.cliente;
//     }

//     public void setCliente(Cliente[] cliente) {
//         this.cliente = cliente;
//     }

//     public Vendedor[] getVendedor() {
//         return this.vendedor;
//     }

//     public void setVendedor(Vendedor[] vendedor) {
//         this.vendedor = vendedor;
//     }

//     public Produto[] getProduto() {
//         return this.produto;
//     }

//     public void setProduto(Produto[] produto) {
//         this.produto = produto;
//     }


//     public double calcularValorTotalProduto() {
//         double valorTotal = 0;
//         for (Produto prod : produto) {
//                valorTotal = valorTotal + prod.getQtdProdutos();
//         }
//         return valorTotal;
//     }
  
//     // public double calcularComissaoPedido() {
//     //     return calcularValorTotalPedido() * vendedor.getPercentualComissao();
//     // }

//     public static void venderProduto() {
// 		System.out.println("----------Comprar Produto------------");
// 		System.out.println("\n-----------PRODUTOS------------------");
// 		for (int i = 0; i <= quantidadeProduto[i]; i++) {
// 			if (produtos[i] == null) {
// 				System.out.println("vazio!");
// 			} else {
// 				System.out.println(
// 						"ID:" + idProdutos[i] + " - Produto:" + produtos[i] + " - PREÇO: " + precoProdutos[i]
// 								+ " - EM ESTOQUE: " + quantidadeProduto[i]);
// 			}

// 			if (quantidadeProduto[i] >= 0) {
// 				System.out.println("ID do produto que deseja comprar: ");
// 				IDProduto = scan.nextInt();

// 				while (true) {

// 					if (IDProduto == idProdutos[i]) {
// 						System.out.println("Quantidade que deseja comprar:");
// 						qtdCompra = scan.nextInt();
// 						if (qtdCompra > 0 && qtdCompra <= quantidadeProduto[i]) {
// 							System.out.println("-------Recibo--------");
// 							System.out.println("Produto: " + idProdutos[i]);
// 							System.out.println("Preço da unidade: " + precoProdutos[i]);
// 							System.out.println("Quantidade sendo comprada:" + qtdCompra);
// 							somaPreco = (precoProdutos[i] * qtdCompra);

// 							System.out.println("O preço total foi: " + somaPreco);
// 							System.out.println("\nComfirmar compra? 0-Sim 1-Não (para cancelar compra)");
// 							comfirma = scan.nextInt();

// 							if (comfirma == 0) {
// 								System.out.println("Informe o ID do cliente:");
// 								int IDCliente = scan.nextInt();
// 								System.out.println("Compra efetuada com sucesso!");
// 								saldoCaixa = saldoCaixa + somaPreco;
// 								quantidadeProduto[i] = (quantidadeProduto[i] - qtdCompra);
// 								System.out.println("Deseja realizar outra compra? 1 = SIM | 2 = NÃo");
// 								comfirma1 = scan.nextInt();
// 								if (comfirma1 == 1) {
// 									venderProduto();
// 								} else {
// 									menu();
// 								}
// 							} else {
// 								menu();
// 							}
// 						} else {
// 							System.out.println("Valor inválido, tente novamente!");
// 							venderProduto();
// 						}
// 					} else {
// 						System.out.println("Não existe nenhum produto com esse ID.");
// 						break;
// 					}
// 				}
// 			} else {
// 				System.out.println("não existe produto em estoque!\n");
// 				System.out.println("Pressione 1 para abrir Menu");
// 				System.out.println("Escolha:");
// 				int op = scan.nextInt();
// 				if (op == 1) {
// 					menu();
// 				}
// 				while (op != 1) {
// 					System.out.println("Opção inválida!, tente novamente\n");
// 					System.out.println("Pressione 1 para abrir Menu");
// 					System.out.println("Escolha:");
// 					op = scan.nextInt();
// 				}
// 			}
// 		}

// 	}

// }
