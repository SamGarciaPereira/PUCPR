import random

def cripto(mensagem, chave):
    cripto = ""
    for c in mensagem:
        codigo = ord(c) + chave
        # Mantém no intervalo de caracteres imprimíveis
        while codigo < 32:
            codigo += 95
        while codigo > 126:
            codigo -= 95
        cripto += chr(codigo)
    return cripto

def forca_bruta(cipher, max_chave):
   for k in range(max_chave):
       print(cripto(cipher, -k))

plain = 'Nada de novo no front'

chave = random.randint(1,10)
print(chave)
cipher = cripto(plain, chave)
print(cipher)


# 1) Decodifique a mensagem Sfif%ij%st{t%st%kwtsy

cipher = 'Sfif%ij%st{t%st%kwtsy'
forca_bruta(cipher, 50)

# 2) Qual o espaço de chaves do algoritmo? Qual o tamanho da chave?
# 3) Este algoritmo mantem padrão, como isso simplifica a quebra da criptografia?
# 4) É possível decifrar a mensagem sem testar todas as chaves?

def analise_frequencia(cipher):
    codigo = [ ord(c) for c in cipher ]
    freq = {}

    for c in codigo:
        if c not in freq:
            freq[c] = 1
        else:
            freq[c] = freq[c] + 1
            
    return sorted(freq.items(), key=lambda item: item[1])