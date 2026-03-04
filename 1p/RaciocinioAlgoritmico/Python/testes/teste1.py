'''matriz = [(1, 2, 3, 4), (5, 6, 7, 8), (9, 10, 11, 12), (13, 14, 15, 16)]

print(matriz[0][0], matriz[1][1], matriz[2][2], matriz[3][3])'''

matriz = [(1, 2, 3), (4, 5, 6), (7, 8, 9)]

for i in range (len(matriz)):
    for j in range (len(matriz[0])):
        print(matriz[i][j])
        print('')