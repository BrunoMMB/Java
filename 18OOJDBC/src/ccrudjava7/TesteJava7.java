package ccrudjava7;

import java.util.List;

public class TesteJava7 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        new TesteJava7();
    }

    public TesteJava7() {
        List<Contato> contatos = null;
        ContatoDAO contatoDAO = new ContatoDAO();
        /*
        contatoDAO.adiciona(this.obtemContatoExemplo());
        System.out.println("\n\nDado adicionado:");
        contatos = contatoDAO.lista(null);
        this.imprimeLista(contatos);
        */
        
        /*
         contatoDAO.altera(this.obtemContatoExemploAltera());
         System.out.println("\n\nDado alterado:");
         contatos = contatoDAO.lista(null);
         this.imprimeLista(contatos);
        */
        
         contatoDAO.exclui(this.obtemContatoExemploExclui());
         System.out.println("\n\nDado excluído:");
         contatos = contatoDAO.lista(null);
         this.imprimeLista(contatos);
        
        
         
    }
    
    private void imprimeLista(List<Contato> contatos) {
        for (Contato c : contatos) {
         System.out.println(c);
         }
    }

    private Contato obtemContatoExemplo() {
        Contato contato = new Contato();
        contato.setNome("Manezaoooo 14-06-2016");
        contato.setEndereco("Rua Dr Florestan");
        contato.setEmail("eduardosilvestre@iftm.edu.br");
        contato.setDataNascimento("21/11/1996");
        return contato;
    }

    private Contato obtemContatoExemploAltera() {
        Contato contato = new Contato();
        contato.setId(24l);
        contato.setEndereco("Rua ABCD");
        return contato;
    }

    private Contato obtemContatoExemploExclui() {
        Contato contato = new Contato();
        contato.setId(23l);
        return contato;
    }
}
