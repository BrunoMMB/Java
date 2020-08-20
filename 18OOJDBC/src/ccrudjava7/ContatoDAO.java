package ccrudjava7;

import ainicio.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContatoDAO implements CRUD<Contato> {

    public ContatoDAO() {}
    
/** ANTES DO JAVA7
 Connection conn = null;
 PreparedStatement ps = null;
 ResultSet rs = null;
  try {
  } catch (SQLException ex) {
  } finally {
  try { rs.close(); } catch (Exception e) {  }
  try { ps.close(); } catch (Exception e) {  }
  try { conn.close(); } catch (Exception e) {  }
  }
 */
    
/** APÓS JAVA7
try(Connection con = getConnection(url, username, password, "org.postgresql.Driver");
    PreparedStatement stmt = con.createStatement();
    ResultSet rs = stmt.executeQuery(sql);
) {

//statements
}catch(....){}
*/
    
    @Override
    public Contato adiciona(Contato elemento) {
        String sql = "insert into contatosjava7 "
                + "(nome,email,endereco,dataNascimento)" + " values (?,?,?,?)";

        try(Connection connection = new ainicio.ConnectionFactory().getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql)){
        
            // seta os valores
            stmt.setString(1, elemento.getNome());
            stmt.setString(2, elemento.getEmail());
            stmt.setString(3, elemento.getEndereco());
            stmt.setString(4, elemento.getDataNascimento());
            stmt.execute();
            
            System.out.println("Elemento inserido com sucesso.");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        //na verdade deveria retornar o elemento que foi inserido agora
        return elemento;
    }
    
    @Override
    public List<Contato> lista(Contato elemento) {
        String sql = "select * from contatosjava7";
        
        List<Contato> contatos = new ArrayList<>();
        
        try(Connection connection = new ConnectionFactory().getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery(sql)) {
            
            // itera no ResultSet
            while (rs.next()) {
                Long id = rs.getLong("id");
                String nome = rs.getString("nome");
                String email = rs.getString("email");
                String endereco = rs.getString("endereco");  
                String currentDate = rs.getString("dataNascimento");

                Contato contato = new Contato();
                contato.setId(id);
                contato.setNome(nome);
                contato.setEmail(email);
                contato.setEndereco(endereco);
                contato.setDataNascimento(currentDate);
                contatos.add(contato);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return contatos;
    }

    @Override
    public Contato altera(Contato elemento) {
        String sql = "update contatosjava7 set endereco = ? where id = ?";    
        
        try(Connection connection = new ConnectionFactory().getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql)) {
        
            stmt.setString(1, elemento.getEndereco());
            stmt.setLong(2, elemento.getId());
            stmt.execute();
            System.out.println("Elemento alterado com sucesso.");
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return elemento;
    }

    @Override
    public Contato exclui(Contato elemento) {
        String sql = "delete from contatosjava7 where id = ?";
        
        try(Connection connection = new ConnectionFactory().getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql)) {
            
            stmt.setLong(1, elemento.getId());
            stmt.execute();
            System.out.println("Elemento excluído com sucesso.");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return elemento;
    }
}
