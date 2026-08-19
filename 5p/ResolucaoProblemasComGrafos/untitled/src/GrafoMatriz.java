public class GrafoMatriz {

    int numVertices;
    int[][] matriz;
    String[] informacoes;

    public GrafoMatriz(int numVertices) {
        this.numVertices = numVertices;
        matriz = new int[numVertices][numVertices];
        informacoes = new String[numVertices];

        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                matriz[i][j] = -1;
            }
            informacoes[i] = "";
        }
    }

    // cria a aresta i -> j com custo P
    public void criaAdjacencia(int i, int j, int p) {
        matriz[i][j] = p;
    }

    // remove a aresta i -> j
    public void removeAdjacencia(int i, int j) {
        matriz[i][j] = -1;
    }

    // imprime a matriz de adjacencias
    public void imprimeAdjacencias() {
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // atualiza a informacao (rotulo) do vertice i
    public void setaInformacao(int i, String v) {
        informacoes[i] = v;
    }

    public String getInformacao(int i) {
        return informacoes[i];
    }

    // conta e guarda em adj os vertices adjacentes a i; retorna a quantidade
    public int adjacentes(int i, int[] adj) {
        int total = 0;
        for (int j = 0; j < numVertices; j++) {
            if (matriz[i][j] != -1) {
                adj[total] = j;
                total++;
            }
        }
        return total;
    }

    // fechamento transitivo: algoritmo de Warshall
    public boolean[][] fechamentoTransitivo() {
        boolean[][] r = new boolean[numVertices][numVertices];

        // r comeca igual a matriz de adjacencia, so que em true/false
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                r[i][j] = matriz[i][j] != -1;
            }
        }

        // se da pra ir de i ate k, e de k ate j, entao da pra ir de i ate j
        for (int k = 0; k < numVertices; k++) {
            for (int i = 0; i < numVertices; i++) {
                for (int j = 0; j < numVertices; j++) {
                    if (r[i][k] && r[k][j]) {
                        r[i][j] = true;
                    }
                }
            }
        }

        return r;
    }

    public void imprimeMatrizBooleana(boolean[][] m) {
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print((m[i][j] ? 1 : 0) + "\t");
            }
            System.out.println();
        }
    }
}
