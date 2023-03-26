// Program 12 - To find binomial co-efficient using recursion
#include <conio.h>
#include <stdio.h>
int binomial(int n, int r){
    if(r==0){
        return 1;
    }else if(n==r){
        return 1;
    }else{
        return (binomial(n-1,r)+binomial(n-1,r-1));
    }
}
void main(){
    int n, r;
    clrscr();
    printf("Enter the value of n and r\n");
    scanf("%d %d",&n, &r);
    printf("\nBinomial Co-efficient of %d and %d is %d", n,r,binomial(n,r));
    getch();
}