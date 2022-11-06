package questao5;

public class ContaCorrente extends Conta{
//	private String tipo;
	public ContaCorrente() {
		setNome("Sávio Santos da Silva");
		setNumAgencia("0001");
		setNumConta("45442-7");
	}


	public void menu() {
		boolean sair = true;
		do {
			System.out.println("Bem vindo:" + getNome()+"\nConta:"+getNumConta()+"\nAgência:"+getNumAgencia()+"\n");
			System.out.println("[1] Saldo");
			System.out.println("[2] Sacar");
			System.out.println("[3] Depositar");
			System.out.println("[0] Sair");
			System.out.print("Operação: ");
			int operacao = scan.nextInt();
			
			switch (operacao) {
			case 1:
				valorSaldo();
				break;
			case 2:
				System.out.print("Valor para o saque: R$ ");
				float valorSaque = scan.nextFloat();
				sacar(valorSaque);
				break;
			case 3:
				System.out.print("Valor para depósito: R$ ");
				float valorDeposito = scan.nextFloat();
				depositar(valorDeposito);
				break;
			case 0:
				sair = false;
				break;
			default:
				System.out.println("Operação inválida");	
			}
		} while (sair);
		System.out.println("Até logo " + this.getNome());
	}
	
	public void valorSaldo() {
		System.out.println("Seu saldo é de R$ " + this.getSaldo());
	}
	
	public void sacar(float valor) {
		if (this.getSaldo() < valor) {
			System.out.println("Saldo insuficiente para a operação");
		} else {
			setSaldo(this.getSaldo() - valor);
		}
	}

	public void depositar(float valor) {
		setSaldo(getSaldo()+valor);
	}

}