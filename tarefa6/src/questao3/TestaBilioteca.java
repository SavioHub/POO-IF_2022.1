package questao3;

public class TestaBilioteca {
	public static void main(String[] args) {
	Biblioteca b = new Biblioteca();
	Livro livro1 = new Livro();
	
	livro1.setTitulo("50 tons de cinza");
	livro1.setAno(2012);
	livro1.setAutor("savio");
	livro1.setDisponibilidade(true);
	
	b.emprestar();
	b.mostrarLivrosEmprestados();
	}
}