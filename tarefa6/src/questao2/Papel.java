package questao2;
 
public class Papel extends MaterialEscolar{
	private Borracha bo;
	private Lapis la;
	private String texto;

	public Papel() {
		setQtd(1);
		setCor("branco");
		setPreco(1.00);
		setAltura(20.0f);
		setLargura(0.1f);
	}
	
	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Borracha getBo() {
		return bo;
	}

	public void setBo(Borracha bo) {
		this.bo = bo;
	}

	public Lapis getLa() {
		return la;
	}

	public void setLa(Lapis la) {
		this.la = la;
	}
	
//	public void escrever() {
//		la.escreverTexto("");
//	}

	public void mostrarTexto() {
		System.out.println("Texto:"+getTexto());
	}

	
}
