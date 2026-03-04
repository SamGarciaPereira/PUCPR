package dao;

import model.Postagem;
import java.time.LocalDateTime;
import java.sql.Timestamp;
import model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PostagemDAO {

    private Connection con;
    private PreparedStatement ps;

    public PostagemDAO(){
        this.con = ConexaoMySQL.getConexaoMySQL().getConnection();
    }

    public void criarPostagem(Postagem p){
        String query = "INSERT INTO postagem(id_usuario, texto, data_postagem) VALUES (?, ?, ?)";
       try{
            ps = this.con.prepareStatement(query);
            ps.setInt(1, p.getU().getIdUsuario());
            ps.setString(2, p.getTexto());
            ps.setTimestamp(3, Timestamp.valueOf(p.getDataPostagem()));
            ps.execute();

       }
       catch(SQLException ex){
           ex.printStackTrace();
       }
    }
    public ArrayList<Postagem> listarPostagens(int idUsuario){
        String query = "SELECT * FROM postagem WHERE id_usuario = ? ORDER BY data_postagem DESC";

        ArrayList<Postagem> lista = new ArrayList<Postagem>();

        try{
            ps = this.con.prepareStatement(query);
            ps.setInt(1, idUsuario);
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                int idPostagem = rs.getInt("id_postagem");
                String texto = rs.getString("texto");
                Timestamp timestamp = rs.getTimestamp("data_postagem");

                LocalDateTime dataPostagem = timestamp != null ? timestamp.toLocalDateTime() : null;
                Usuario u = new Usuario(idUsuario);
                lista.add(new Postagem(idPostagem, texto, dataPostagem, u));
            }

        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        return lista;
    }
    public boolean deletarPostagem(int idUsuario, int idPostagem) {
        String query = "DELETE FROM postagem WHERE id_postagem = ? AND id_usuario = ?";
        try {
            ps = this.con.prepareStatement(query);
            ps.setInt(1, idPostagem);
            ps.setInt(2, idUsuario);

            int linhasAfetadas = ps.executeUpdate();

            return linhasAfetadas > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

}

