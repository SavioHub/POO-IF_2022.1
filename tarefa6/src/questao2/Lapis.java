package questao2;
import java.util.Scanner;

public class Lapis extends MaterialEscolar {
	Scanner scan = new Scanner(System.in);
	public Lapis() {
		setQtd(1);
		setCor("Preto");
		setPreco(2.00);
		setAltura(8.0f);
		setLargura(0.3f);
	}

	public void escreverTexto(Papel p) {
		String texto;
		System.out.println("Digite alguma coisa para escrever na folha de papel:");
		texto = scan.nextLine();
		p.setTexto(texto);
	}
}
