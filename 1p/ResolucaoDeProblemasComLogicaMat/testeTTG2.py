import ttg as t

# Proposição (a): p ∧ (p ∨ q) ⇔ p
a = t.Truths(['p', 'q'], ['(p and (p or q)) = p'], ints=False)
print("Tabela Verdade para a proposição (a): p ∧ (p ∨ q) ⇔ p")
print(a)
print("\n")

# Proposição (b): (p ↔ (p ∧ q)) ⇔ (p ⇒ q)
b = t.Truths(['p', 'q'], ['(p = (p and q)) = (p => q)'], ints=False)
print("Tabela Verdade para a proposição (b): (p ↔ (p ∧ q)) ⇔ (p ⇒ q)")
print(b)
print("\n")

# Proposição (c): (p ⇒ q) ∧ (q ⇒ r) ⇔ p ⇒ (q ∧ r)
c = t.Truths(['p', 'q', 'r'], ['(p => q) and (q => r) = (p => (q and r))'], ints=False)
print("Tabela Verdade para a proposição (c): (p ⇒ q) ∧ (q ⇒ r) ⇔ p ⇒ (q ∧ r)")
print(c)
print("\n")

# Proposição (d): q ↔ (p ∨ q) ⇔ p ⇒ q
d = t.Truths(['p', 'q'], ['(q = (p or q)) = (p => q)'], ints=False)
print("Tabela Verdade para a proposição (d): q ↔ (p ∨ q) ⇔ p ⇒ q")
print(d)
print("\n")

# Proposição (e): (p ⇒ q) ⇒ r ⇔ (p ∧ ¬r) ⇒ ¬q
e = t.Truths(['p', 'q', 'r'], ['((p => q) => r) = ((p and ~r) => ~q)'], ints=False)
print("Tabela Verdade para a proposição (e): (p ⇒ q) ⇒ r ⇔ (p ∧ ¬r) ⇒ ¬q")
print(e)
print("\n")

# Proposição (f): (p ⇒ q) ∨ (p ⇒ r) ⇔ p ⇒ (q ∨ r)
f = t.Truths(['p', 'q', 'r'], ['(p => q) or (p => r) = (p => (q or r))'], ints=False)
print("Tabela Verdade para a proposição (f): (p ⇒ q) ∨ (p ⇒ r) ⇔ p ⇒ (q ∨ r)")
print(f)
print("\n")

# Proposição (g): ¬(p ∧ ¬q) ⇔ p ⇒ q
g = t.Truths(['p', 'q'], ['~(p and ~q) = (p => q)'], ints=False)
print("Tabela Verdade para a proposição (g): ¬(p ∧ ¬q) ⇔ p ⇒ q")
print(g)
