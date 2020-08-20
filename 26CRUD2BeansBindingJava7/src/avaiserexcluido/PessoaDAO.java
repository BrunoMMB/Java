/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaiserexcluido;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


/**
 *
 * @author EDYA
 */
public class PessoaDAO {

    private Connection connection = null;

    CidadeDAO cidadeDAO = new CidadeDAO();
    
    public PessoaDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public boolean salvar(Pessoa obj) {
        if (obj.getCodigo() == null) {
            return incluir(obj);
        } else {
            return alterar(obj);
        }
    }

    public List<Pessoa> getLista() {
        String sql = "select * from pessoa";
        List<Pessoa> pessoas = new ArrayList<>();
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Pessoa obj = new Pessoa();
                obj.setCodigo(rs.getLong("codigo"));
                obj.setNome(rs.getString("nome"));
                obj.setSalario(rs.getBigDecimal("salario"));
                obj.setNascimento(rs.getString("nascimento"));
                
                obj.setCidade(cidadeDAO.localizar(rs.getLong("codigo")));
                pessoas.add(obj);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro de SQL: " + e.getMessage());
        }
        return pessoas;
    }

    public boolean incluir(Pessoa obj) {
        String sql = "insert into pessoa (nome,salario,nascimento, cidade) values(?,?,?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setBigDecimal(2, obj.getSalario());
            
            
            stmt.setString(3, obj.getNascimento());
            System.out.println("SQL:" + sql);
            System.out.println(obj);
            System.out.println(obj.getCidade().getNome() +""+ obj.getCidade().getCodigo());
            stmt.setLong(4, obj.getCidade().getCodigo());
            if (stmt.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Pessoa incluida com sucesso");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Pessoa não incluida com sucesso");
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro de SQL: " + e.getMessage());
            return false;
        }
    }

    public boolean alterar(Pessoa obj) {
        String sql = "update pessoa set nome = ?, salario = ?, nascimento = ?, cidade = ? where codigo = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setBigDecimal(2, obj.getSalario());
            stmt.setString(3, obj.getNascimento());
            stmt.setLong(4, obj.getCidade().getCodigo());
            stmt.setLong(5, obj.getCodigo());
            if (stmt.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Pessoa atualizada com sucesso");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Pessoa não atualizada com sucesso");
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro de SQL: " + e.getMessage());
            return false;
        }
    }

    public boolean remover(Pessoa obj) {
        String sql = "delete from pessoa where codigo = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setLong(1, obj.getCodigo());
            if (stmt.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Pessoa excluida com sucesso");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Pessoa não excluida com sucesso");
                return false;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro de SQL: " + e.getMessage());
            return false;
        }
    }
}
