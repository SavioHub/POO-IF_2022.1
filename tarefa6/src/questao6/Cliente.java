package questao6;

public class Cliente extends Pessoa{
	
	public Cliente() {
		setNome("Woquinton Fernandes");
		setCpf("435.444.365-22");
		setIdade(20);
		
	}
		
	public void imprimirCliente() {
		System.out.println("Nome do Cliente:" + getNome() + "\nIdade:" + getIdade() + "\nCPF:"+getCpf());
	}
}
