'''Ex.1
def imprimeImpares():
    impares = []
    for i in range(100):
        if(i % 2 != 0):
            impares.append(i)
    print(impares)

imprimeImpares()'''

'''Ex. 2
def calculaSegs():
    h = 24
    m = h * 60
    s = m * 60

    print(f'A quantidade de segundos em um dia e: {s}')

calculaSegs()'''

'''Ex. 3

def consumo():
    gas = int(input('Entre com a quantidade de combustivel utilizada em litros: '))
    km = int(input('Entre com a distanca em kms: '))

    cons = km / gas

    print(f'O consumo do carro foi {cons} km/l')

consumo()'''

'''Ex. 4
def verificaVetor():
    v1 = []

    for i in range(5):
        nums1 = int(input(f'Entre com {i+1}o numero para adicionar ao primeiro vetor: '))
        v1.append(nums1)
    num = int(input('Entre com o numero desejado para realizar a consulta dentro do vetor: '))

    encontrado = False

    for elemento in v1:
        if elemento == num:
            encontrado = True
            break

    if encontrado:
        print(f'O numero {num} esta no vetor.')
    else:
        print(f'O numero {num} nao esta no vetor.')

verificaVetor()'''

'''Ex. 5

def defineParametro():
    global linhas, colunas
    
    linhas = int(input('Entre com a quantidade de linhas da matriz: '))
    colunas = int(input('Entre com a quantidade de colunas da matriz: '))
'''

import sys
print(sys.executable)


          