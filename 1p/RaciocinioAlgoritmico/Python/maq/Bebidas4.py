# Tabela padrão com as bebidas disponíveis, seguidas de preço e estoque
bebidas = [
    ['Cola-cola', 3.75, 2],
    ['Pepsi', 3.67, 5],
    ['Monster', 9.96, 1],
    ['Café', 1.25, 100],
    ['Redbull', 13.99, 2]
]

def exibirBebidas(bebidas): # Função que exibe a tabela de bebidas disponíveis
    global preco
    print('-='*30)
    print(f'Confira nossos produtos:')
    print('-='*30)
    print(f'{"ID":<3} {"BEBIDA":<10} {"PREÇO":<6} {"ESTOQUE"}') # Espaço formatado para a tabela ficar bonita
    for i in range(len(bebidas)): # Percorre cada lista da tabela bebidas
        nome = bebidas[i][0] # Atribui o nome da bebida a variá
        vel nome
        preco = bebidas[i][1] # Atribui o valor da bebida a variável preco
        estoque = bebidas[i][2] # Atribui a quantidade disponível a variável estoque
        print(f'{i + 1:<3} {nome:<10} {preco:<6} {estoque}') # Imprime o ID (i + 1 para não trabalhar com 0), nome, preco e estoque formatados
    print('-='*30)

def selecionarBebida(bebidas): # Função para selecionar a bebida
    escolha = (input('Insira o ID da bebida escolhida: '))
    if escolha.isdigit(): # Verifica se escolha é um número
        i = int(escolha) - 1 # Subtrai 1 de i para ter o índice correto
        if 0 <= i < len(bebidas): # Verifica se i é igual ou maior que 0 e se é menor que a quantidade de listas na tabela
            return i # Retorna o índice da bebida selecionada
        else:
            print('Escolha inválida. Por favor, selecione um ID válido.') # Se i for menor que 0 ou maior que a quantidade de listas na tabela, o programa pede pra selecionar de novo
    else:
        print('Entrada inválida. Digite um número.') # Se a entrada do usuário não for um número, o programa pede para selecionar um número
    return None

def calcular_troco(preco, valorPago): # Função para calcular o troco
    notas_moedas = [10000, 5000, 2000, 1000, 500, 200, 100, 50, 25, 10, 5, 1] 
    troco = int(round((valorPago - preco) * 100)) 
    troco_notas_moedas = {}
    
    for nota_moeda in notas_moedas:
        quantidade = troco // nota_moeda
        if quantidade > 0:
            troco_notas_moedas[nota_moeda / 100] = quantidade
            troco -= quantidade * nota_moeda
    
    return troco_notas_moedas

def pagamento(preco): # Função que recebe o pagamento
    global valorPago
    valorPago = float(input('Entre com o valor a pagar: R$'))
    if valorPago >= preco: # Verifica se o valor pago é maior ou igual ao preço 
        troco = valorPago - preco # Atribui a variável troco o valor de valorPago - preco
        troco_detalhado = calcular_troco(preco, valorPago) # Atribui a variável troco_detalhado o retorno da função que calcula o troco
        return valorPago, troco, troco_detalhado 
    else:
        print('Valor insuficiente.') # Se o valor pago for menor que o preço, acusa valor insuficiente
        return valorPago, None, None 

def tirarEstoque(bebidas, i): # Função que retira 1 produto do estoque a cada compra
    bebidas[i][2] -= 1 # Acessa o estoque do produto com o número do produto escolhido, que na função main será a variável escolha

def login_admin(): # Função para acessar o modo administrador
    admin_user = "admin"
    admin_pass = "1234"
    usuario = input("Usuário: ") # Pede o usuário e a senha
    senha = input("Senha: ")
    if usuario == admin_user and senha == admin_pass: # Verifica se os dados inseridos estão corretos
        return True
    else:
        print("Login ou senha incorretos.") # Se estiverem incorretos, acusa erro
        return False

def admin_menu(bebidas): # Função que exibe o menu Administrador com a lógica das suas opções
    while True:
        print("\nMenu Administrador")
        print("1. Incluir produto")
        print("2. Excluir produto")
        print("3. Adicionar quantidade ao estoque")
        print("4. Remover quantidade do estoque")
        print("5. Sair do modo administrador")
        escolha = input("Escolha uma opção: ") # Administrador escolhe a opção desejada
        
        if escolha == '1': # Para adicionar um produto novo
            nome = input("Nome do produto: ") 
            preco = float(input("Preço do produto: "))
            estoque = int(input("Quantidade em estoque: "))
            bebidas.append([nome, preco, estoque]) # Adiciona a lista gerada a tabela bebidas
            print("Produto adicionado com sucesso.") # Confirma a adição e volta pro menu
        
        elif escolha == '2': # Para excluir um produto
            exibirBebidas(bebidas) # Exibe a tabela com os produtos
            id_produto = int(input("Insira o ID do produto a ser excluído: ")) - 1 # -1 para ter o índice certo
            if 0 <= id_produto < len(bebidas): # Verifica se o ID está entre 0 e len(bebidas)
                bebidas.remove(id_produto) # Remove a lista da tabela correspondente ao número do ID
                print("Produto excluído com sucesso.") # Confirma a exclusão e volta pro menu
            else:
                print("ID inválido.") # Se ID for menor que 0 ou maior que len(bebidas), acusa erro e volta pro menu
        
        elif escolha == '3': # Para adicionar estoque a um produto
            exibirBebidas(bebidas) # Exibe a tabela com os produtos
            id_produto = int(input("Insira o ID do produto: ")) - 1 # -1 para ter o índice certo
            if 0 <= id_produto < len(bebidas): # Verifica se o ID está entre 0 e len(bebidas)
                quantidade = int(input("Quantidade a ser adicionada: "))
                bebidas[id_produto][2] += quantidade # Soma ao estoque o valor da quantidade
                print("Quantidade adicionada com sucesso.") # Confirma a adição e volta pro menu
            else:
                print("ID inválido.") # Se ID for menor que 0 ou maior que len(bebidas), acusa erro e volta pro menu
        
        elif escolha == '4': # Para remover estoque de um produto
            exibirBebidas(bebidas) # Exibe a tabela com os produtos
            id_produto = int(input("Insira o ID do produto: ")) - 1 # -1 para ter o índice certo
            if 0 <= id_produto < len(bebidas): # Verifica se o ID está entre 0 e len(bebidas)
                quantidade = int(input("Quantidade a ser removida: "))
                if bebidas[id_produto][2] >= quantidade: # Verifica se a quantidade a ser removida é menor que o estoque atual
                    bebidas[id_produto][2] -= quantidade # Remove a quantidade do estoque
                    print("Quantidade removida com sucesso.") # Confirma a remoção e volta ao menu
                else:
                    print("Quantidade em estoque ficará negativa. Operação cancelada.") # Se a quantidade a ser removida for maior que o estoque, cancela e volta pro menu
            else:
                print("ID inválido.") # Se o ID for menor que 0 ou maior que len(bebidas), acusa erro e volta pro menu
        
        elif escolha == '5': #Para sair do modo administrador
            break
        else: #Excessão para escolha inválida
            print("Escolha inválida. Tente novamente.")

def main(): #Código principal
    global bebidas
    print('Bem vindo ao PUCPR Refresh, a melhor máquina de bebidas da PUC!')
    
    admin = input("Você é administrador? (s/n): ").lower() # Verificação perguntando se é adm
    
    if admin == 's':
        if login_admin():
            admin_menu(bebidas)
        else:
            print("Acesso negado. Encerrando o programa.")
            return
    
    while True: # Loop principal do programa
        exibirBebidas(bebidas)
        escolha = selecionarBebida(bebidas) #Extrai o ID da bebida 
        if escolha is None:
            continue

        nome, preco, estoque = bebidas[escolha]
        if estoque <= 0: # Se tiver sem estoque, printa o aviso e o item sem estoque
            print(f'Perdão, estamos sem estoque de {nome}.')
            continue
        print(f'Bebida escolhida: {nome} | Valor: R${preco}') # Se tiver com estoque, printa o nome do produto e preço
        print('-='*30)
        
        valorPago, troco, troco_detalhado = pagamento(preco)
        if troco is not None: # Se o valor que o usuário for pagar não for exato, o programa calcula
            print(f'Seu troco é R${troco:.2f}. Pegue-o no compartimento de troco.')
            print("Detalhamento do troco:")
            for nota_moeda, quantidade in troco_detalhado.items(): # Calcula o valor do troco e devolve o mínimo de cada nota ou moeda para o usuário
                if nota_moeda >= 1:
                    print(f"{quantidade} nota(s) de R$ {nota_moeda:.2f} reais")
                else:
                    print(f"{quantidade} moeda(s) de R$ {nota_moeda * 100:.0f} centavos")
            print('-='*30)
            print(f'Compra realizada. Retire {nome} no dispenser.')
            print('-='*30)
            tirarEstoque(bebidas, escolha) # Retira uma unidade da bebida escolhida
        else:
            print('-='*30)
            print('A compra não pode ser efetuada.')
            print('-='*30)
        
        continuar = input('Deseja continuar a usar a máquina? (s/n)').lower() # Pergunta se o usuário quer continuar rodando o código
        if continuar != 's':
            break

    print('-='*30)
    print('Obrigado por utilizar a PUCPR Refresh!') # Agradecimentos
    print('Desenvolvido por Samuel e Abílio, graduandos de Ciência da Computação 2024.2 da PUCPR.') # Créditos
    print('-='*30) 

main()
