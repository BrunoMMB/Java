/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeldb;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import model.Cidade;

/**
 *
 * @author EDYA
 */
public class CidadeDAORAM {

    static List<Cidade> cidades = new ArrayList<>();;
    static long contador = 1;
    
    public boolean salvar(Cidade obj) {
        if (obj.getCodigo() == null) {
            return inserir(obj);
        } else {
            return alterar(obj);
        }
    }
    
    public List<Cidade> getLista() {
        return this.cidades;
    }

    public boolean inserir(Cidade cidade) {
        cidade.setCodigo(contador++);
        this.cidades.add(cidade);
        return true;
    }

    public boolean alterar(Cidade cidade) {
        Iterator<Cidade> iterator = cidades.iterator();
        while (iterator.hasNext()) {
            Cidade temp = iterator.next();
            if (cidade.getCodigo().equals(temp.getCodigo())) {
                temp.setNome(cidade.getNome());
                temp.setUf(cidade.getUf());
                break;
            }
        }
        return true;
    }

    public boolean remover(Cidade cidade) {
        Iterator<Cidade> iterator = cidades.iterator();
        boolean excluido = false;
        while (iterator.hasNext()) {
            Cidade temp = iterator.next();
            if (cidade.getCodigo().equals(temp.getCodigo())) {
                iterator.remove();
                excluido = true;
                break;
            }
        }
        return excluido;
    }

    public Cidade localizar(Long codigo) {
        for (Cidade ctemp : cidades) {
            if (ctemp.getCodigo().equals(codigo)) {
            return ctemp;
         }
        }
        return null;
    }
}
