package modelo;

import java.util.ArrayList;
import java.util.List;

public class Categoria {
    private String nome;
    private int id;
    private List<Cliente> clientes = new ArrayList<>();

    public String getNome(){
        return this.nome;
    }
    public int getId(){
        return this.id;
    }

    public Categoria(int id1, String nome1){
        this.nome = nome1;
        this.id = id1;
    }
    public void adicionarCliente(Cliente cliente){
        clientes.add(cliente);
    }

    public List<Cliente> getClientes() {
        return clientes;
    }
}
