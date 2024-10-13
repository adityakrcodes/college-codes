// Write a program to find the length of the string using Pointers.

#include <stdio.h>
// #include <conio.h>

void main(){
    char str[20], *ptr;
    int i = 0;
    // clrscr();
    printf("Find the lenght of the string");
    printf("\n Enter the string: ");
    gets(str);
    ptr = str;
    while(*ptr != '\0'){
        i++;
        ptr++;
    }
    printf("\n The length of the string is %d",i);
    // getch();
}