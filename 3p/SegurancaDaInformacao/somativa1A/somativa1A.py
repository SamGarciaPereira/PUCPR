import comparaRC4AES as AES
import os
from base64 import b64encode

'''
EXERCICIO: 

Faça as chamadas para criptografar e descriptografar com AES em cada um dos 4 modos: ECB, CBC, CTR e GCM 
O modo ECB foi fornecido como exemplo. Inclua o teste para os outros 3 modos CBC, CTR e GCM 
plaintext = 'TESTE DA EQUIPE X' ou 'TESTE DO ESTUDANTE XX' 

PARA ENTREGAR A ATIVIDADE COPIE O RESULTADO DO PRINT NO FINAL DO ARQUIVO

'''
    
msg = 'GRUPO 7'    
plaintext = msg.encode('UTF-8')

if len(plaintext) % 16 != 0:
    plaintext = plaintext + bytearray(16 - len(msg)%16)
    
chave = os.urandom(16)


# Copie e modifique esta seção para os 3 modos restantes
#-----------------------------------------------------
modo = 'ECB'
print(f'\nTESTE DO MODO {modo}')
print( 'chave:', [ b for b in chave ] )
try:
    ciphertext, iv, tag = AES.cifra_AES(plaintext, chave, modo)

    if iv is not None: print( 'iv:', [ b for b in iv ] )
    if tag is not None: print( 'tag:', [ b for b in tag ] )
    print('Ciphertext (B64):', b64encode(ciphertext))

    plaintext = AES.decifra_AES(ciphertext, chave, modo)
    print('Plaintext:', plaintext.decode())

except Exception as e:    
    print(e)
#-----------------------------------------------------



'''
--------------------------------------------------------------------------------------------------------
COLOQUE O PRINT COM OS RESULTADOS AQUI


'''