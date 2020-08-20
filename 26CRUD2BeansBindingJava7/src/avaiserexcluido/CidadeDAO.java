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
public class CidadeDAO {

    private Connection connection = null;

    public CidadeDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public boolean salvar(Cidade obj) {
        if (obj.getCodigo() == null) {
            return incluir(obj);
        } else {
            return alterar(obj);
        }
    }

    public List<Cidade> getLista() {
        String sql = "select * from cidade";
        List<Cidade> cidades = new ArrayList<>();
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Cidade obj = new Cidade();
                obj.setCodigo(rs.getLong("codigo"));
                obj.setNome(rs.getString("nome"));
                obj.setUf(rs.getString("uf"));
                cidades.add(obj);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro de SQL: " + e.getMessage());
        }
        return cidades;
    }

    public boolean incluir(Cidade obj) {
        String sql = "insert into cidade (nome,uf) values(?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getUf());
            if (stmt.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Cidade incluida com sucesso");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Cidade não incluida com sucesso");
                return false;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro de SQL: " + e.getMessage());
            return false;
        }
    }

    public boolean alterar(Cidade obj) {
        String sql = "update cidade set nome = ?, uf = ? where codigo = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getUf());
            stmt.setLong(3, obj.getCodigo());
            if (stmt.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Cidade alterada com sucesso");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Cidade não alterada com sucesso");
                return false;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro de SQL: " + e.getMessage());
            return false;
        }
    }

    public boolean remover(Cidade obj) {
        String sql = "delete from cidade where codigo = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setLong(1, obj.getCodigo());
            if (stmt.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Cidade excluida com sucesso");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Cidade não excluida com sucesso");
                return false;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro de SQL: " + e.getMessage());
            return false;
        }
    }

    public Cidade localizar(Long codigo) {
        String sql = "select * from cidade where codigo = ?";
        Cidade obj = new Cidade();
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setLong(1, codigo);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                obj.setCodigo(rs.getLong("codigo"));
                obj.setNome(rs.getString("nome"));
                obj.setUf(rs.getString("uf"));
                return obj;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL: " + e.getMessage());
        }
        return null;
    }
}
