#include <stdio.h>
// #include <conio.h>
void main(){
    int num;
    int sum=0;
    // clrscr();
    printf("Enter the positive numbers (Enter 999 to quit): \n");
    scanf("%d",&num);
    while(num!=999){
        sum = sum + num;
        scanf("%d",&num);
    }
    printf("The sum of all positive numbers %d\n", sum);
    // getch();
}