package codigoCarro;

public class TesteCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		System.out.println("\nModelo:"+meuCarro.getModelo() + 
//				"Motor:"+meuCarro.getMotor().getCilindrada()+
//				"Combustivel:"+meuCarro.getMotor().getCombustivel());
		
		Motor meuMotor = new Motor();
		Carro meuCarro = new Carro();
		
		Condutor condutor = new Condutor();

//		meuMotor.setFabricante("Fiat luz");
//		meuMotor.setCombustivel("Gasolina aditivada");
//		meuMotor.setCilindrada(1.8);

		meuCarro.setModelo("Hilux");

		condutor.dirigir(meuCarro);
		
		condutor.acelerar(meuCarro);
		condutor.acelerar(meuCarro);
	}

}
