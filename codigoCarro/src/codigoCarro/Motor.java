package codigoCarro;

public class Motor {
	private String fabricante;
	private double cilindrada;
	private String combustivel;
	
	
	public String getFabricante() {
		return fabricante;
	}


	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}


	public double getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	public Motor(){
		setFabricante("algum fabricante");
		setCilindrada(0);
		setCombustivel("flex-one");
	}

	 public Motor(String fabricante, double cilindrada, String combustivel) {
	 	setFabricante(fabricante);
	 	setCilindrada(cilindrada);
	 	setCombustivel(combustivel);
	 }
}
