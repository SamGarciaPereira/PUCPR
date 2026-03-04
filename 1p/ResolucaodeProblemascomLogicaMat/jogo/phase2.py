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
    f'{CLUE_COLOR}🔍 1. Clara foi vista entrando no escritório de Hartmann na noite do desaparecimento ou Hartmann usava o "Projeto Alpha" para tentar encontrar sua filha desaparecida.',
    f'{CLUE_COLOR}🔍 2. Se Hartmann usava o "Projeto Alpha" para tentar encontrar sua filha desaparecida, então Hartmann possui uma cópia completa do "Projeto Alpha".',
    f"{CLUE_COLOR}🔍 3. Se os documentos que José deveria ter entregue a Hartmann estão desaparecidos, então Clara foi vista entrando no escritório de Hartmann na noite do desaparecimento.",
    f"{CLUE_COLOR}🔍 4. Clara estava na cafeteria da universidade durante toda a noite do desaparecimento.",
    f'{CLUE_COLOR}🔍 5. Se Hartmann possui uma cópia completa do "Projeto Alpha", então Hartmann recebeu uma ligação misteriosa na manhã seguinte ao desaparecimento.',
    f'{CLUE_COLOR}🔍 6. Se Hartmann usava o "Projeto Alpha" para tentar encontrar sua filha desaparecida, então Lise possui um dispositivo que estabiliza anomalias temporais.',
    f'{CLUE_COLOR}🔍 7. Hartmann tentou acessar o laboratório de Montebello sem permissão ou Hartmann usava o "Projeto Alpha" para tentar encontrar sua filha desaparecida.',
    f"{CLUE_COLOR}🔍 8. Se Clara chantageou Hartmann para ser incluída nos experimentos, então os documentos que José deveria ter entregue a Hartmann estão desaparecidos.",
]


# Proposições
propositions = [
    f'{PROPOSITION_COLOR}💡 P: Hartmann possui uma cópia completa do "Projeto Alpha".',  # V
    f'{PROPOSITION_COLOR}💡 Q: Hartmann usava o "Projeto Alpha" para tentar encontrar sua filha desaparecida.',  # V
    f"{PROPOSITION_COLOR}💡 R: Clara foi vista entrando no escritório de Hartmann na noite do desaparecimento.",  # F
    f"{PROPOSITION_COLOR}💡 S: Hartmann recebeu uma ligação misteriosa na manhã seguinte ao desaparecimento.",  # V
    f"{PROPOSITION_COLOR}💡 T: Os documentos que José deveria ter entregue a Hartmann estão desaparecidos.",  # F
    f"{PROPOSITION_COLOR}💡 U: Lise possui um dispositivo que estabiliza anomalias temporais.",  # V
    f"{PROPOSITION_COLOR}💡 V: Hartmann tentou acessar o laboratório de Montebello sem permissão.",  # IND
    f"{PROPOSITION_COLOR}💡 W: Clara chantageou Hartmann para ser incluída nos experimentos.",  # F
]

# Premissas iniciais
assumptions = [
    f"{ASSUMPTION_COLOR}📜 R v Q",
    f"{ASSUMPTION_COLOR}📜 Q -> P",
    f"{ASSUMPTION_COLOR}📜 T -> R",
    f"{ASSUMPTION_COLOR}📜 P -> S",
    f"{ASSUMPTION_COLOR}📜 Q -> U",
    f"{ASSUMPTION_COLOR}📜 V v Q",
    f"{ASSUMPTION_COLOR}📜 W -> T",
]


def start_phase(life_bar, difficulty):
    clear_terminal()

    # Phase 1 Header
    display_header("FASE 2", Fore.CYAN)

    # Phase Description
    print_stream(
        f"{Fore.CYAN}Diego e Rebeca descobrem que Hartmann, o mentor de Montebello, tem uma cópia do Projeto Alpha e pode estar envolvido no desaparecimento. A investigação revela motivos pessoais de Hartmann ligados à sua filha desaparecida.\n"
    )
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

    else:
        display_header("PROPOSIÇÕES", PROPOSITION_COLOR)
        print_list_stream(propositions)
        display_separator()
        time.sleep(SECTION_DELAY)

    while life_bar > 0:
        # Question Prompt
        display_header("PERGUNTA FASE 2", Fore.YELLOW)
        prompt = f"{Fore.YELLOW}Com base nas informações fornecidas, digite as proposições que são verdadeiras (separadas por virgula): "
        choice_input = input(prompt).strip().lower().split(",")
        choice = [item.strip() for item in choice_input]

        # Check the player's answer
        if set(choice) == set(["p", "q", "s", "u"]):
            return "next", life_bar
        else:
            life_bar -= 1
            print(f"{Fore.RED}Resposta errada! Vidas restantes: {life_bar}")
            display_life_bar(life_bar)
            if life_bar == 0:
                return "game over", life_bar

    return "game over", life_bar