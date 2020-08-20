/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cabstracttablemodelcidadepessoa;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class TableModelPessoa extends AbstractTableModel {

    private List<Pessoa> listaDePessoa;
    private final String[] colunas = {"Código", "Nome", "Cidade", "Salario","Nascimento"};
    

    public TableModelPessoa() {
        this.listaDePessoa = new ArrayList<>();
    }

    /**
     * Retorna uma linha completa da tabela
     *
     * @param rowIndex
     * @return Cidade
     */
    public Pessoa get(int rowIndex) {
        return this.listaDePessoa.get(rowIndex);
    }

    /**
     * Adiciona uma Pessoa a tabela (cria uma linha)
     *
     * @param cidade
     */
    public void add(Pessoa pessoa) {
        this.listaDePessoa.add(pessoa);
        fireTableDataChanged();
    }
    
        /**
     * Edita uma Pessoa na tabela (cria uma linha)
     *
     * @param cidade
     */
    public void edita(Pessoa pessoa) {
        int position = 0;
        for (int i = 0; i < listaDePessoa.size(); i++) {
            Pessoa get = listaDePessoa.get(i);
            if (get.getCodigo().equals(pessoa.getCodigo())) {
                position = i;
                break;
            }
        }
        this.listaDePessoa.set(position, pessoa);     
        fireTableDataChanged();
    }

    /**
     * Remove uma cidade da tabela (remove uma linha)
     *
     * @param rowIndex
     */
    public void remove(int rowIndex) {
        this.listaDePessoa.remove(rowIndex);
        fireTableDataChanged();
    }

    /**
     * Retorna a quantidade de linhas da tabela
     *
     * @return int
     */
    @Override
    public int getRowCount() {
        return this.listaDePessoa.size();
    }

    /**
     * Retorna o numero de colunas da tabela
     *
     * @return int
     */
    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    /**
     * Retorna o valor especifico de uma celula
     *
     * @param rowIndex
     * @param columnIndex
     * @return Object
     */
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        //switch na coluna
        switch (columnIndex) {

            //codigo
            case 0:
                return this.listaDePessoa.get(rowIndex).getCodigo();

            //Nome
            case 1:
                return this.listaDePessoa.get(rowIndex).getNome();

            //Cidade
            case 2:
                return this.listaDePessoa.get(rowIndex).getCidade().getNome();
            
            //Salario
            case 3: 
                return this.listaDePessoa.get(rowIndex).getSalario();
            
            //Nascimento
            case 4: 
                return this.listaDePessoa.get(rowIndex).getNascimento();

            default:
                return this.listaDePessoa.get(rowIndex);
        }
    }

    @Override
    public String getColumnName(int columnIndex) {
        return this.colunas[columnIndex];
    }
}
