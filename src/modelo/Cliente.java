package modelo;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private Integer id;
    private  String nome;
    private  Integer idade;
    private List<Cliente> clientes = new ArrayList<>();

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
    public List<Cliente> getClientes() {
        return clientes;
    }

    public Cliente(String nome, Integer idade) {
        setNome(nome);
        setIdade(idade);
    }
    public Cliente(Integer id, Integer idade, String nome){
        setId(id);
        setIdade(idade);
        setNome(nome);
    }
    public Cliente(){

    }
    @Override
    public String toString() {
        return String.format("O cliente é %d, %s, %d", getId(), getNome(), getIdade());
    }
}
