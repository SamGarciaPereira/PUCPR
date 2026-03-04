import java.util.ArrayList;
public class Pedido {
    Cliente cliente;
    private ArrayList<Prato> pratos;

    public Pedido(Cliente cliente){
        this.cliente = cliente;
        this.pratos = new ArrayList<>();
    }

    public void adicionarPrato(Prato prato){
        pratos.add(prato);
    }

    public void exibirPedido(){
        System.out.println("\n===== Detalhes do Pedido =====");
        cliente.exibirDados();
        System.out.println("Pratos escolhidos: ");
        double total = 0;
        for (Prato p : pratos) {
            p.exibirDetalhes();
            total += p.getPreco();
        }
        System.out.println("Total: R$ " + total);
    }
}
