package dao;

import interfaces.ProdutoDAOInterface;
import model.Produto;

import java.sql.Connection;
import java.util.ArrayList;

public class ProdutoDAOMySQL implements ProdutoDAOInterface {

    private Connection conexao;

    public ProdutoDAOMySQL(){
        conexao = ConexaoMySQL.getConexaoMySQL().getConnection();
    }

    @Override
    public void cadastrarProduto(Produto b) {

    }

    @Override
    public ArrayList<Produto> listarProduto() {
        return null;
    }

    @Override
    public Produto buscarPorId(int id) {
        return null;
    }

    @Override
    public void deletarProduto(int id) {

    }
}
