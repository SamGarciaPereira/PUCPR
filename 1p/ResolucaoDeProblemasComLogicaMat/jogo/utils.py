import os
import sys
import time

from colorama import Fore

# Color Definitions
CHARACTER_COLOR = Fore.BLUE
RULE_COLOR = Fore.RED
CLUE_COLOR = Fore.LIGHTGREEN_EX
PROPOSITION_COLOR = Fore.LIGHTCYAN_EX
ASSUMPTION_COLOR = Fore.CYAN
LIFE_BAR_COLOR = Fore.MAGENTA
SEPARATOR_COLOR = Fore.LIGHTWHITE_EX
HEADER_COLOR = Fore.LIGHTYELLOW_EX

# Delay
SECTION_DELAY = 0.2


def clear_terminal():
    os.system("cls" if os.name == "nt" else "clear")


def print_stream(text, delay=0.01):
    for char in text:
        sys.stdout.write(char)
        sys.stdout.flush()
        time.sleep(delay)


def print_list_stream(list, delay=SECTION_DELAY):
    for item in list:
        print_stream(f"{item}\n")
        time.sleep(delay)


def loading_animation():
    for _ in range(3):
        print(".", end="", flush=True)
        time.sleep(0.3)
    print("\n")


def display_life_bar(life_bar):
    hearts = "❤️ " * life_bar
    print(f"{LIFE_BAR_COLOR}Life Bar: {hearts}")


def display_header(title, color=HEADER_COLOR):
    print(f"\n{color}{'='*20} {title} {'='*20}\n")


def display_separator():
    print(f"\n{"=" * 50}")