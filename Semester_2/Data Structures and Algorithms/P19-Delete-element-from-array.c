// Program 19- Write a program to delete an element from an array.

#include <stdio.h>
#include <conio.h>
#include <stdlib.h>

void main(){
    int i, a[20], n, pos,ele;
    clrscr();
    printf("Enter the number of elements in the array: ");
    scanf("%d", &n);
    printf("Enter the elements of the array: ");
    for(i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    printf("Enter the position of the element to be deleted: ");
    scanf("%d", &pos);
    if(pos>n){
        printf("Given position does not exist.");
        getch();
        exit(0);
    }else{
        ele = a[pos];
        for(i=pos+1;i<n;i++){
            a[i-1] = a[i];
        }
        printf("The array after deletion: ");
        for(i=0;i<n-1;i++){
            printf("%d ", a[i]);
        }
        getch();
    }
}