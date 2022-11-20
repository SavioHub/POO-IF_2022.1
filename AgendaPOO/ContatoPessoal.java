public class ContatoPessoal extends Contato{
    private int idade;
    
    public ContatoPessoal(int id,int idade ,String celular, String telefone, String nome) {
        super(id,celular, telefone, nome);
        setIdade(idade);
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    
}
