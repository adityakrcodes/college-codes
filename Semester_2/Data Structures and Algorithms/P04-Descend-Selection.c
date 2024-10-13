#include <stdio.h>
#include <conio.h>

void selectionsort(int a[], int n){
    int i, j, temp, min;
    for(i=0;i<n-1;i++){
        int min = i;
        for(j=i+1;j<n;j++){
            if(a[j] < a[min]){
                min = j;
            }
        }
        temp = a[i];
        a[i] = a[min];
        a[min] = temp;
    }
}

void main(){
    int a[10], i, n;
    clrscr();
    printf("Enter the number of elements: ");
    scanf("%d", &n);
    printf("Enter array elements: ");
    for(i=0;i<n;i++)
        scanf("%d", &a[i]);
    selectionsort(a,n);
    printf("Sorted array elements are: ");
    for(i=0;i<n;i++)
        printf("%d\n", a[i]);
    getch();
}