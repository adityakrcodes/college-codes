#include <stdio.h>
#include <string.h>
// #include <conio.h>
void main(){
    int i,j,M,N;
    char pat[30], txt[30];
    // clrscr();
    printf("Enter the string: ");
    gets(txt);
    printf("Enter the pattern to be searched: ");
    gets(pat);
    M = strlen(pat);
    N = strlen(txt);
    for(i=0;i<=N-M;i++){
        for(j=0;j<M;j++){
            if(txt[i+j]!=pat[j]){
                break;
            }
        }
        if(j==M){
            printf("Pattern found at index %d\n",i);
        }
    }
    // getch();
}