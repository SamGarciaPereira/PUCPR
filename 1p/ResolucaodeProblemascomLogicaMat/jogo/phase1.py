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
    f"{CLUE_COLOR}🔍 1. José estava na área de serviço no momento em que Montebello desapareceu.",
    f"{CLUE_COLOR}🔍 2. Se Clara revela que o Dr. Montebello tinha planejado uma viagem ao exterior antes de desaparecer, então José estava no laboratório no momento em que Montebello desapareceu.",
    f"{CLUE_COLOR}🔍 3. Se a universidade recebeu um aviso de que Dr. Montebello estava em perigo e precisava de ajuda urgente, então Clara revela que o Dr. Montebello tinha planejado uma viagem ao exterior antes de desaparecer.",
    f"{CLUE_COLOR}🔍 4. O Dr. Montebello deixou uma apresentação incompleta sobre o 'Projeto Alpha' ou A universidade recebeu um aviso de que Dr. Montebello estava en perigo e precisava de ajuda urgente",
    f"{CLUE_COLOR}🔍 5. Se o Dr. Montebello deixou uma apresentação incompleta sobre o 'Projeto Alpha', então Clara afirma que não sabe onde está o Dr. Montebello e que não recebeu nenhuma mensagem dele.",
    f"{CLUE_COLOR}🔍 6. Clara afirma que não sabe onde está o Dr. Montebello e que não recebeu nenhuma mensagem dele ou o sistema de segurança foi reiniciado às 2h10.",
    f"{CLUE_COLOR}🔍 7. Se o sistema de segurança foi reiniciado às 2h10, então Clara afirma que não sabe onde está o Dr. Montebello e que não recebeu nenhuma mensagem dele.",
    f"{CLUE_COLOR}🔍 8. Clara revela que o Dr. Montebello tinha planejado uma viagens ao exterior antes de desaparecer. ou O laboratório possui un caderno com anotações sobre experimentos de viagem no tempo, escrito pelo Dr. Montebello.",
]

# Proposições
propositions = [
    f"{PROPOSITION_COLOR}💡 P: O Dr. Montebello deixou uma apresentação incompleta sobre o 'Projeto Alpha",
    f"{PROPOSITION_COLOR}💡 Q: O laboratório possui un caderno com anotações sobre experimentos de viagem no tempo, escrito pelo Dr. Montebello.",
    f"{PROPOSITION_COLOR}💡 R: Clara afirma que não sabe onde está o Dr. Montebello e que não recebeu nenhuma mensagem dele.",
    f"{PROPOSITION_COLOR}💡 S: Há rumores de que Clara tinha un relacionamento secreto com Dr. Hartmann, o mentor de Montebello.",
    f"{PROPOSITION_COLOR}💡 T: O sistema de segurança foi reiniciado às 2h10.",
    f"{PROPOSITION_COLOR}💡 U: Clara revela que o Dr. Montebello tinha planejado uma viagens ao exterior antes de desaparecer.",
    f"{PROPOSITION_COLOR}💡 V: José estava no laboratório no momento es que Montebello desapareceu.",
    f"{PROPOSITION_COLOR}💡 W: A universidade recebeu un aviso de que Dr. Montebello estava en perigo e precisava de ajuda urgente",
]

# Premissas iniciais
assumptions = [
    f"{ASSUMPTION_COLOR}📜 1. U -> V",
    f"{ASSUMPTION_COLOR}📜 2. W -> U",
    f"{ASSUMPTION_COLOR}📜 3. P ∨ W",
    f"{ASSUMPTION_COLOR}📜 4. P -> R",
    f"{ASSUMPTION_COLOR}📜 5. R ∨ T",
    f"{ASSUMPTION_COLOR}📜 6. T -> S",
    f"{ASSUMPTION_COLOR}📜 7. U ∨ Q",
]


def start_phase(life_bar, difficulty):
    clear_terminal()

    # Phase 1 Header
    display_header("FASE 1", Fore.CYAN)

    # Phase Description
    print_stream(
        f"{Fore.CYAN}Diego e Rebeca vasculham por pistas na universidade e acabam encontrando o laboratório secreto...\n"
        f"Agora, precisam juntar as pistas para entender o que realmente aconteceu.\n"
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
        display_header("PERGUNTA FASE 1", Fore.YELLOW)
        prompt = f"{Fore.YELLOW}Com base nas informações fornecidas, digite as proposições que são verdadeiras (separadas por virgula): "
        choice_input = input(prompt).strip().lower().split(",")
        choice = [item.strip() for item in choice_input]

        # Check the player's answer
        if set(choice) == set(["p", "r", "q"]):
            return "next", life_bar
        else:
            life_bar -= 1
            print(f"{Fore.RED}Resposta errada! Vidas restantes: {life_bar}")
            display_life_bar(life_bar)
            if life_bar == 0:
                return "game over", life_bar

    return "game over", life_bar