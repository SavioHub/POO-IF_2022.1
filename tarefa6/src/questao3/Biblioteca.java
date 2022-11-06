package questao3;

public class Biblioteca {
	private Aluno aluno;
	private Livro livro;
	
	public void emprestar() {
			System.out.println("Livro emprestado!");		
	}
	
	public void mostrarLivrosEmprestados() {
		System.out.println("Titulo:"+livro.getTitulo()+"Autor:"+livro.getAutor()+"Ano:"+livro.getAno());
		System.out.println("Nome do Aluno:"+aluno.getNome()+"Matricula:"+aluno.getMatricula());
	}
}
