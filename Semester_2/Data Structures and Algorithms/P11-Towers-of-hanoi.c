// Program 11 - Tower of hanoi.
#include <stdio.h>
#include <conio.h>
#include <stdlib.h>
#include <math.h>

void hanoi(int n, char s, char i, char d){
    if(n==1){
        printf("Move disk 1 from %c to %c\n", s, d);
        return;
    }
    hanoi(n-1, s, d, i);
    printf("Move disk %d from peg %c to %c\n", n,s,d);
    hanoi(n-1, i, s, d);
}
void main(){
    int n, count;
    clrscr();
    printf("Enter the number of disks: ");
    scanf("%d", &n);
    hanoi(n, 'S', 'I', 'D');
    count = pow(2,n) - 1; // If compiling with gcc on linux or Windows add -lm while compiling Example: gcc P11-Towers-of-hanoi.c -o P11-Towers-of-hanoi -lm && ./P11-Towers-of-hanoi
    printf("\nTotal number of moves: %d", count);
    getch();
}