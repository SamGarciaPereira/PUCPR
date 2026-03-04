bebidas = [
    ['Cola-cola', 3.75, 2],
    ['Pepsi', 3.67, 5],
    ['Monster', 9.96, 1],
    ['Café', 1.25, 100],
    ['Redbull', 13.99, 2]
]

def exibirBebidas(bebidas):
    global preco
    print('-='*30)
    print(f'Confira nossos produtos:')
    print('-='*30)
    print(f'{"ID":<3} {"BEBIDA":<10} {"PREÇO":<6} {"ESTOQUE"}')
    for i in range(len(bebidas)):
        nome = bebidas[i][0]
        preco = bebidas[i][1]
        estoque = bebidas[i][2]
        print(f'{i + 1:<3} {nome:<10} {preco:<6} {estoque}')
    print('-='*30)

def selecionarBebida(bebidas):
    escolha = (input('Insira o ID da bebida escolhida: '))
    if escolha.isdigit():
        i = int(escolha) - 1
        if 0 <= i < len(bebidas):
            return i
        else:
            print('Escolha inválida. Por favor, selecione um ID válido.')
    else:
        print('Entrada inválida. Digite um número.')
    return None

def calcular_troco(preco, valorPago):
    notas_moedas = [100, 50, 20, 10, 5, 2, 1, 0.50, 0.25, 0.10, 0.05, 0.01]
    troco = valorPago - preco
    troco_notas_moedas = {}
    
    for nota_moeda in notas_moedas:
        quantidade = int(troco // nota_moeda)
        if quantidade > 0:
            troco_notas_moedas[nota_moeda] = quantidade
            troco -= quantidade * nota_moeda
    
    return troco_notas_moedas

def pagamento(preco):
    global valorPago
    valorPago = float(input('Entre com o valor a pagar: R$'))
    if valorPago >= preco:
        troco = valorPago - preco
        troco_detalhado = calcular_troco(preco, valorPago)
        return valorPago, troco, troco_detalhado
    else:
        print('Valor insuficiente.')
        return valorPago, None, None

def tirarEstoque(bebidas, i):
    bebidas[i][2] -= 1

def login_admin():
    admin_user = "admin"
    admin_pass = "1234"
    usuario = input("Usuário: ")
    senha = input("Senha: ")
    if usuario == admin_user and senha == admin_pass:
        return True
    else:
        print("Login ou senha incorretos.")
        return False

def admin_menu(bebidas):
    while True:
        print("\nMenu Administrador")
        print("1. Incluir produto")
        print("2. Excluir produto")
        print("3. Adicionar quantidade ao estoque")
        print("4. Remover quantidade do estoque")
        print("5. Sair do modo administrador")
        escolha = input("Escolha uma opção: ")
        
        if escolha == '1':
            nome = input("Nome do produto: ")
            preco = float(input("Preço do produto: "))
            estoque = int(input("Quantidade em estoque: "))
            bebidas.append([nome, preco, estoque])
            print("Produto adicionado com sucesso.")
        
        elif escolha == '2':
            exibirBebidas(bebidas)
            id_produto = int(input("Insira o ID do produto a ser excluído: ")) - 1
            if 0 <= id_produto < len(bebidas):
                bebidas.pop(id_produto)
                print("Produto excluído com sucesso.")
            else:
                print("ID inválido.")
        
        elif escolha == '3':
            exibirBebidas(bebidas)
            id_produto = int(input("Insira o ID do produto: ")) - 1
            if 0 <= id_produto < len(bebidas):
                quantidade = int(input("Quantidade a ser adicionada: "))
                bebidas[id_produto][2] += quantidade
                print("Quantidade adicionada com sucesso.")
            else:
                print("ID inválido.")
        
        elif escolha == '4':
            exibirBebidas(bebidas)
            id_produto = int(input("Insira o ID do produto: ")) - 1
            if 0 <= id_produto < len(bebidas):
                quantidade = int(input("Quantidade a ser removida: "))
                if bebidas[id_produto][2] >= quantidade:
                    bebidas[id_produto][2] -= quantidade
                    print("Quantidade removida com sucesso.")
                else:
                    print("Quantidade em estoque insuficiente.")
            else:
                print("ID inválido.")
        
        elif escolha == '5':
            break
        else:
            print("Escolha inválida. Tente novamente.")

def main():
    global bebidas
    print('Bem vindo ao PUCPR Refresh, a melhor máquina de bebidas da PUC!')
    
    admin = input("Você é administrador? (s/n): ").lower()
    
    if admin == 's':
        if login_admin():
            admin_menu(bebidas)
        else:
            print("Acesso negado. Encerrando o programa.")
            return
    
    while True:
        exibirBebidas(bebidas)
        escolha = selecionarBebida(bebidas)
        if escolha is None:
            continue

        nome, preco, estoque = bebidas[escolha]
        if estoque <= 0:
            print(f'Perdão, estamos sem estoque de {nome}.')
            continue
        print(f'Bebida escolhida: {nome} | Valor: R${preco}')
        print('-='*30)
        
        valorPago, troco, troco_detalhado = pagamento(preco)
        if troco is not None:
            print(f'Seu troco é R${troco:.2f}. Pegue-o no compartimento de troco.')
            print("Detalhamento do troco:")
            for nota_moeda, quantidade in troco_detalhado.items():
                if nota_moeda >= 1:
                    print(f"{quantidade} nota(s) de R$ {nota_moeda:.2f} reais")
                else:
                    print(f"{quantidade} moeda(s) de R$ {nota_moeda * 100:.0f} centavos")
            print('-='*30)
            print(f'Compra realizada. Retire {nome} no dispenser.')
            print('-='*30)
            tirarEstoque(bebidas, escolha)
        else:
            print('-='*30)
            print('A compra não pode ser efetuada.')
            print('-='*30)
        
        continuar = input('Deseja continuar a usar a máquina? (s/n)').lower()
        if continuar != 's':
            break

    print('-='*30)
    print('Obrigado por utilizar a PUCPR Refresh!')
    print('Desenvolvido por Samuel e Abílio, graduandos de Ciência da Computação 2024.2 da PUCPR.')
    print('-='*30) 

main()
