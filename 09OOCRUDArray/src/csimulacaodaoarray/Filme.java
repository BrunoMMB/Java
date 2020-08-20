package csimulacaodaoarray;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Filme {

    private long id;
    private String titulo;
    private LocalDate dataLancamento;
    private BigDecimal valor;

    public Filme(long id, String titulo, LocalDate dataLancamento, BigDecimal valor) {
        this.id = id;
        this.titulo = titulo;
        this.dataLancamento = dataLancamento;
        this.valor = valor;
    }

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the dataLancamento
     */
    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    /**
     * @param dataLancamento the dataLancamento to set
     */
    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    /**
     * @return the valor
     */
    public BigDecimal getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

}
