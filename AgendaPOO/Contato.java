public class Contato {
    private String celular;
    private String telefone;
    private String nome;
    private int id;

    public Contato(int id, String celular, String telefone, String nome) {
        this.celular = celular;
        this.telefone = telefone;
        this.nome = nome;
        this.id = id;
    }
    
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getCelular() {
        return this.celular;
    }
    
    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    public String getTelefone() {
        return this.telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
}

