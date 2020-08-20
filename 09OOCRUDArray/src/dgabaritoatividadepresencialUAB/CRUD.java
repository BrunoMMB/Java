/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dgabaritoatividadepresencialUAB;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

/**
 *
 * @author EDYA
 */
public class CRUD {
    public CRUD() {
        
        FilmeDAO dao = new FilmeDAO();
        FilmeDAO dao2 = new FilmeDAO();
        
        
        
        int opcaoMenu;
        do {
        opcaoMenu = menu();
            switch (opcaoMenu) {
                case 1:
                    Filme f = criaFilme();
                    int retorno = dao2.inserir(f);
                    if (retorno == -1) {
                        System.out.println("Filme não foi inserido. Lista está cheia");
                    }
                    break;

                case 2:
                    dao.listar();

                case 3:
                    Filme filmeTemp= this.getDadosDoFilmeParaAlteracao();
                   int retornoAlterar = dao.alterar(filmeTemp);
                   if (retornoAlterar != -1) {
                       System.out.println("Filme alterado com sucesso");
                   } else {
                       System.out.println("Filme não alterado");
                   }
                    
                    break;
                    
                case 4:
                Filme filmeTempR= this.getDadosDoFilmeParaRemocao();
                   int retornoRemover = dao.excluir(filmeTempR);
                   if (retornoRemover != -1) {
                       System.out.println("Filme alterado com sucesso");
                   } else {
                       System.out.println("Filme não alterado");
                   }
                case 0:
                    break;
            }
        }while(opcaoMenu!= 3);
        System.out.println("Volta outra vez...");
 
    }
    public static void main(String[] args) {
        new CRUD();
    }
    
    Filme criaFilme() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o título do filme:");
        String titulo = scanner.nextLine();
        
        System.out.println("Digite o valor do filme:");
        double valor = Double.parseDouble(scanner.nextLine());
        Filme f = new Filme(titulo, valor);
        
        return f;
    
    }
    
    int menu() {
        System.out.println("\n\nSeja bem vindo ao meu programa CRUD");
        System.out.println("Escolha a opcão desejada");
        System.out.println("1 - Criar Filme");
        System.out.println("2 - Listar Filmes");
        System.out.println("3 - Alterar filme");
        System.out.println("4 - Remover filme");
        System.out.println("\n0 - Sair do programa");
        System.out.print("Qual Sua opção ? R: ");
        Scanner scanner = new Scanner(System.in);
        int  opcao = Integer.parseInt(scanner.nextLine());
        return opcao;
    }

    private Filme getDadosDoFilmeParaAlteracao() {
         Scanner scanner = new Scanner(System.in);
         
         System.out.println("Digite o id do filme alterado:");
        long id = Long.parseLong(scanner.nextLine());
        
        
         System.out.println("Digite o título novo do filme:");
        String titulo = scanner.nextLine();
        Filme f= new Filme(titulo, 0);
        f.setId(id);
        return f;
    }

    private dgabaritoatividadepresencialUAB.Filme getDadosDoFilmeParaRemocao() {
        Scanner scanner = new Scanner(System.in);
         
        System.out.println("Digite o id do filme alterado:");
        long id = Long.parseLong(scanner.nextLine());

        Filme f= new Filme(null, 0);
        f.setId(id);
        return f;
    }
}
