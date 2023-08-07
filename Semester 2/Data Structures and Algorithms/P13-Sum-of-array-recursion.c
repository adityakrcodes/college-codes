// Program 13 - To find sum of array using recursion.
#include <stdio.h>
#include <conio.h>
int findsum(int A[], int n){
    if(n<=0){
        return 0;
    }else{
        return(findsum(A,n-1)+A[n-1]);
    }
}
void main(){
    int i, n, A[10];
    clrscr();
    printf("Enter the size of an array: ");
    scanf("%d", &n);
    printf("Enter the elements of the array: \n");
    for(i=0;i<n;i++){
        scanf("%d",&A[i]);
    }
    printf("Sum of array Elements: %d",findsum(A,n));
    getch();
}