package modelo;

public class Cliente {
    private Integer id;
    private  String nome;
    private  Integer idade;

    public String getNome(){
        return this.nome;
    }
    public Integer getIdade(){
        return this.idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(Integer idade){
        this.idade = idade;
    }

    public Integer getId(){
        return this.id;
    }
    public void setId(Integer id){
        this.id = id;
    }

    public Cliente(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public Cliente(){

    }

    @Override
    public String toString() {
        return String.format("O produto foi %d, %s, %d", getId(), getNome(), getIdade());
    }
}
