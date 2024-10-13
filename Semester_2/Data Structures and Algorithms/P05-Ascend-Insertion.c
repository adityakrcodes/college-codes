#include <stdio.h>
#include <conio.h>

void InsertionSort(int a[], int n){
    int item, i, j;
    printf("Array Elements are: ");
    for(i=0;i<n;i++){
        printf("%d ", a[i]);
    }
    for(i=1;i<n;i++){
        item = a[i];
        j = i-1;
        while(item < a[j] && j>=0){
            a[j+1] = a[j];
            j = j - 1;
        }
        a[j+1] = item;
    }
    
}
void main(){
    int a[20], n, i;
    clrscr();
    printf("Enter the number of elements: ");
    scanf("%d", &n);
    printf("Enter the array elements: ");
    for(i=0;i<n;i++)
        scanf("%d",&a[i]);
    
    InsertionSort(a,n);
    printf("\nSorted Array is: ");
    for(i=0;i<n;i++)
        printf("%d ",a[i]);
    getch();
}
