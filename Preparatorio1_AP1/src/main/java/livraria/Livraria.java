package livraria;
/**
 *
 * @author fabriciomendonca
 */
public class Livraria {

    public static void main(String[] args) {
        Livro l1 = new Livro();
        l1.setTitulo("A História do Brasil Moderno");
        l1.setTipo("História");
        l1.setQuantidade(40);
        
        Livro l2 = new Livro();
        l2.setTitulo("Como Programar em Java");
        l2.setTipo("Computação - Programação");
        l2.setQuantidade(50);
        
        Livro l3 = new Livro(3, "Algoritmos e Estrutura de Dados", "Elsevier", 4, "Programação", 60);
        
        Livro l4 = new Livro(4, "Matemática Financeira", "Elsevier", 4, "Matemática", 60);
        
        System.out.println("Livro: " + l1.getOrdem() + " - " + l1.getTitulo());
        System.out.println("Valor Total da Compra: R$ " + l1.calculaValorTotal(40));
        System.out.println("Livro: " + l2.getOrdem() + " - " + l2.getTitulo());
        System.out.println("Valor Total da Compra: R$ " + l2.calculaValorTotal(50));
        System.out.println("Livro: " + l3.getOrdem() + " - " + l3.getTitulo());
        System.out.println("Valor Total da Compra: R$ " + l3.calculaValorTotal(60));
        System.out.println("Livro: " + l4.getOrdem() + " - " + l4.getTitulo());
        System.out.println("Valor Total da Compra: R$ " + l4.calculaValorTotal(60));
        
        if (l1.darBaixa(41)) {
            l1.exibir();
        }
        if (l2.darBaixa(30)) {
            l2.exibir();
        }        
        if (l3.darBaixa(10)) {
            l3.exibir();
        }        
        if (l4.darBaixa(5)) {
            l4.exibir();
        }       
    }
    
}
