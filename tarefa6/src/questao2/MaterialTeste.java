package questao2;

public class MaterialTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Papel papel = new Papel();
		Lapis lapis = new Lapis();
		Borracha borracha = new Borracha();
				
		System.out.println("Informações do papel");
		System.out.println("Quantidade:"+papel.getQtd());
		System.out.println("Cor:"+papel.getCor());
		System.out.println("Preço:"+papel.getPreco()+"\n");
		System.out.println("Informações do lapis");
		System.out.println("Quantidade:"+lapis.getQtd());
		System.out.println("Cor:"+lapis.getCor());
		System.out.println("Preço:"+lapis.getPreco()+"\n");
		System.out.println("Informações da borracha");
		System.out.println("Quantidade:"+borracha.getQtd());
		System.out.println("Cor:"+borracha.getCor());
		System.out.println("Preço:"+borracha.getPreco()+"\n");
		
		
		
//		lapis.escreverTexto(papel);
//		papel.digitar();
		
//		papel.escrever();
		lapis.escreverTexto(papel);
		papel.mostrarTexto();
		borracha.apagar(papel);
		papel.mostrarTexto();
		
	}

}
