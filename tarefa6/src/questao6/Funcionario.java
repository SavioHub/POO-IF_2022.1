package questao6;

import java.util.Scanner;

public class Funcionario extends Pessoa{
	Scanner scan = new Scanner(System.in);
	private String setor;
	private double salario, salarioMinimo;
	
	public Funcionario() {
		setNome("Sávio Santos");
		setCpf("093.385.075-22");
		setIdade(20);
		setSetor("front-end");
		setSalario(2345);
	}

 
	public double getSalarioMinimo() {
		return salarioMinimo;
	}
	public void setSalarioMinimo(double salarioMinimo) {
		this.salarioMinimo = salarioMinimo;
	}
	public String getSetor() {
		return this.setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}

	public double getSalario() {
		return this.salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	public void informarFuncionario() {
		System.out.println("nome do Funcionário:"+getNome()+"\nIdade:"+getIdade()+"\nseu salário:"+getSalario()+"\nSetor:"+getSetor());
		
	}
	
//	public void venderProduto(Produto pro) {
//		System.out.println("Vender produto disponivel:"+pro.getNome());
//		
//	}
	
}