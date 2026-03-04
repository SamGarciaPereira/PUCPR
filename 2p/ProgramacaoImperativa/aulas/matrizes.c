#include <stdio.h>

int main(){
    float m1 [4][2] = {
    {3.56, 9.32},
    {4.78, 2.75},
    {8.02, 4.55},
    {3.66, 1.87}
    };

    float m2 [4][2] = {
    {4.78, 8.73},
    {5.90, 2.38},
    {8.44, 6.73},
    {3.29, 1.99}
    };

    float soma[4][2];

    for(int i = 0; i < 4; i++){
        for(int j = 0; j < 2; j++){
            soma[i][j] = m1[i][j] + m2[i][j];
        }
    }

    for(int i = 0; i < 4; i++){
        for(int j = 0; j < 2; j++){
             printf("%.2f", soma[i][j]);
        }
        printf("\n");
    }
    return 0;
}
