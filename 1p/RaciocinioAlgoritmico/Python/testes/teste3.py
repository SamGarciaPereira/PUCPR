vendas = [["copo",2, 3.5, 5],
         ["computador", 22, 1200, 5],
         ["bola", 8, 45.3, 2],
         ["celular", 32, 100.00, 3],
         ["bola", 25, 45.3, 3],
         ["bola", 3, 45.3, 4]]

def produto_maisvendido_mes(vendas, mes):
    qtd = 0
    produto = ' '
    for i in range(len(vendas)):
        if vendas[i][3] == mes:
            if vendas[i][1] > qtd:
                qtd = vendas [i][1]
                produto = vendas[i][0]
    return produto

def produto_maiscaro_mes(vendas, mes):
    valor = 0
    produto = ' '
    for i in range(len(vendas)):
        if vendas[i][3] == mes:
            if vendas [i][2] > valor:
                valor = vendas[i][2]
                produto = vendas[i][0]
    return produto

def produto_maisvendido(vendas, qtd):
    qtd = 20
    produtos = []
    for i in range(len(vendas)):
        if vendas [i][1] > qtd:
            qtd = vendas[i][1]
            produtos.append(vendas[i][0])
    return produtos

def produto_maior_mes(mes, qtd):
    qtd = 0
    produto = ' '
    for i in range(len(vendas)):
        if vendas [i][i] > qtd:
            qtd = vendas[i][1]
            produto = vendas[i][0]
    return

def produto_maior_mes(vendas, mes):
    qtd = 0
    produto = ' '
    for i in range(len(vendas)):
        if vendas [i][3] == mes:
            if vendas [i][1] > qtd:
                qtd = vendas[i][1]
                produto = vendas[i][0]
    return produto
    


print(produto_maior_mes(vendas, 3))


