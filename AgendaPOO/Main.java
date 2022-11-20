import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Endereco> end = new ArrayList<>();
        ArrayList<ContatoPessoal> cp = new ArrayList<>();
        ArrayList<ContatoComercial> cc = new ArrayList<>();
        ArrayList<ContatoEletronico> ce = new ArrayList<>();   

        Agenda agenda = new Agenda("Agenda de escritorio");

        boolean logado = logar();

        if (logado) {

            while (true) {
                System.out.println("\n\n"+"\t"+agenda.getNome());
                int opcaoMenu = menu();

                if (opcaoMenu == 1) {
                    agenda.cadastrarContatoPessoal(cp);
                } else if (opcaoMenu == 2) {
                    agenda.listarCttPessoal(cp);
                } else if (opcaoMenu == 3) {
                    agenda.cadastrarContatoEletronico(ce);
                } else if (opcaoMenu == 4) {
                    agenda.listarContatoEletronico(ce);
                } else if (opcaoMenu == 5) {
                    agenda.cadastrarContatoComercial(cc,end);
                } else if (opcaoMenu == 6) {
                    agenda.listarContatoComercial(cc,end);
                } else if (opcaoMenu == 7) {
                    agenda.adicionarEndereco(end);
                } else if (opcaoMenu == 8) {
                    agenda.listarEndereco(end);
                } else if (opcaoMenu == 9) {
                    limparTela(); 
                }else if(opcaoMenu == 10){
                    System.out.println("- - - - - - Desconectado! COM SUCESSO - - - - - ");
                    break;
                }
            }

        }
    }

    public static boolean logar() {
        boolean login;
        Scanner scan = new Scanner(System.in);
        String user, pass;
        String userName = "admin", passLogin = "123";

        System.out.println("-------Login do Sistema de Agenda de Contatos------");
        System.out.println("Informe o nome de usuário:");
        user = scan.nextLine();

        System.out.println("Informe a senha de login:");
        pass = scan.nextLine();

        if (user.equals(userName) && pass.equals(passLogin)) {
            login = true;
        } else {
            login = true;
            System.out.println("Usuario Incorreto ou Senha Incorreta!!!\n\n");
            logar();
        }
        return login;
    }

    public static int menu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("------------ Menu-----------\n");
        System.out.println("1 - Adicionar contato Pessoal");
        System.out.println("2 - Listar contal pessoal");
        System.out.println("3 - Adicionar Contato Eletronico");
        System.out.println("4 - Listar Contato Eletronico");
        System.out.println("5 - Adicionar Contato Comercial");
        System.out.println("6 - Listar contato comercial");
        System.out.println("7 - Adicionar Endereço");
        System.out.println("8 - Listar Endereço");
        System.out.println("9 - Limpar Tela");
        System.out.println("10 - sair");
        System.out.println("------------------------------\n");
        System.out.println("O que deseja fazer?");
        System.out.println("Escolha:");
        int opcaoMenu = scan.nextInt();
        return opcaoMenu;
    }

    public static void limparTela() {
        System.out.println(
                "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
}
