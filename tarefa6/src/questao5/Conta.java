package questao5;

import java.util.Scanner;


public class Conta {
	Scanner scan = new Scanner (System.in);
	private String numConta;
	private String numAgencia;
	private String nome;
	private float saldo;
	
	public String getNumAgencia() {
		return numAgencia;
	}

	public void setNumAgencia(String numAgencia) {
		this.numAgencia = numAgencia;
	}
	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getSaldo() {
		return this.saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	
}
