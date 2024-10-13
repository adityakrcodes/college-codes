#include <stdio.h>
#include <conio.h>

void bubblesort(int a[], int n){
    int i, temp, j;
    for(i=0;i<n;i++){
        for (j = 0; j < n-i-1; j++){
            if(a[j] > a[j+1]){
                temp = a[j];
                a[j] = a[j+1];
                a[j+1] = temp;
            }
        }
    }
}


void main(){
	int a[10], i, n;
    clrscr();
	printf("Enter the number of elements: ");
	scanf("%d", &n);
	printf("Enter array elements: ");
	for(i=0;i<n;i++){
		scanf("%d",&a[i]);
	}
	bubblesort(a,n);
	printf("Sorted array elements are: ");
	for(i=0;i<n;i++){
		printf("%d\n", a[i]);
	}
	getch();
}
