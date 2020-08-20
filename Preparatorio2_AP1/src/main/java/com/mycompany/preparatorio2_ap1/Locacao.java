package com.mycompany.preparatorio2_ap1;
/**
 *
 * @author fabriciomendonca
 */
public class Locacao {
    private String placa;
    private int numLocacao;
    private float valorDiaria;
    private String dataLocacao;
    private String dataDevolucao;
    private String situacao;

    public Locacao(String placa, int numLocacao, float valorDiaria) {
        this.placa = placa;
        this.numLocacao = numLocacao;
        this.valorDiaria = valorDiaria;
        this.situacao = "Aberta";
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumLocacao() {
        return numLocacao;
    }

    public void setNumLocacao(int numLocacao) {
        this.numLocacao = numLocacao;
    }

    public float getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(float valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public String getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(String dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    
    public void efetuarDevolucao(String data) {
        this.dataDevolucao = data;
        this.situacao = "Fechada";
    }
    
    public float calcularValorTotal(int qtdeDias) {
        float valorTotal;
        valorTotal = (this.valorDiaria * qtdeDias) + ((this.valorDiaria * qtdeDias)*0.137f) + ((this.valorDiaria * 0.013f)*qtdeDias);
        return valorTotal;
    }
    
    public void exibir() {
        System.out.println("Dados da Locação do Veículo: ");
        System.out.println("Placa: " + this.placa);
        System.out.println("Número da locação: " + this.numLocacao);
        System.out.println("Valor da diária: R$ " + this.valorDiaria);
        System.out.println("Data da locação: " + this.dataLocacao);
        System.out.println("Data da devolução: " + this.dataDevolucao);
        System.out.println("Situação:" + this.situacao);
    }
}
