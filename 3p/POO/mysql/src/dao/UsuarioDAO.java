package dao;

import model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UsuarioDAO {

    private Connection con;
    private PreparedStatement ps;

    public UsuarioDAO(){
        this.con = ConexaoMySQL.getConexaoMySQL().getConnection();
    }

    public void cadastrarUsuario(Usuario u){
        String query = "INSERT INTO usuario(nome, senha) VALUES (?, ?)";
        try{
            ps = this.con.prepareStatement(query);
            ps.setString(1, u.getNome());
            ps.setString(2, u.getSenha());
            ps.execute();
        }
        catch(SQLException ex) {
            ex.printStackTrace();
        }
    }
    public ArrayList<Usuario> listarUsuarios(){
        String query = "SELECT * FROM usuario";

        ArrayList<Usuario> lista = new ArrayList<Usuario>();

        try{
            ps = this.con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String senha = rs.getString("senha");

                lista.add(new Usuario(id, nome, senha));
            }

        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        return lista;
    }
    public void deletarUsuario(Usuario u){
        String query = "DELETE FROM usuario WHERE id = ?";
        try{
            ps = this.con.prepareStatement(query);
            ps.setInt(1, u.getIdUsuario());
            ps.execute();
        }
        catch(SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void atualizarUsuario(Usuario u){
        String query = "UPDATE usuario SET nome = ?, senha = ? WHERE id = ?";
        try{
            ps = this.con.prepareStatement(query);
            ps.setString(1, u.getNome());
            ps.setString(2, u.getSenha());
            ps.setInt(3, u.getIdUsuario());
            ps.executeUpdate();
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
    }
}
