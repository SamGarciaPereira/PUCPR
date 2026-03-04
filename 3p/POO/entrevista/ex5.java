public void inverterInteiro(int numero) { // Recebe ex: 123
    int invertido = 0; // Começa zerado
    int resto;

    System.out.println("Entrada: " + numero);

    while (numero > 0) { // Enquanto ainda tiver dígitos para processar
        
        // 1. PEGAR O ÚLTIMO DÍGITO
        resto = numero % 10; // 123 dividido por 10 dá 12 e SOBRA 3. Resto = 3.
        
        // 2. CONSTRUIR O INVERTIDO
        // Multiplica o atual por 10 (pra abrir espaço na casa da unidade) e soma o resto
        invertido = (invertido * 10) + resto; 
        // 1ª passada: (0 * 10) + 3 = 3
        // 2ª passada: (3 * 10) + 2 = 32
        // 3ª passada: (32 * 10) + 1 = 321
        
        // 3. REDUZIR O NÚMERO ORIGINAL
        numero = numero / 10; // Divisão inteira. 123 / 10 = 12 (o 3 some).
    }

    System.out.println("Saída: " + invertido);
}