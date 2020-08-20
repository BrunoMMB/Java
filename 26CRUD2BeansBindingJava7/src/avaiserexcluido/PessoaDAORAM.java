/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaiserexcluido;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author EDYA
 */
public class PessoaDAORAM {
    CidadeDAORAM cidadeDAORAM = new CidadeDAORAM();
      
    public Pessoa criaPessoa() {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("eduardo");
        Cidade c = cidadeDAORAM.localizar(1l);
        pessoa.setCidade(c);
        pessoa.setSalario(BigDecimal.TEN);
        pessoa.setNascimento("10/10/2000");
                
        return pessoa;
    }
    static List<Pessoa> pessoas = new ArrayList<>();
    static long contador = 1;

    public boolean salvar(Pessoa obj) {
        if (obj.getCodigo() == null) {
            return inserir(obj);
        } else {
            return alterar(obj);
        }
    }

    public List<Pessoa> getLista() {
        return this.pessoas;
    }

    public boolean inserir(Pessoa pessoa) {
        pessoa.setCodigo(contador++);
        this.pessoas.add(pessoa);
        return true;
    }

    public boolean alterar(Pessoa pessoa) {
        Iterator<Pessoa> iterator = pessoas.iterator();
        while (iterator.hasNext()) {
            Pessoa temp = iterator.next();
            if (pessoa.getCodigo().equals(temp.getCodigo())) {
                temp.setNome(pessoa.getNome());
                temp.setNascimento(pessoa.getNascimento());
                temp.setSalario(pessoa.getSalario());
                temp.setCidade(pessoa.getCidade());
                break;
            }
        }
        return true;
    }

    public boolean remover(Pessoa pessoa) {
        Iterator<Pessoa> iterator = pessoas.iterator();
        boolean excluido = false;
        while (iterator.hasNext()) {
            Pessoa temp = iterator.next();
            if (pessoa.getCodigo().equals(temp.getCodigo())) {
                iterator.remove();
                excluido = true;
                break;
            }
        }
        return excluido;
    }

    public Pessoa localizar(Long codigo) {
        for (Pessoa ctemp : pessoas) {
            if (ctemp.getCodigo().equals(codigo)) {
                return ctemp;
            }
        }
        return null;
    }
}
