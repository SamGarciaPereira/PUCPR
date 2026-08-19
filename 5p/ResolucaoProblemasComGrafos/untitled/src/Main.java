public class Main {
    public static void main(String[] args) {

        GrafoMatriz g = new GrafoMatriz(6);

        g.setaInformacao(0, "Curitiba");
        g.setaInformacao(1, "Sao_Paulo");
        g.setaInformacao(2, "Rio_de_Janeiro");
        g.setaInformacao(3, "Florianopolis");
        g.setaInformacao(4, "Foz_do_Iguacu");
        g.setaInformacao(5, "Londrina");

        g.criaAdjacencia(0, 1, 6);
        g.criaAdjacencia(0, 3, 3);
        g.criaAdjacencia(1, 2, 4);
        g.criaAdjacencia(1, 4, 10);
        g.criaAdjacencia(2, 3, 7);
        g.criaAdjacencia(3, 4, 9);
        g.criaAdjacencia(4, 5, 6);
        g.criaAdjacencia(5, 0, 2);

        System.out.println("Matriz de adjacencia:");
        g.imprimeAdjacencias();

        g.removeAdjacencia(0, 3);
        System.out.println("\nMatriz depois de remover a aresta 0 -> 3:");
        g.imprimeAdjacencias();

        int[] adj = new int[g.numVertices];
        int qtd = g.adjacentes(1, adj);
        System.out.println("\nVertices adjacentes a v1 (" + g.getInformacao(1) + "): " + qtd);
        for (int k = 0; k < qtd; k++) {
            System.out.println("  v" + adj[k] + " (" + g.getInformacao(adj[k]) + ")");
        }

        System.out.println("\nFechamento transitivo (Warshall):");
        boolean[][] fechamento = g.fechamentoTransitivo();
        g.imprimeMatrizBooleana(fechamento);
    }
}
