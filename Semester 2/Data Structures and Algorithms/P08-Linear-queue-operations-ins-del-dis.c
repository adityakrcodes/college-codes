#include <stdio.h>
#include <conio.h>
#include <stdlib.h>
#define N 3
int FRONT=0,REAR=-1,QUEUE[N];
void Insert(){
    int ITEM;
    if(REAR==N-1){
        printf("Queue is full");
        getch();
    }
    else{
        printf("Enter the item to be inserted: ");
        scanf("%d",&ITEM);
        REAR++;
        QUEUE[REAR]=ITEM;
        getch();
    }
}
void Delete(){
    int ITEM;
    if(REAR == FRONT-1){
        printf("Queue is empty");
        getchar();
        getch();
    }
    else if(FRONT == REAR){
        printf("Deleted item is %d",QUEUE[FRONT]);
        FRONT=0;
        REAR=-1;
        getch();
    }else{
        printf("Deleted item is %d",QUEUE[FRONT]);
        FRONT++;
        getch();
    }
}
void Display(){
    int i;
    if(REAR == FRONT-1){
        printf("Queue is empty");
        getchar();
        getch();
    }
    else{
        printf("The elements in the queue are: ");
        for(i=FRONT;i<=REAR;i++){
            printf("%d ",QUEUE[i]);
        }
        getch();
    }
}
void main(){
    int ch;
    clrscr();
    while (1){
    printf("\n\t\t\tQUEUE OPERATIONS Program \n");
    printf("\n\t\t\tEnter your choice: \n");
    printf("\n\t\t\t1. Insert \n");
    printf("\n\t\t\t2. Delete \n");
    printf("\n\t\t\t3. Display \n");
    printf("\n\t\t\t4. Exit \n");
    scanf("%d",&ch);
    switch (ch){
        case 1: Insert();break;
        case 2: Delete();break;
        case 3: Display();break;
        case 4: exit(0);
        default: printf("Invalid choice");
        }
    }
}