package questao6;

public class Venda {
	private Funcionario func;
	private Cliente cli;
	private Produto pro;
	
	public void venderProduto() {
		System.out.println("Vender produto disponivel:"+pro.getNome());
		
	}
	
	public void margemLucro(double precoVenda, double precoCusto) {
		double soma=0, margemLucro=0;
		
		soma = precoVenda-precoCusto;
		margemLucro = soma / precoVenda * 100;
		System.out.println("Lucro é de: R$ "+soma);
		System.out.println("Margem de Lucro: "+margemLucro+"%");
	}
}
