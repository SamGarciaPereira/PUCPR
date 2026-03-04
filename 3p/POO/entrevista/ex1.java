// --- A CLASSE PILHA (A ESTRUTURA) ---
class PilhaString {
    private String[] dados; // Array que vai guardar as palavras
    private int topo;       // Variável que diz onde está o último item colocado

    // Construtor: Prepara a pilha quando usamos 'new PilhaString()'
    public PilhaString(int capacidade) {
        dados = new String[capacidade]; // Cria o array do tamanho que precisamos
        topo = -1; // Começa em -1 porque a posição 0 do array já é válida (ainda não tem nada)
    }

    // Método PUSH (Empilhar): Coloca item no topo
    public void push(String valor) {
        // Verifica se não estourou o tamanho do array
        if (topo < dados.length - 1) { 
            dados[++topo] = valor; // 1º Aumenta o topo (-1 vira 0), 2º Guarda o valor na posição 0
        }
    }

    // Método POP (Desempilhar): Tira o item do topo
    public String pop() {
        if (!isEmpty()) { // Se não estiver vazia
            return dados[topo--]; // 1º Retorna o valor atual, 2º Diminui o topo (volta pra baixo)
        }
        return null; // Se estiver vazia, não retorna nada
    }

    // Método auxiliar para saber se acabou
    public boolean isEmpty() {
        return topo == -1; // Se o topo voltou para -1, a pilha está vazia
    }
}

// --- O ALGORITMO (MAIN) ---
public class InverterFrase {
    public static void main(String[] args) {
        String entrada = "bob likes dogs";
        
        // .split(" ") é CRUCIAL: Quebra a frase onde tem espaço.
        // Vira um array: ["bob", "likes", "dogs"]
        String[] palavras = entrada.split(" "); 
        
        // Cria a pilha com tamanho 3 (quantidade de palavras)
        PilhaString pilha = new PilhaString(palavras.length);
        
        // Loop 1: ENCHER A PILHA
        for (String p : palavras) {
            pilha.push(p); 
            // 1. Entra "bob"
            // 2. Entra "likes"
            // 3. Entra "dogs" (Fica no topo)
        }
        
        // Loop 2: ESVAZIAR A PILHA
        System.out.print("Resultado: ");
        while (!pilha.isEmpty()) { // Enquanto tiver coisa na pilha...
            System.out.print(pilha.pop() + " "); 
            // 1. Tira "dogs" (estava no topo)
            // 2. Tira "likes"
            // 3. Tira "bob"
        }
    }
}