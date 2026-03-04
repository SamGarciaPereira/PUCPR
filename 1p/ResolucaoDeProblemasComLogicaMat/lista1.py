import ttg as t

# a) 
a = (t.Truths(['p', 'q'], ['~p or ~q'], ints=False))

print(a)
print(a.valuation())

# b) 
b = (t.Truths(['p', 'q', 'r'], ['(p and ~q) or ~r and (~p or q) and r'], ints=False))
print(b)
print(b.valuation())

# c)
c = (t.Truths(['p', 'q'], ['(p and q) => (p or q)'], ints=False))
print(c)
print(c.valuation())

# d)
d = (t.Truths(['p', 'q', 'r'], ['(p and q) or r'], ints=False))
print(d)
print(d.valuation())

# e)
e = (t.Truths(['p', 'q'], ['(p and q) => p'], ints=False))
print(e)
print(e.valuation())

# f)
f = (t.Truths(['p', 'q'], ['p => (p or q)'], ints=False))
print(f)
print(f.valuation())

# g)
g = (t.Truths(['p', 'q'], ['(p and (p => q)) => q'], ints=False))
print(g)
print(g.valuation())

# h)
h = (t.Truths(['p', 'q'], ['((p => q) and ~q) => ~q'], ints=False))
print(h)
print(h.valuation())

# i)
i = (t.Truths(['p', 'q'], ['(p and q) and ~p'], ints=False))
print(i)
print(i.valuation())

# j)
j = (t.Truths(['p', 'q', 'r'], ['((p or ~q) and r) and ((p and q) or ~r)'], ints=False))
print(j)
print(j.valuation())

# k)
k = (t.Truths(['p', 'q', 'r'], ['((p = q) => r) = ((p and r) => q)'], ints=False))
print(k)
print(k.valuation())
