package csimulacaodaolist;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Filme {

    private long id;
    private String nome;
    private LocalDate dataLancamento;
    private BigDecimal valor;

    public Filme(String nome, LocalDate dataLancamento, BigDecimal valor) {
        this.nome = nome;
        this.dataLancamento = dataLancamento;
        this.valor = valor;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

}
