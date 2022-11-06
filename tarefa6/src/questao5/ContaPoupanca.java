package questao5;

import java.util.Scanner;

public class ContaPoupanca extends Conta{
		private Scanner scan = new Scanner(System.in);
		private double chequeEspecial;
		public ContaPoupanca() {
			setNome("Adriely Santos");
			setNumAgencia("00001");
			setNumConta("55454-9");
		}
		
		public double getChequeEspecial() {
			return chequeEspecial;
		}

		public void setChequeEspecial(double chequeEspecial) {
			this.chequeEspecial = chequeEspecial;
		}
		
		public void menu() {
			boolean sair = true;
			do {
				System.out.println("Bem vindo:" + getNome()+"\nConta:"+getNumConta()+"\nAgência:"+getNumAgencia()+"\n");
				System.out.println("[1] Saldo");
				System.out.println("[2] Sacar");
				System.out.println("[3] Depositar Poupança");
				System.out.println("[4] Depositar Cheque Especial");
				System.out.println("[0] Sair");
				System.out.print("Operação: ");
				int operacao = scan.nextInt();
				
				switch (operacao) {
				case 1:
					saldoDisponivel();
					break;
				case 2:
					System.out.print("Valor para o saque: R$ ");
					float valorSaque = scan.nextFloat();
					sacarPoupanca(valorSaque);
					break;
				case 3:
					System.out.print("Valor para depósito: R$ ");
					float valorDeposito = scan.nextFloat();
					depositar(valorDeposito);
					break;
				case 4:
					depositarCheque();
				case 0:
					sair = false;
					break;
				default:
					System.out.println("Operação inválida");	
				}
			} while (sair);
			System.out.println("Até logo " + getNome());
		}
		
		public void saldoDisponivel() {
			System.out.println("Valor de saldo atual:"+getSaldo()+getChequeEspecial());
		}
	    
		public void depositar(float valor) {
			setSaldo(getSaldo()+valor);
		}
		public void depositarCheque() {
			System.out.println("Digite o valor de depósito: R$ ");
			float valorDepositoCheque = scan.nextFloat();
			setChequeEspecial(valorDepositoCheque);
		}
	    
		public void sacarPoupanca(float valor) {
			if (getSaldo() < valor) {
				System.out.println("Saldo insuficiente para a operação");
			} else {
				setSaldo(getSaldo() - valor);
			}
		}

//	    public void valorSaldo() {
//	    	System.out.println("Valor de saldo atual:"+getSaldo());
//	    }
	}