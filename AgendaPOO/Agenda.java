import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {

    private Scanner scan = new Scanner(System.in);
    private String nome;
    // private Endereco endereco;

    public Agenda(String nome) {
        this.nome = nome;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void cadastrarContatoPessoal(ArrayList<ContatoPessoal> ctt) {

        System.out.println("-------------Adicionar novo Contato Pessoal-----------\n");
        System.out.println("Nome:");
        String nome = scan.nextLine();
        System.out.println("ID:");
        int id = scan.nextInt();
        System.out.println("Idade:");
        int idade = scan.nextInt();
        System.out.println("Celular:");
        String celular = scan.nextLine();
        celular = scan.nextLine();
        System.out.println("Telefone:");
        String telefone = scan.nextLine();

        ContatoPessoal cp = new ContatoPessoal(id,idade, celular, telefone, nome);
        ctt.add(cp);
    }

    public void listarCttPessoal(ArrayList<ContatoPessoal> ctt) {
        System.out.println("------------------CONTATOS PESSOAIS------------------");
        for (int i = 0; i < ctt.size(); i++) {
            System.out.println("Nome: " + ctt.get(i).getNome() + " Idade:" + ctt.get(i).getIdade() + " Celular:"
                    + ctt.get(i).getCelular() + ctt.get(i).getTelefone());
        }
        System.out.println("------------------CONTATOS PESSOAIS------------------");
    }

    public void cadastrarContatoComercial(ArrayList<ContatoComercial> ctt, ArrayList<Endereco> end) {

        System.out.println("-------------Adicionar novo Contato Comercial-----------\n");
        System.out.println("ID:");
        int id = scan.nextInt();
        System.out.println("Nome:");
        String nome = scan.nextLine();
        System.out.println("profissão");
        String profissao = scan.nextLine();
        System.out.println("WhatsApp:");
        String whats = scan.nextLine();
        System.out.println("Email:");
        String email = scan.nextLine();
        System.out.println("Telefone:");
        String telefone = scan.nextLine();
        System.out.println("Celular");
        String celulular = scan.nextLine();

        System.out.println("---- Endereço----");
        System.out.println("Cidade:");
        String cidade = scan.nextLine();
        System.out.println("Bairro:");
        String bairro = scan.nextLine();
        System.out.println("Estado:");
        String estado = scan.nextLine();
        System.out.println("Número:");
        int num = scan.nextInt();

        Endereco endereco = new Endereco(bairro, cidade, estado, num);
        end.add(endereco);

        ContatoComercial cp = new ContatoComercial(id,profissao, whats, email, celulular, telefone, nome);
        ctt.add(cp);
    }

    public void listarContatoComercial(ArrayList<ContatoComercial> ctt, ArrayList<Endereco> end) {
        System.out.println("-------------------CONTATOS COMERCIAIS---------------------");
        for (int i = 0; i < ctt.size(); i++) {
            System.out.println("Nome: " + ctt.get(i).getNome() + " Profissão:" + ctt.get(i).getProfissao() + " Celular:"
                    + ctt.get(i).getCelular() + " WhatsApp:" + ctt.get(i).getWhatsapp() + " Email"
                    + ctt.get(i).getEmail());
        }
        for (int i = 0; i < end.size(); i++) {
            System.out.println("Cidade:" + end.get(i).getCidade() + " Bairro:" + end.get(i).getBairro() + " Numero:"
                    + end.get(i).getNumero());
        }
        System.out.println("-------------------CONTATOS COMERCIAIS---------------------");
    }

    public void cadastrarContatoEletronico(ArrayList<ContatoEletronico> ctt) {

        System.out.println("-------------Adicionar novo Contato Eletrônico-----------\n");
        System.out.println("ID:");
        int id = scan.nextInt();
        System.out.println("Nome:");
        String nome = scan.nextLine();
        System.out.println("Celular:");
        String celular = scan.nextLine();
        // celular = scan.nextLine();
        System.out.println("Telefone:");
        String telefone = scan.nextLine();

        ContatoEletronico cp = new ContatoEletronico(id,celular, telefone, nome);
        ctt.add(cp);
    }

    public void listarContatoEletronico(ArrayList<ContatoEletronico> ctt) {
        System.out.println("-------------CONTATOS ELETRÔNICOS------------");
        for (int i = 0; i < ctt.size(); i++) {
            System.out.println("Nome: " + ctt.get(i).getNome() + " Celular:" + ctt.get(i).getCelular() + " Telefone:"
                    + ctt.get(i).getTelefone());
        }
        System.out.println("-------------CONTATOS ELETRÔNICOS------------");
    }

    // public void editarContatoPessoal(ArrayList<ContatoPessoal>cttPessoal){
    //     for(int i=0;i<cttPessoal.size();i++){
    //         System.out.println("Digite o ID do contato:");
    //         int idTeste = scan.nextInt();
    //         if(idTeste == cttPessoal.get(i).getId()){
    //             System.out.println("Digite novos dados:\n");
    //             System.out.println("Nome:");
    //             String nome = scan.nextLine();
    //             nome = scan.nextLine();
    //             System.out.println("ID:");
    //             int id = scan.nextInt();
    //             System.out.println("Idade:");
    //             int idade = scan.nextInt();
    //             System.out.println("Celular:");
    //             String celular = scan.nextLine();
    //             celular = scan.nextLine();
    //             System.out.println("Telefone:");
    //             String telefone = scan.nextLine();
        
    //             ContatoPessoal cp = new ContatoPessoal(id,idade, celular, telefone, nome);
    //             cttPessoal.add(cp);
    //         }

    //     }
    // }

    // endereço
    public void adicionarEndereco(ArrayList<Endereco> end) {
        System.out.println("Cidade:");
        String cidade = scan.nextLine();
        System.out.println("Bairro:");
        String bairro = scan.nextLine();
        System.out.println("Estado:");
        String estado = scan.nextLine();
        System.out.println("Número:");
        int num = scan.nextInt();

        Endereco endereco = new Endereco(bairro, cidade, estado, num);
        end.add(endereco);

    }

    public void listarEndereco(ArrayList<Endereco> end) {
        System.out.println("-----------------ENDEREÇOS--------------");
        for (int i = 0; i < end.size(); i++) {
            System.out.println("Cidade:" + end.get(i).getCidade() + " Bairro:" + end.get(i).getBairro() + " Numero:"
                    + end.get(i).getNumero());
        }
        System.out.println("-----------------ENDEREÇOS--------------");
    }
}
