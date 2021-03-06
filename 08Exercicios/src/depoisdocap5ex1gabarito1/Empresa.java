/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depoisdocap5ex1gabarito1;

/**
 *
 * @author EDUARDO A SILVESTRE
 */
public class Empresa {

    String nomeFantasia;
    String ramo;
    String cnpj;
    Funcionario[] funcionarios = null;

    boolean adiciona(Funcionario f) {

        for (int i = 0; i < funcionarios.length; i++) {
            Funcionario funcionario = funcionarios[i];
            if (funcionario == null) {
                funcionarios[i] = f;
                return true;
            }
        }
        return false;
        // algo tipo:
        // this.empregados[ ??? ] = f;
        // mas que posição colocar?
    }

    void mostraFuncionarios() {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario != null) {
                System.out.println(funcionario);
            }
        }
    }

    boolean remove(String nome) {
        for (int i = 0; i < funcionarios.length; i++) {
            Funcionario funcionario = funcionarios[i];
            if (funcionario != null) {
                if (funcionario.nome.equals(nome)) {
                    funcionarios[i] = null;
                    return true;
                }
            }

        }
        return false;
    }

    boolean contem(String nome) {
        for (int i = 0; i < funcionarios.length; i++) {
            if (funcionarios[i] != null && funcionarios[i].nome.equals(nome)) {
                return true;
            }
        }
        return false;
    }

    boolean altera(String nomeAtual, String novoNome) {
        for (int i = 0; i < funcionarios.length; i++) {
            if (funcionarios[i] != null && funcionarios[i].nome.equals(nomeAtual)) {
                funcionarios[i].nome = novoNome;
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String meu = "A empresa é a " + nomeFantasia;
        meu += "\nO ramo é " + ramo;
        meu += "\nO CNPJ da empresa é " + cnpj;
        meu += "\nOs funcionários da empresa são:";
        for (Funcionario funcionario : funcionarios) {
            if (funcionario != null) {
                meu += "\n" + funcionario.toString();
            }
        }

        return meu;
    }

}
