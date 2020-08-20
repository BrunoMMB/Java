/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cabstracttablemodelcidadepessoa;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 *
 * @author EDYA
 */
public class PessoaDAORAM {

    private List<Pessoa> pessoas = new ArrayList<>();
    private long contador = 1;
    
    
     public PessoaDAORAM() {
        if(pessoas.isEmpty()){
            this.criaPessoa();
        }
        
    }

    public Pessoa salvar(Pessoa obj) {
        if (obj.getCodigo() == null) {
            return inserir(obj);
        } else {
            return alterar(obj);
        }
    }
    
    private void criaPessoa() {
        CidadeDAORAM cidadeDAO = new CidadeDAORAM();
        List<Cidade> cidades = new ArrayList();
        cidades = cidadeDAO.getLista();
   
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Joao Moniz Alves e Urzedo");
        pessoa1.setNascimento(LocalDate.of(1998, Month.JUNE, 4));
        pessoa1.setCidade(cidades.get(0));
        pessoa1.setSalario(BigDecimal.valueOf(600));
        pessoa1.setCodigo(contador);
        contador++;
        
        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Tainara Alves e Urzedo");
        pessoa2.setNascimento(LocalDate.of(1997, Month.FEBRUARY, 9));
        pessoa2.setCidade(cidades.get(1));
        pessoa2.setSalario(BigDecimal.valueOf(1500));
        pessoa2.setCodigo(contador);
        contador++;

        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
    }

    public List<Pessoa> getLista() {
        return this.pessoas;
    }

    public Pessoa inserir(Pessoa pessoa) {
        pessoa.setCodigo(contador++);
        this.pessoas.add(pessoa);
        return pessoa;
    }

    public Pessoa alterar(Pessoa pessoa) {
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
        return pessoa;
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
