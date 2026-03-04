import time

from colorama import Fore

import final_phase
import phase1
import phase2
from utils import (
    CHARACTER_COLOR,
    RULE_COLOR,
    SECTION_DELAY,
    clear_terminal,
    display_header,
    display_separator,
    print_list_stream,
    print_stream,
)

# Global variables
life_bar = None
difficulty = None

# Game Data
characters = [
    f"{CHARACTER_COLOR}👤 1. Diego Castilho: detetive metódico e principal protagonista da história.",
    f"{CHARACTER_COLOR}👤 2. Rebeca Biles: Assistente de Diego, perspicaz e ágil.",
    f"{CHARACTER_COLOR}👤 3. Dr. Montebello: Cientista desaparecido, foco do mistério.",
    f"{CHARACTER_COLOR}👤 4. Clara Montebello: Esposa de Dr. Montebello, visivelmente preocupada.",
    f"{CHARACTER_COLOR}👤 5. Lise Dantas: Uma viajante do tempo enigmática.",
    f"{CHARACTER_COLOR}👤 6. Dr. Hartmann: Mentor do Dr. Montebello e cientista renomado.",
    f"{CHARACTER_COLOR}👤 7. José da Silva: Faxineiro do laboratório, observador atento.",
]

rules = [
    f"{RULE_COLOR}🚫 1. Você tem um número limitado de vidas dependendo da dificuldade escolhida.",
    f"{RULE_COLOR}🚫 2. Use as pistas, proposições e deduções para avançar nas fases.",
    f"{RULE_COLOR}🚫 3. Ao errar, você perde uma vida. Se perder todas as vidas, o jogo termina.",
    f"{RULE_COLOR}🚫 4. Você só pode acessar a próxima fase após concluir a atual.",
]


def select_difficulty():
    global life_bar, difficulty
    display_header("Selecione a dificuldade", Fore.YELLOW)
    print(
        f"\n{Fore.GREEN}1. Fácil: 8 vidas; pistas, proposições e deduções são apresentadas."
    )
    print(f"{Fore.YELLOW}2. Normal: 4 vidas; pistas e proposições são apresentadas.")
    print(f"{Fore.RED}3. Difícil: 2 vidas; pistas e proposições são apresentadas.")
    choice = input(f"{Fore.YELLOW}Digite o número da dificuldade desejada: ")
    if choice == "1":
        life_bar = 8
        difficulty = "fácil"
    elif choice == "2":
        life_bar = 4
        difficulty = "normal"
    elif choice == "3":
        life_bar = 2
        difficulty = "difícil"
    else:
        print(f"{Fore.RED}Opção inválida! Selecione novamente.")
        return select_difficulty()
    return difficulty


# Game Phases
def start_game():
    global life_bar
    clear_terminal()
    print_stream(f"{Fore.CYAN}BEM-VINDO AO JOGO A TEIA DO DESTINO.\n")

    # Display characters
    display_header("PERSONAGENS", CHARACTER_COLOR)
    print_list_stream(characters)
    display_separator()
    time.sleep(SECTION_DELAY)

    # Display rules
    display_header("REGRAS", RULE_COLOR)
    print_list_stream(rules)
    display_separator()
    time.sleep(SECTION_DELAY)

    # Difficulty selection
    select_difficulty()
    clear_terminal()

    # Game Intro
    print_stream(
        f"{Fore.CYAN}Em meio a uma noite tempestuosa, o detetive renomado Diego Castilho chega à Universidade de Ciências Avançadas para investigar o misterioso desaparecimento do Dr. Montebello, um cientista brilhante prestes a revelar uma descoberta revolucionária. À medida que Diego explora os corredores labirínticos da universidade, ele se depara com uma teia de segredos, anomalias temporais e motivações ocultas. O tempo está contra ele, e cada pista pode ser a chave para desvendar o enigma que ameaça a própria realidade."
    )
    input(f"\n{Fore.YELLOW}Aperte qualquer tecla para continuar...")

    # Start Phases Sequentially
    phases = [phase1, phase2]
    for i, phase in enumerate(phases):
        result, life_bar = phase.start_phase(life_bar, difficulty)
        if result == "game over":
            print(f"{Fore.RED}Game Over! Você perdeu todas as suas vidas.")
            break
        elif result == "next":
            print(f"{Fore.GREEN}Parabéns! Você concluiu a fase {i+1}.")
            input(f"{Fore.YELLOW}Aperte qualquer tecla para continuar...")
            clear_terminal()
            continue
    else:
        result, life_bar = final_phase.start_phase(life_bar, difficulty)
        if result == "game over":
            print(f"{Fore.RED}Game Over! Você perdeu todas as suas vidas.")
        elif result == "next":
            print(
                f"{Fore.GREEN}Parabéns! Você concluiu todas as fases e resolveu o mistério final!"
            )


if __name__ == "__main__":
    start_game()