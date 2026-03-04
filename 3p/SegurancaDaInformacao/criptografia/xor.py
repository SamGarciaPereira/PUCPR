'''def tabela_logica():
    dados = [ [ 0b0, 0b0 ], [ 0b0, 0b1 ], [ 0b1, 0b0 ], [ 0b1, 0b1 ] ]

    for x in dados:
       print(x, "AND", x[0] & x[1])
       print(x, "OR", x[0] | x[1])
       print(x, "XOR", x[0] ^ x[1])

tabela_logica()'''

def xor_cipher(plain, key):
    cipher = ""
    for p in plain:
        c = ord(p) ^ key
        cipher += chr(c)
    return cipher

while True:
    key = input('entre com a chave: ')
    if not key:
        print("saindo ... ")
        break
    else:
        key = int(key)
        plain = input('entre com a mensagem: ')
        cipher = xor_cipher(plain, key)
        print("cripto:", cipher)
        print([ord(c) for c in cipher])
        print("decripto:", xor_cipher(cipher, key))
        break

        