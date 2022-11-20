public class ContatoComercial extends Contato{
    private String whatsapp;
    private String email;
    private String profissao;

    
    public ContatoComercial(int id,String profissao, String whatsapp, String email, String celular, String telefone, String nome) {
        super(id,celular, telefone, nome);
        setWhatsapp(whatsapp);
        setEmail(email);
        setProfissao(profissao);
    }
    
    public String getWhatsapp() {
        return this.whatsapp;
    }
    
    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getProfissao() {
        return this.profissao;
    }
    
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}
