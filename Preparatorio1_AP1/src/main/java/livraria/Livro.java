package livraria;
/**
 *
 * @author fabriciomendonca
 */
public class Livro {
    private int ordem;
    private String titulo;
    private String editora;
    private float valorLocacao;
    private String tipo;
    private int quantidade;

    public Livro() {
        this.ordem = 1;
        this.editora = "Beta Livros";
        this.valorLocacao = 3.50f;
    }
    
    public Livro(int ordem, String titulo, String editora, float valorLocacao, String tipo, int quantidade) {
        this.ordem = ordem;
        this.titulo = titulo;
        this.editora = editora;
        this.valorLocacao = valorLocacao;
        this.tipo = tipo;
        this.quantidade = quantidade;
    }

    public int getOrdem() {
        return ordem;
    }

    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public float getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(float valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public float calculaValorTotal(int quantidadeComprada) {
        return (this.valorLocacao * quantidadeComprada);
    }
    
    public void exibir() {
        System.out.println("Dados do Livro: ");
        System.out.println("Número de ordem: " + this.ordem);
        System.out.println("Título: " + this.titulo);
        System.out.println("Editora: " + this.editora);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Valor da locação: " + this.valorLocacao);
        System.out.println("Quantidade disponível: " + this.quantidade);
    }
    
    public boolean darBaixa(int valor) {
        if (this.quantidade - valor >= 0)
        {
            this.quantidade -= valor;
            return true;   
        }
            
        else
            return false;
    }
}
