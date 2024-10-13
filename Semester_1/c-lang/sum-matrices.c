#include <stdio.h>
#define MAX 10

void readMatrix(int m, int n, int mat[MAX][MAX]);
void displayMatrix(int m, int n, int mat[MAX][MAX]);
void addMatrices(int m, int n, int mat1[MAX][MAX], int mat2[MAX][MAX], int result[MAX][MAX]);

int main() {
    int m, n, mat1[MAX][MAX], mat2[MAX][MAX], result[MAX][MAX];

    printf("Enter dimensions (m n): ");
    scanf("%d %d", &m, &n);

    printf("Enter first matrix:\n");
    readMatrix(m, n, mat1);

    printf("Enter second matrix:\n");
    readMatrix(m, n, mat2);

    printf("First matrix:\n");
    displayMatrix(m, n, mat1);

    printf("Second matrix:\n");
    displayMatrix(m, n, mat2);

    addMatrices(m, n, mat1, mat2, result);

    printf("Sum of matrices:\n");
    displayMatrix(m, n, result);

    return 0;
}

void readMatrix(int m, int n, int mat[MAX][MAX]) {
    for (int i = 0; i < m; i++)
        for (int j = 0; j < n; j++)
            scanf("%d", &mat[i][j]);
}

void displayMatrix(int m, int n, int mat[MAX][MAX]) {
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++)
            printf("%d ", mat[i][j]);
        printf("\n");
    }
}

void addMatrices(int m, int n, int mat1[MAX][MAX], int mat2[MAX][MAX], int result[MAX][MAX]) {
    for (int i = 0; i < m; i++)
        for (int j = 0; j < n; j++)
            result[i][j] = mat1[i][j] + mat2[i][j];
}
