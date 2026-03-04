"""print("numero 192 (decimal => binario) = ", format(192,'8b'))
print("numero 192 (decimal => hexa) = ", format(192,'1x'))
print("digito c (hexa => binario) = ", format(0xc,'4b'))
print("digito f (hexa => binario) = ", format(192,'8b'))


# representa o número decimal 192 com um byte (palavra de 8 bits)
print("Numero 192 (8 bits) = ", format(192,'b').zfill(8)) 
print("De : ", 0b00000000, " até ", 0b11111111)
print("De : ", 0x00, " até ", 0xff)

# representa o número decimal 192 com um 2 bytes (palavra de 16 bits)
print("Numero 192 (16 bits) = ", format(192,'b').zfill(16)) 
print("De : ", 0b0000000000000000, " até ", 0b1111111111111111)
print("De : ", 0x0000, " até ", 0xffff)

# o maior número que pode ser representado é 2 elevado (TAMANHO DA PALAVRA - 1 )
print("8 bits: ", 2**8)
print("16 bits: ", 2**16, ' ou ', (2**8)*(2**8), ' ou ', (2 ** 8)**2)
print("32 bits: ", 2**32, ' ou ', ' ou ', (2 ** 8)**4)
print("64 bits: ", 2**64, ' ou ', ' ou ', (2 ** 8)**8)
print("124 bits: ", 2**124, ' ou ', ' ou ', (2 ** 8)**16)

# caso um computador teste 1000 chaves por segundo
# quanto tempo levará para encontrar uma chave de 64 bits por força bruta?

tamanho = 128
espaco = 2**tamanho
capacidade = 2000000000 * 1000000000 # chaves por segundo
tempo = espaco / capacidade  # tempo em segundos
tempo_anos = tempo/(60 * 60 * 24 * 365)  # converte para dias
print("tempo em anos: ", tempo_anos)"""

# 1) cria o arquivo como TEXTO
f = open('teste.txt','w')
tamanho = f.write('49192')
print('Este arquivo tem ', tamanho, 'bytes')
f.close()