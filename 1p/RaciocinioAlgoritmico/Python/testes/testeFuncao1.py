def soma_vetor(vetor):
    soma = 0
    for i in range(len(vetor)):
        soma += vetor[i]
    return soma 

def media_vetor(vetor):
    return soma_vetor(vetor) / len(vetor)

print(soma_vetor([2, 5]))
print(media_vetor([2, 5]))

