// Program 16 - Program to find the length of a string, concatenate two strings, reverse a string without using inbuilt functions
#include <stdio.h>
#include <stdlib.h>
#include <conio.h>

void length(){
    char str[50];
    int i;
    printf("Enter a string: \n");
    scanf("%s", str);
    for(i=0;str[i]!='\0';i++);
    printf("Length of the string is %d", i);
    getch();
}
void concat(){
    char str1[50], str2[50];
    int i, j;
    printf("Enter the first string: \n");
    scanf("%s", str1);
    printf("Enter the second string: \n");
    scanf("%s", str2);
    for(i=0;str1[i]!='\0';i++);
    for(j=0;str2[j]!='\0';j++,i++){
        str1[i] = str2[j];
    }
    str1[i] = '\0';
    printf("Concatenated string is %s", str1);
    getch();
}
void reverse(){
    char str[50], rev[25], temp;
    int i=0, j=0, k=0;
    printf("Enter a string: \n");
    scanf("%s", str);
    for(i=0;str[i]!='\0';i++);
    for(j=i-1;j>=0;j--){
        rev[k++] = str[j];
    }
    rev[i] = '\0';
    printf("Reversed string is %s \n", rev);
    getch();
}
void main(){
    int ch;
    clrscr();
    while(1){
        printf("\n1. Length of a string \n");
        printf("2. Concatenate two strings \n");
        printf("3. Reverse a string \n");
        printf("4. Exit \n");
        printf("Enter your choice: \n");
        scanf("%d", &ch);
        switch (ch){
            case 1: length(); break;
            case 2: concat(); break;
            case 3: reverse(); break;
            case 4: exit(0);
            default: printf("Invalid choice \n");
        }
    }
    getch();
}