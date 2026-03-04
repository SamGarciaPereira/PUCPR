import time

from colorama import Fore

from utils import (
    ASSUMPTION_COLOR,
    CLUE_COLOR,
    PROPOSITION_COLOR,
    SECTION_DELAY,
    clear_terminal,
    display_header,
    display_life_bar,
    display_separator,
    print_list_stream,
    print_stream,
)

# Pistas
clues = [
    f"{CLUE_COLOR}🔍 1. Se Lise foi vista no laboratório de Montebello antes do desaparecimento, então Dr. Montebello está preso em um bolsão temporal em seu laboratório.",
    f"{CLUE_COLOR}🔍 2. Clara encontrou uma carta de despedida escrita por Montebello antes do desaparecimento ou um dispositivo de viagem no tempo foi ativado na noite do desaparecimento.",
    f"{CLUE_COLOR}🔍 3. Se Lise negou ter conhecimento sobre os experimentos temporais de Montebello, então Clara encontrou uma carta de despedida escrita por Montebello antes do desaparecimento.",
    f"{CLUE_COLOR}🔍 4. Montebello não escreveu nenhuma carta antes de seu desaparecimento.",
    f"{CLUE_COLOR}🔍 5. Se um dispositivo de viagem no tempo foi ativado na noite do desaparecimento, então Lise foi vista no laboratório de Montebello antes do desaparecimento.",
    f"{CLUE_COLOR}🔍 6. Lise foi vista no laboratório de Montebello antes do desaparecimento ou Rebeca suspeita que Lise manipulou os experimentos temporais.",
    f"{CLUE_COLOR}🔍 7. Se Lise foi vista no laboratório de Montebello antes do desaparecimento, então Dr. Montebello está preso em um bolsão temporal em seu laboratório.",
    f"{CLUE_COLOR}🔍 8. Lise negou ter conhecimento sobre os experimentos temporais de Montebello ou uma mensagem cifrada de Montebello alerta sobre “uma armadilha temporal”.",
    f"{CLUE_COLOR}🔍 9. Um dispositivo de viagem no tempo foi ativado na noite do desaparecimento ou José afirma ter ouvido Lise discutir “medidas extremas” com Montebello.",
]

# Proposições
propositions = [
    f"{PROPOSITION_COLOR}💡 P: Dr. Montebello está preso em um bolsão temporal em seu laboratório.",  # V
    f"{PROPOSITION_COLOR}💡 Q: Lise foi vista no laboratório de Montebello antes do desaparecimento.",  # V
    f"{PROPOSITION_COLOR}💡 R: Rebeca suspeita que Lise manipulou os experimentos temporais.",  # IND
    f"{PROPOSITION_COLOR}💡 S: Um dispositivo de viagem no tempo foi ativado na noite do desaparecimento.",  # V
    f"{PROPOSITION_COLOR}💡 T: José afirma ter ouvido Lise discutir “medidas extremas” com Montebello.",  # IND
    f"{PROPOSITION_COLOR}💡 U: Clara encontrou uma carta de despedida escrita por Montebello antes do desaparecimento.",  # F
    f"{PROPOSITION_COLOR}💡 V: Uma mensagem cifrada de Montebello alerta sobre “uma armadilha temporal”.",  # V
    f"{PROPOSITION_COLOR}💡 W: Lise negou ter conhecimento sobre os experimentos temporais de Montebello.",  # F
]

# Premissas iniciais
assumptions = [
    f"{ASSUMPTION_COLOR}📜 Q -> P",
    f"{ASSUMPTION_COLOR}📜 U v S",
    f"{ASSUMPTION_COLOR}📜 W -> U",
    f"{ASSUMPTION_COLOR}📜 S -> Q",
    f"{ASSUMPTION_COLOR}📜 Q v R",
    f"{ASSUMPTION_COLOR}📜 Q -> P",
    f"{ASSUMPTION_COLOR}📜 W v V",
    f"{ASSUMPTION_COLOR}📜 S v T",
]


def start_phase(life_bar, difficulty):
    clear_terminal()

    # Phase 4 Header
    display_header("FASE FINAL", Fore.CYAN)

    # Phase Description
    description = f"{Fore.CYAN}Diego e Rebeca descobrem que Hartmann, o mentor de Montebello, possui uma cópia do misterioso Projeto Alpha, um documento que detalha experimentos avançados com bolsões temporais. Essa descoberta levanta suspeitas sobre o envolvimento de Hartmann no desaparecimento de Montebello. À medida que investigam, os dois encontram indícios de que Hartmann não está apenas interessado na ciência, mas possui motivos pessoais obscuros: ele acredita que manipular o tempo pode ser a chave para encontrar sua filha desaparecida. As pistas sugerem que ele poderia ter usado o conhecimento do Projeto Alpha para prender Montebello em um bolsão temporal, tudo em busca de um experimento arriscado para alcançar sua própria obsessão.\n"
    print_stream(description)
    display_separator()

    # Display clues
    display_header("PISTAS", CLUE_COLOR)
    print_list_stream(clues)
    display_separator()
    time.sleep(SECTION_DELAY)

    # Adjust information based on difficulty
    if difficulty == "fácil":
        # Display propositions
        display_header("PROPOSIÇÕES", PROPOSITION_COLOR)
        print_list_stream(propositions)
        display_separator()
        time.sleep(SECTION_DELAY)

        # Display assumptions
        display_header("PREMISSAS", ASSUMPTION_COLOR)
        print_list_stream(assumptions)
        display_separator()
        time.sleep(SECTION_DELAY)

    elif difficulty == "normal":
        # Display propositions only
        display_header("PROPOSIÇÕES", PROPOSITION_COLOR)
        print_list_stream(propositions)
        display_separator()
        time.sleep(SECTION_DELAY)

    while life_bar > 0:
        # Question Prompt
        display_header("PERGUNTA FASE FINAL", Fore.YELLOW)
        prompt = (
            f"{Fore.YELLOW}Com base nas informações fornecidas, quem é o verdadeiro culpado pelo desaparecimento de Montebello?\n"
            f"Digite o número da pista correta: "
        )
        choice_input = input(prompt).strip().lower().split(",")
        choice = [item.strip() for item in choice_input]

        # Check the player's answer
        if set(choice) == set(["p", "q", "s", "v"]):
            print(
                f"{Fore.GREEN}Parabéns! Você descobriu a verdade por trás do mistério!"
            )
            input(f"{Fore.YELLOW}Aperte qualquer tecla para encerrar o jogo...")
            return "next", life_bar
        else:
            life_bar -= 1
            print(f"{Fore.RED}Resposta errada! Vidas restantes: {life_bar}")
            display_life_bar(life_bar)
            if life_bar == 0:
                return "game over", life_bar

    return "game over", life_bar