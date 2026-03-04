import ttg

'''FASE 1'''





'''FASE 2'''

prop1 = (ttg.Truths(['r', 'q'], [('r or q')], ints=False))
print(prop1)
print(prop1.valuation())

prop2 = (ttg.Truths(['p', 'q'], [('q => p')], ints=False))
print(prop2)
print(prop2.valuation())

prop3 = (ttg.Truths(['t', 'r'], [('t => r')], ints=False))
print(prop3)
print(prop3.valuation())

prop4 = (ttg.Truths(['p', 's'], [('p => s')], ints=False))
print(prop4)
print(prop4.valuation())

prop5 = (ttg.Truths(['u', 'q'], [('q => u')], ints=False))
print(prop5)
print(prop5.valuation())

prop6 = (ttg.Truths(['v', 'q'], [('v or q')], ints=False))
print(prop6)
print(prop6.valuation())

prop7 = (ttg.Truths(['w', 't'], [('w => t')], ints=False))
print(prop7)
print(prop7.valuation())
