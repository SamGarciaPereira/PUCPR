import java.util.ArrayList;
import java.util.List;

public List<Integer> obterDistintos(int[] entrada) {
    // Cria uma lista dinâmica (ArrayList) porque não sabemos o tamanho final
    List<Integer> resultado = new ArrayList<>();

    // Percorre cada número do array original (ex: 1, 3, 5, 3...)
    for (int numero : entrada) {
        
        boolean existe = false; // Flag (bandeira). Assumimos que não existe ainda.

        // Loop de Verificação: Olha dentro da lista 'resultado' que estamos criando
        for (int r : resultado) {
            if (r == numero) { // Se achar o número lá dentro...
                existe = true; // Levanta a bandeira: "Já existe!"
                break;         // Para de procurar, não precisa ver o resto
            }
        }
        
        // Só adiciona se a bandeira continuou 'false'
        if (!existe) {
            resultado.add(numero);
        }
    }
    return resultado;
}