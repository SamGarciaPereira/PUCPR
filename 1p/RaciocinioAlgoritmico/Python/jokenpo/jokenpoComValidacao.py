import random # Importa a biblioteca random para fazer o sorteio das escolhas do PC

while True: #Escolhe o modo de jogo e valida a escolha (1, 2 ou 3)
    modo_jogo = int(input('Bem vindo ao jokenpo! Escolha seu modo de jogo: 1 - Jogador x Jogador | 2 - Jogador x PC | 3 - PC x PC: '))
    while modo_jogo not in [1, 2, 3]:
        print('Opção inválida. Entre com um número de 1 a 3.')
        modo_jogo = int(input('Escolha seu modo de jogo: 1 - Jogador x Jogador | 2 - Jogador x PC | 3 - PC x PC: '))

    if modo_jogo == 1: # Modo de jogo 1 é escolhido
        pontos_p1_m1 = 0
        pontos_p2 = 0
        nome_player1 = input('Insira o nome do player 1: ') # Player 1 escolhe seu nome
        nome_player2 = input('Insira o nome do player 2: ') # Player 2 escolhe seu nome
        while True:
            # Valida os operadores dos jogadores
            operador1 = int(input(f"{nome_player1}, insira seu operador (1-Pedra|2-Papel|3-Tesoura): "))
            operador2 = int(input(f"{nome_player2}, insira seu operador (1-Pedra|2-Papel|3-Tesoura): "))
            
            if(operador1 == 1 and operador2 == 2):
                print(f'{nome_player2} WINS!!! {nome_player2} jogou papel e {nome_player1} jogou pedra')
                pontos_p2 += 1
                print('\nPLACAR GERAL:')
                print(f'{nome_player1}: {pontos_p1_m1}')
                print(f'{nome_player2}: {pontos_p2}')
            elif(operador1 ==  operador2):
                print(f'DRAW!!! ({nome_player1} e {nome_player2} escolheram o mesmo operador!)')
                print('\nPLACAR GERAL:')
                print(f'{nome_player1}: {pontos_p1_m1}')
                print(f'{nome_player2}: {pontos_p2}')
            elif(operador1 == 1 and operador2 == 3):
                print(f'{nome_player1} WINS!!! ({nome_player2} escolheu tesoura e {nome_player1} escolheu pedra)')
                pontos_p1_m1 += 1
                print('\nPLACAR GERAL:')
                print(f'{nome_player1}: {pontos_p1_m1}')
                print(f'{nome_player2}: {pontos_p2}')
            elif(operador1 == 2 and operador2 == 1):
                print(f'{nome_player1} WINS!!! ({nome_player2} escoheu pedra e {nome_player1} ecolheu papel)')
                pontos_p1_m1 += 1
                print('\nPLACAR GERAL:')
                print(f'{nome_player1}: {pontos_p1_m1}')
                print(f'{nome_player2}: {pontos_p2}')
            elif(operador1 == 2 and operador2 == 3):
                print(f'{nome_player2} WINS!!! ({nome_player1} escolheu papel e {nome_player2} tesoura)')
                pontos_p2 += 1
                print('\nPLACAR GERAL:')
                print(f'{nome_player1}: {pontos_p1_m1}')
                print(f'{nome_player2}: {pontos_p2}')
            elif(operador1 == 3 and operador2 == 1):
                print(f'{nome_player2} WINS!!! ({nome_player1} escolheu tesoura e {nome_player2} ecolheu pedra)')
                pontos_p2 += 1
                print('\nPLACAR GERAL:')
                print(f'{nome_player1}: {pontos_p1_m1}')
                print(f'{nome_player2}: {pontos_p2}')
            elif(operador1 == 3 and operador2 == 2):
                print(f'{nome_player1} WINS!!! ({nome_player2} escolheu papel e {nome_player1} escolheu tesoura)')
                pontos_p1_m1 += 1
                print('\nPLACAR GERAL:')
                print(f'{nome_player1}: {pontos_p1_m1}')
                print(f'{nome_player2}: {pontos_p2}')
            else:
                print('Opção inválida, selecione um número de 1 a 3 e tente novamente.')
                # Pergunta se o jogador deseja jogar novamente. Se não, a partida finaliza com uma mensagem de agradecimento.

            jogar_dnv = input('Deseja jogar novamente? (S / N): ').lower()

            if jogar_dnv != 's':
                print('\nPLACAR GERAL:')
                print(f'{nome_player1}: {pontos_p1_m1}')
                print(f'{nome_player2}: {pontos_p2}')
                print('\nObrigado por jogar! Feito por Samuel e Abílio, do curso de Ciência da Computação 2/2024 da PUCPR.')
                break   

    elif modo_jogo == 2: # Modo de jogo 2 é escolhido
        pontos_p1_m2 = 0
        pontos_pc = 0
        nome_player1 = input('Insira o nome do player 1: ') # Player 1 escolhe seu nome
        while True:  # Valida a operação do jogador
            operador1 = int(input(f'{nome_player1}, insira seu operador (1-Pedra|2-Papel|3-Tesoura): '))
            operadorPC1 = random.choice([1, 2, 3]) # Random sorteando o operador para o PC
            # Lógica do modo de jogo 2 (Player vs PC) / Soma de pontos
            if(operador1 == 1 and operadorPC1 == 2):
                print(f'PC WINS!!! PC jogou papel e {nome_player1} jogou pedra')
                pontos_pc += 1
                print('\nPLACAR GERAL:')
                print(f'{nome_player1}: {pontos_p1_m2}')
                print(f'PC: {pontos_pc}')
            elif(operador1 ==  operadorPC1):
                print(f'DRAW!!! ({nome_player1} e PC escolheram o mesmo operador!)')
                print('\nPLACAR GERAL:')
                print(f'{nome_player1}: {pontos_p1_m2}')
                print(f'PC: {pontos_pc}')
            elif(operador1 == 1 and operadorPC1 == 3):
                print(f'{nome_player1} WINS!!! (PC escolheu tesoura e {nome_player1} escolheu pedra)')
                pontos_p1_m2 += 1
                print('\nPLACAR GERAL:')
                print(f'{nome_player1}: {pontos_p1_m2}')
                print(f'PC: {pontos_pc}')
            elif(operador1 == 2 and operadorPC1 == 1):
                print(f'{nome_player1} WINS!!! (PC escoheu pedra e {nome_player1} ecolheu papel)')
                pontos_p1_m2 += 1
                print('\nPLACAR GERAL:')
                print(f'{nome_player1}: {pontos_p1_m2}')
                print(f'PC: {pontos_pc}')
            elif(operador1 == 2 and operadorPC1 == 3):
                print(f'PC WINS!!! ({nome_player1} escolheu papel e PC tesoura)')
                pontos_pc += 1
                print('\nPLACAR GERAL:')
                print(f'{nome_player1}: {pontos_p1_m2}')
                print(f'PC: {pontos_pc}')
            elif(operador1 == 3 and operadorPC1 == 1):
                print(f'PC WINS!!! ({nome_player1} escolheu tesoura e PC ecolheu pedra)')
                pontos_pc += 1
                print('\nPLACAR GERAL:')
                print(f'{nome_player1}: {pontos_p1_m2}')
                print(f'PC: {pontos_pc}')
            elif(operador1 == 3 and operadorPC1 == 2):
                print(f'{nome_player1} WINS!!! (PC escolheu papel e {nome_player1} escolheu tesoura)')
                pontos_p1_m2 += 1
                print('\nPLACAR GERAL:')
                print(f'{nome_player1}: {pontos_p1_m2}')
                print(f'PC: {pontos_pc}')
            else:
                print('Opção inválida, selecione um número de 1 a 3 e tente novamente.')
                # Pergunta se o jogador deseja jogar novamente. Se não, a partida finaliza com uma mensagem de agradecimento.

            jogar_dnv = input('Deseja jogar novamente? (S / N): ').lower()

            if jogar_dnv != 's':
                print('\nPLACAR GERAL:')
                print(f'{nome_player1}: {pontos_p1_m2}')
                print(f'PC: {pontos_pc}')
                print('\nObrigado por jogar! Feito por Samuel e Abílio, do curso de Ciência da Computação 2/2024 da PUCPR.')
                break   

    elif modo_jogo == 3: # Modo de jogo 3 é escolhido
        pontos_pc1 = 0
        pontos_pc2 = 0
        nomesPC1 = ['Jack', 'Jesse', 'ProPlayer23', 'Ratatoullie', 'Caramelo']  # Vetor com nomes aleatórios para o PC1
        nomesPC2 = ['João', 'Coder', 'VScode', 'Apple', 'CrazyMango']  # Vetor com nomes aleatórios para o PC2
        nomePC1 = random.choice(nomesPC1)  # Random escolhe aleaoriamente um nome para o PC1
        nomePC2 = random.choice(nomesPC2)  # Random escolhe aleaoriamente um nome para o PC2
        print(f'O PC 1 escolheu o nome {nomePC1} e o PC2 escolheu o nome {nomePC2}')
        operadores = {1: 'pedra', 2: 'papel', 3: 'tesoura'}

        while True:
            operadorPC1 = random.choice([1, 2, 3]) # Random escolhe aleatoriamente os operadores de PC1 e PC2
            operadorPC2 = random.choice([1, 2, 3])
            # Lógica modo de jogo 3 (PC x PC) / Soma de pontos
            if(operadorPC1 == 1 and operadorPC2 == 2):
                print(f'{nomePC2} WINS!!! {nomePC2} jogou papel e {nomePC1} jogou pedra')
                pontos_pc2 += 1
                print('\nPLACAR GERAL:')
                print(f'{nomePC1}: {pontos_pc1}')
                print(f'{nomePC2}: {pontos_pc2}')
            elif(operadorPC1 ==  operadorPC2):
                print(f'DRAW!!! ({nomePC1} e {nomePC2} escolheram o mesmo operador!)')
                print('\nPLACAR GERAL:')
                print(f'{nomePC1}: {pontos_pc1}')
                print(f'{nomePC2}: {pontos_pc2}')
            elif(operadorPC1 == 1 and operadorPC2 == 3):
                print(f'{nomePC1} WINS!!! ({nomePC2} escolheu tesoura e {nomePC1} escolheu pedra)')
                pontos_pc1 += 1
                print('\nPLACAR GERAL:')
                print(f'{nomePC1}: {pontos_pc1}')
                print(f'{nomePC2}: {pontos_pc2}')
            elif(operadorPC1 == 2 and operadorPC2 == 1):
                print(f'{nomePC1} WINS!!! ({nomePC2} escoheu pedra e {nomePC1} ecolheu papel)')
                pontos_pc1 += 1
                print('\nPLACAR GERAL:')
                print(f'{nomePC1}: {pontos_pc1}')
                print(f'{nomePC2}: {pontos_pc2}')
            elif(operadorPC1 == 2 and operadorPC2 == 3):
                print(f'{nomePC2} WINS!!! ({nomePC1} escolheu papel e {nomePC2} tesoura)')
                pontos_pc2 += 1
                print('\nPLACAR GERAL:')
                print(f'{nomePC1}: {pontos_pc1}')
                print(f'{nomePC2}: {pontos_pc2}')
            elif(operadorPC1 == 3 and operadorPC2 == 1):
                print(f'{nomePC2} WINS!!! ({nomePC1} escolheu tesoura e {nomePC2} ecolheu pedra)')
                pontos_pc2 += 1
                print('\nPLACAR GERAL:')
                print(f'{nomePC1}: {pontos_pc1}')
                print(f'{nomePC2}: {pontos_pc2}')
            elif(operadorPC1 == 3 and operadorPC2 == 2):
                print(f'{nomePC1} WINS!!! ({nomePC2} escolheu papel e {nomePC1} escolheu tesoura)')
                pontos_pc1 += 1
                print('\nPLACAR GERAL:')
                print(f'{nomePC1}: {pontos_pc1}')
                print(f'{nomePC2}: {pontos_pc2}')
            else:
                print('Opção inválida, selecione um número de 1 a 3 e tente novamente.')
            
            jogar_dnv = input('\nDeseja jogar novamente? (S / N): ')

            if jogar_dnv != 's':
                print('\nPLACAR GERAL:')
                print(f'{nomePC1}: {pontos_pc1}')
                print(f'{nomePC2}: {pontos_pc2}')
                print('\nObrigado por jogar! Feito por Samuel e Abílio, do curso de Ciência da Computação 2/2024 da PUCPR.')
                break

    continuar = input('Deseja continuar o jogo? (S / N): ').strip().lower()
    if continuar != 's':
        print('Jogo encerrado.')
        break
            