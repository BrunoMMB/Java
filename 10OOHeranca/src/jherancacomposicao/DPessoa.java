/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jherancacomposicao;

/**
 *
 * @author EDYA
 */
public class DPessoa {
    private String nome;
    private int idade;
    private double salario;
    private String cpf;
    
    public double getBOnificacao() {
        return this.salario * 0.10;
    }
    
    
    /*
    
http://www.dsc.ufcg.edu.br/~jacques/cursos/map/html/pat/herancavscomposicao.htm
    5 regras para o uso de herança (Coad)

O objeto "é um tipo especial de" e não "um papel assumido por"
O objeto nunca tem que mudar para outra classe
A subclasse estende a superclasse mas não faz override ou anulação de variáveis e/ou métodos
Não é uma subclasse de uma classe "utilitária"
Não é uma boa idéia fazer isso porque herdar de, digamos, HashMap deixa a classe vulnerável a mudanças futuras à classe HashMap
O objeto original não "é" uma HashMap (mas pode usá-la)
Não é uma boa idéia porque enfraquece a encapsulação
Clientes poderão supor que a classe é uma subclasse da classe utilitária e não funcionarão se a classe eventualmente mudar sua superclasse
Exemplo: x usa y que é subclasse de vector
x usa y sabendo que é um Vector
Amanhã, y acaba sendo mudada para ser subclasse de HashMap
x se lasca!
Para classes do domínio do problema, a subclasse expressa tipos especiais de papeis, transações ou dispositivos
Exemplo da aplicação das regras
Considere Agente, Tripulação e Passageiro como subclasses de Pessoa
Regra 1 (tipo especial): não passa. Um Passageiro não é um tipo especial de Pessoa: é um papel assumido por uma Pessoa
Regra 2 (mutação): não passa. Um Agente pode se transformar em Passageiro com tempo
Regra 3 (só estende): ok.
Regra 4: ok.
Regra 5: não passa. Passageiro está sendo modelado como tipo especial de Pessoa e não como tipo especial de papel
    */

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
