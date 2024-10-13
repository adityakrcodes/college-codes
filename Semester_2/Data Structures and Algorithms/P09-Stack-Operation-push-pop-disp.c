#include <stdio.h>
#include <conio.h>
#include <stdlib.h>
#define maxstk 3
int top = -1, stack[maxstk];
void push(){
    int item;
    if(top == maxstk-1){
        printf("Stack Overflow! \n");
        getch();
    }else{
        printf("Enter the item to be inserted: ");
        scanf("%d", &item);
        top++;
        stack[top] = item;
        getch();
    }
}
void pop(){
    int item;
    if(top == -1){
        printf("Stack Underflow!! \n");
        getch();
    }else{
        item = stack[top];
        top--;
        printf("Deleted item is %d \n", item);
        getch();
    }
}
void display(){
    int i;
    if(top == -1){
        printf("Stack is empty! \n");
        getch();
    }else{
        printf("The elements in the stack are: ");
        for(i=top;i>=0;i--){
            printf("%d \t", stack[i]);
        }
        getch();
    }
}

void main(){
    int ch;
    while (1){
        clrscr();
        printf("\n\t\t\tSTACK OPERATIONS Program \n");
        printf("\n\t\t\tEnter your choice: \n");
        printf("\n\t\t\t1. Push \n");
        printf("\n\t\t\t2. Pop \n");
        printf("\n\t\t\t3. Display \n");
        printf("\n\t\t\t4. Exit \n");
        scanf("%d", &ch);
        switch(ch){
            case 1: push();break;
            case 2: pop();break;
            case 3: display();break;
            case 4: exit(0);    
            default: printf("Enter the correct option!");
        }
    }
}