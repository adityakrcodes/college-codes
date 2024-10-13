#include <stdio.h>
#include <conio.h>

void main(){
    float r, area, circum;
    clrscr();
    printf("Enter the radius of the circle: ");
    scanf("%f", &r);    
    area = 3.14 * r * r;
    circum = 2 * 3.14 * r;
    printf("Area of the circle = %f\n", area);
    printf("Circumference of the circle = %f\n", circum);
    getch();
}