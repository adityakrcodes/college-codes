#include <stdio.h>
int main() {
    int x, y, temp; 
    int *a, *b;
    a = &x;
    b = &y;
    printf("enter two numbers: ");
    scanf("%d %d", &x, &y);
    printf("before swap: x = %d, y = %d\n", x, y);
    temp = *a;
    *a = *b;
    *b = temp;
    printf("after swap: x = %d, y = %d\n", x, y);
    return 0;
}
