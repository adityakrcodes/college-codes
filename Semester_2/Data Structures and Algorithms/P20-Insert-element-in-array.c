#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
void main(){
    int i, a[20], n, pos, ele;
    clrscr();
    printf("Enter Size of array: ");
    scanf("%d",&n);
    printf("Enter the elements of the array:");
    for(i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    printf("Enter the position where to insert the element: ");
    scanf("%d", &pos);
    printf("Enter the element to be inserted: ");
    scanf("%d", &ele);
    if(pos > n){
        printf("Out of Array limits!");
        getch();
        exit(0);
    }else{
        for(i=n;i>=pos;i--){
            a[i]=a[i-1];
        }
        a[pos] = ele;
        n++;
    }
    printf("\n After inserting element: \n");
    for(i=0;i<n;i++){
        printf("%d ", a[i]);
    }
    getch();
}