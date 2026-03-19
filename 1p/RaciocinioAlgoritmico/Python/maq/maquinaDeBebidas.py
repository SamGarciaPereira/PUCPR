def vetorProdutos():#vetor com produtos
    
    global produtos

    produtos = [
        ["ID", "PRODUTO", "VALOR", "ESTOQUE"],
        [1, "Coca-cola", "R$ 3,75", 2],
        [2, "Pepsi", "R$ 3,67", 5],
        [3, "Monster", "R$ 9,96", 1],
        [4, "Café", "R$ 1,25", 100],
        [5, "Redbull", "R$ 13,99", 2]
    ]

def iniciaMaq(): #Inicia a máquina
    print("Bem vindo a máquina de bebidas da PUCPR! Confira nossos produtos:\n ")
    for produto in produtos:
        print(f"{produto[0]:<3} {produto[1]:<10} {produto[2]:<8} {produto[3]:<7}")
    

def logica():
    contadorCoca = 2
    contadorPepsi = 5
    contadorMonster = 1
    contadorCafe = 100
    contadorRedbull = 2
    valorCoca = 3.75
    global escolha
    global valor_produto
    escolha = int(input("\nEscolha seu produto (1 a 5): "))
    if escolha == 1:
        contadorCoca -= 1 
        print("Você escolheu Coca-cola.")
    elif escolha == 2:
        contadorPepsi -= 1
        print("Você escolheu Pepsi.")
    elif escolha == 3:
        contadorMonster -= 1
        print("Você escolheu Monster. ")
    elif escolha == 4:
        contadorCafe -= 1
        print("Você escolheu Café. ")
    elif escolha == 5:
        contadorRedbull -= 1
        print("Você escolheu RedBull. ")

def calculaTroco():
    global dinCliente
    global troco
    dinCliente = float(input("Entre com a quantidade de dinheiro que possui somando notas e moedas: "))

    
vetorProdutos()
iniciaMaq()
logica()