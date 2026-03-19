import ttg 

ex1 = (ttg.Truths(['p', 'q'], [('~(p and (~q)) = (p or q)')], ints=False))
print(ex1)
print(ex1.valuation())

teste = (ttg.Truths(['p', 'q'], [('~(~p and q) = (p or q)')], ints=False))
print(teste)
print(teste.valuation())

ex2 = (ttg.Truths(['p', 'q'], [('(p = (p and q) = (p and q))')], ints=False))
print(ex2)
print(ex2.valuation())
