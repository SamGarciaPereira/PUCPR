'''
m = []

linhas = int(input('Insira a quantidade de linhas: '))
cols = int(input('Insira a quantidade de colunas: '))

for i in range(linhas):
    for j in range(cols):
        elemento = int(input(f'Insira o elemento na posição {i} {j}: '))
        linha.append(elemento)
    m.append(linha)
return m

print('A matriz resultante é: ')
for linha in matriz_resultante:
    print(linha)'''

# Função para criar a matriz a partir da entrada do usuário
def criar_matriz():
    # Solicitar o número de linhas e colunas
    linhas = int(input("Digite o número de linhas: "))
    colunas = int(input("Digite o número de colunas: "))

    # Inicializar a matriz vazia
    matriz = []

    # Loop para preencher a matriz
    for i in range(linhas):
        linha = []
        for j in range(colunas):
            elemento = input(f"Digite o elemento na posição ({i}, {j}): ")
            linha.append(elemento)  # Adiciona o elemento à linha
        matriz.append(linha)  # Adiciona a linha à matriz

    return matriz

# Chamar a função e imprimir a matriz resultante
matriz_resultante = criar_matriz()
print("A matriz resultante é:")
for linha in matriz_resultante:
    print(linha)
