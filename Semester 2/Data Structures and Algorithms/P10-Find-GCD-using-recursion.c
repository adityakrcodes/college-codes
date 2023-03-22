// Program 10- Write a program to find GCD of two numbers using recursion.

#include <stdio.h>
// #include <conio.h>

int gcd(int n1, int n2){
    if(n2!=0){
        return gcd(n2, n1%n2);
    }else{
        return n1;
    }
}
void main(){
    int n1, n2;
    // clrscr();
    printf("Enter the first number: ");
    scanf("%d", &n1);
    printf("Enter the second number: ");
    scanf("%d", &n2);
    printf("The GCD of %d and %d is %d", n1, n2, gcd(n1, n2));
    // getch();
}