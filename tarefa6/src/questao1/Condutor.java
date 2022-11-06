package questao1;

import java.util.Scanner;

public class Condutor {
	Scanner scan = new Scanner(System.in);
	private String codHabilitacao;

	public Condutor(){
		setCodHabilitacao("00001");
	}
	// public Condutor(String codHabilitacao) {
	// 	setCodHabilitacao(codHabilitacao);
	// }
	
	public String getCodHabilitacao() {
		return codHabilitacao;
	}

	public void setCodHabilitacao(String codHabilitacao) {
		this.codHabilitacao = codHabilitacao;
	}
	
	public void dirigir(Carro carro) {
		System.out.println("Condutor:"+getCodHabilitacao() + " dirigindo um Carro");
		System.out.println("modelo do carro:"+carro.getModelo());
		System.out.println("Motor:"+carro.getMotor().getCilindrada()); //não está funcionando
		System.out.println("\nvelocidade máxima do carro:"+carro.getVelocidadeMaxima());
	}
	public void acelerar(Carro carro) {
		System.out.println("\nDigite a velocidade:");
		carro.acelera(scan.nextInt());
	
}
}