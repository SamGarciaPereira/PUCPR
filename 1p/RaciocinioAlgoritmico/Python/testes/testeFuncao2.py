'''v1 = []
i1 = []

def retornaVetor():
    for i in range(5):
        nVetor = int(input(f'Entre com o {i+1}o numero para inserir no vetor: '))
        v1.append(nVetor)
    
    for i in range(2):
        nIntervalo = int(input(f'Entre com o {i+1}o numero do intervalo desejado: '))
        i1.append(nIntervalo)

    print("Vetor:", v1)
    print("Intervalo:", i1)

    verificarIntervalo(v1, i1)

def verificarIntervalo(v1, i1):
    if len(i1) < 2:
        print("Intervalo inválido. Necessário dois valores.")
        return

    min_intervalo = min(i1)
    max_intervalo = max(i1)

    numeros_no_intervalo = [num for num in v1 if min_intervalo <= num <= max_intervalo]

    print("Números no intervalo:", numeros_no_intervalo)

retornaVetor()'''

    



    
