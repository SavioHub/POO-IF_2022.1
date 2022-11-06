package codigoCarro;

public class Carro {

	private Motor motor;
	private String modelo; // pode ser uma ferrari, um chevet, maverik…
	private int velocidadeMaxima;
	private int velocidadeAtual;
	
	public Motor getMotor() {
		return motor;
	}
	
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	
	public void setModelo(String modelo) {
		
		this.modelo = modelo;
		
	}
	
	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	
	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}
	
	public void setVelocidadeAtual(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}
	
	public String getModelo() { // esqueci desse no diagrama
		
		return this.modelo;
		
	}
	
	
	public Carro() { // método construtor
		setModelo("Carro qualquer");
		setVelocidadeAtual(0);
		setVelocidadeMaxima(120);
	}
	public Carro(String modelo, Motor motor, int velocidadeMaxima, int velocidadeAtual) {
		setModelo(modelo);
		setMotor(motor);
		setVelocidadeAtual(velocidadeAtual);
		setVelocidadeMaxima(velocidadeMaxima);
	}
	
//--------------------------------------------------------------------------------------------------------------------------------------
	public void ligarCarro() {
		System.out.println("O carro está ligado.");
	}
	
	public void desligarCarro() {
		
		System.out.println("O carro está desligado.");
		
	}
	
	public void acelera(int veloc) {
		
// verifica se a velocidade adicionada não ultrapassa a
//velocidade maxima do carro
		
		if (this.velocidadeAtual + veloc <= this.velocidadeMaxima) {
			
			this.velocidadeAtual += veloc;
			
			System.out.println("acelerando, Velocidade Atual: " + this.velocidadeAtual);
			
// this -> indica que é a variavel privada da classe      
			
		}else {
			
			this.velocidadeAtual = this.velocidadeMaxima;
			System.out.println("Velocidade maxima atingida! \n"+	"Velocidade atual: "+this.velocidadeAtual);
			
		}
	}
	
	
	public void reduzir(int veloc) {
		
		if (this.velocidadeAtual - veloc > 0) {
			
			this.velocidadeAtual -= veloc;
			System.out.println("reduzindo, Velocidade Atual: " + this.velocidadeAtual);
		} else {
			
			pararCarro();
			
		}
	}
	
	public void pararCarro() {
		
		this.velocidadeAtual = 0;
		System.out.println("O carro parou, Velocidade Atual: "+this.velocidadeAtual);
		
	}
	
}

teste