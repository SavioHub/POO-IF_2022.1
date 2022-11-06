package questao2;

public class Borracha extends MaterialEscolar{

	public Borracha() {
		setQtd(1);
		setCor("branca");
		setPreco(2.50);
		setAltura(4.0f);
		setLargura(2.0f);
	}
	
	public void apagar(Papel p) {
		System.out.println("Apagando texto");
		p.setTexto("VAZIO!");
	}
}


//Eu fiz uma classe chamada de MaterialEscolar, e definir as classes Borracha, Lapis e Papel como sub classes
//depois modelei a classe Lapis como a classe principal usando a associação de agregação