// Write a program to perform binary search using recursion.

#include <stdio.h>
#include <conio.h>
#include <stdlib.h>
int RBSearch(int a[], int ele, int first, int last){
    int mid;
    if(first > last)
        return -1;
    mid = (first + last) / 2;
    if(ele == a[mid]){
        printf("Element found at position %d", mid + 1);
        getch();
        exit(0);
    }
    if(ele<a[mid]){
        last = mid - 1;
        RBSearch(a, ele, first, last);
    }
    if(ele>a[mid]){
        first = mid + 1;
        RBSearch(a, ele, first, last);
    }
    return -1;
}
void main(){
    int i, result, n, element, arr[10];
    clrscr();
    printf("Enter the size of the array: ");
    scanf("%d", &n);
    printf("Enter the elements of the array in ASCENDING ORDER: ");
    for(i = 0; i < n; i++)
        scanf("%d", &arr[i]);
    printf("Enter the element to be searched: ");
    scanf("%d", &element);
    result = RBSearch(arr, element, 0, n - 1);
    if(result == -1)
        printf("Element not found");
    getch();
}