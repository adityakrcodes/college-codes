#include <stdio.h>
#include <conio.h>
void main(){
    int a[10][10];
    int i,j,m,n,sparse=0;
    clrscr();
    printf("Enter the order of the matrix: \n");
    scanf("%d%d", &m, &n);
    printf("Enter the elements:");
    for(i=0;i<m;i++){
        for(j=0;j<n;j++){
            scanf("%d", &a[i][j]);
            if(a[i][j]==0){
                sparse++;
            }
        }
    }
    if(sparse>((m*n)/2)){
        printf("The given matrix is sparse! \n");
        // getch();
    }else{
        printf("The given matrix is not a sparse matrix. \n");
        // getch();
    }
    printf("There are %d numbers of zeros. \n", sparse);
    // getch();
}