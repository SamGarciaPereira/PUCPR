public class Main {
    public static void main(String[] args) {
        ArvoreBuscaBinaria arvore = new ArvoreBuscaBinaria();

        System.out.println("==================================================");
        System.out.println("1. CONSTRUINDO A ÁRVORE");
        System.out.println("==================================================");
        // A raiz
        arvore.inserir(50);
        // Lado esquerdo
        arvore.inserir(30);
        arvore.inserir(20);
        arvore.inserir(40);
        // Lado direito
        arvore.inserir(70);
        arvore.inserir(60);
        arvore.inserir(80);

        System.out.println("\n==================================================");
        System.out.println("2. TESTANDO AS TRAVESSIAS (IMPRESSÕES)");
        System.out.println("==================================================");
        // A In-Ordem DEVE imprimir tudo em ordem crescente. É a prova real!
        arvore.inOrdem();   // Esperado: 20 30 40 50 60 70 80
        arvore.preOrdem();  // Esperado: 50 30 20 40 70 60 80
        arvore.posOrdem();  // Esperado: 20 40 30 60 80 70 50


        System.out.println("\n==================================================");
        System.out.println("3. TESTANDO REMOÇÕES NAS EXTREMIDADES");
        System.out.println("==================================================");

        System.out.println("-> Removendo o MENOR elemento da árvore...");
        arvore.removerMenor();
        arvore.inOrdem(); // O 20 deve ter sumido

        System.out.println("\n-> Removendo o MAIOR elemento da árvore...");
        arvore.removerMaior();
        arvore.inOrdem(); // O 80 deve ter sumido


        System.out.println("\n==================================================");
        System.out.println("4. TESTANDO REMOÇÃO DE ELEMENTO ESPECÍFICO");
        System.out.println("==================================================");

        // Vamos remover o 30. Ele tem 1 filho agora (pois o 20 foi removido, sobrou o 40).
        // Isso testa a lógica de "Nó com 1 filho".
        System.out.println("-> Removendo o nó [30] (Cenário: Tem 1 filho)...");
        arvore.removerElemento(30);
        arvore.inOrdem(); // O 30 sumiu, e o 40 subiu para o lugar dele.

        // O TESTE DEFINITIVO: Remover a raiz (que tem filhos dos dois lados).
        // A árvore deve achar o sucessor do 50 (que é o 60), substituir a raiz por 60 e apagar o 60 antigo.
        System.out.println("\n-> Removendo a RAIZ [50] (Cenário: Tem 2 filhos)...");
        arvore.removerElemento(50);

        System.out.println("\nEstado Final da Árvore:");
        arvore.inOrdem(); // O 50 sumiu!

        System.out.println("==================================================");
        System.out.println("TESTES CONCLUÍDOS COM SUCESSO!");
    }
}