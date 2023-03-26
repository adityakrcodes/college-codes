// Write a program to find the location of a given number using linear search.
#include <stdio.h>
#include <stdlib.h>
#include <conio.h>

void main(){
    int arr[10],i,ele,n;
    clrscr();
    printf("Enter no. of Elements: ");
    scanf("%d",&n);
    printf("Enter the elements: ");
    for(i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    printf("Enter the Element to be Searched: ");
    scanf("%d", &ele);
    for(i=0;i<n;i++){
        if(arr[i]==ele){
            printf("Element found at position %d",i+1);
            exit(0);
        }
    }
    printf("Element not found!");
    getch();
    exit(0);
}