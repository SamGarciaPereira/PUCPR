package interfaces;

import model.Produto;

import java.util.ArrayList;

public interface ProdutoDAOInterface {
    void cadastrarProduto(Produto b);
    ArrayList<Produto> listarProduto();
    Produto buscarPorId(int id);
    void deletarProduto(int id);
}
