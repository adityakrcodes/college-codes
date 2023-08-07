// Write a program to insert and delete elements in a singly linked list. Display the list after each insertion and deletion.
#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>

struct node {
    int regno;
    char name[10];
    struct node *link;
};
typedef struct node NODE;
NODE *start = NULL;

void create() {
    char ch;
    int i = 0;
    NODE *curptr, *newnode;
    start = (NODE *)malloc(sizeof(NODE));
    curptr = start;
    printf("Enter the registration number and name: ");
    scanf("%d", &curptr->regno);
    scanf("%s", curptr->name);
    while (1) {
        printf("Do you want to add another node? (Y/N): ");
        ch = getchar();
        if (tolower(ch) == 'y') {
            newnode = (NODE *)malloc(sizeof(NODE));
            curptr->link = newnode;
            curptr = newnode;
            printf("\nEnter the registration number and name: ");
            scanf("%d", &curptr->regno);
            scanf("%s", curptr->name);
        } else {
            curptr->link = NULL;
            break;
        }
    }
}

void insert_beg() {
    NODE *newnode;
    newnode = (NODE *)malloc(sizeof(NODE));
    printf("\nEnter the registration number and name: ");
    scanf("%d", &newnode->regno);
    scanf("%s", newnode->name);
    newnode->link = start;
    start = newnode;   
}

void delete_regno() {
    int no;
    NODE *curptr = start, *prevptr = NULL;
    printf("\nEnter the registration number to be deleted: ");
    scanf("%d", &no);
    if (start == NULL) {
        printf("\nList is empty");
        return;
    } else if (start->regno == no) {
        start = start->link;
        free(curptr);
        return;
    } else {
        while ((curptr != NULL) && (curptr->regno != no)) {
            prevptr = curptr;
            curptr = curptr->link;
        }
        if (curptr == NULL) {
            printf("\nRegistration number not found");
            return;
        } else {
            prevptr->link = curptr->link;
            free(curptr);
        }
    }
}

void display() {
    NODE *curptr = start;
    if (start == NULL) {
        printf("\nList is empty");
    } else {
        while (curptr != NULL) {
            printf("%d->%s->", curptr->regno, curptr->name);
            curptr = curptr->link;
        }
        printf("NULL\n");
    }
}

int main() {
    int ch;
    while (1) {
        printf("\t\t\t Singly Linked List\n");
        printf("\t\t\t 1. Create\n");
        printf("\t\t\t 2. Insert at beginning\n");
        printf("\t\t\t 3. Delete by registration number\n");
        printf("\t\t\t 4. Display\n");
        printf("\t\t\t 5. Exit\n");
        printf("\t\t\t Enter your choice: ");
        scanf("%d", &ch);
        switch(ch){
            case 1: start = NULL;
                    create();
                    break;
            case 2: insert_beg();
                    break;
            case 3: delete_regno();
                    break;
            case 4: display();
                    break;
            case 5: exit(0);
            default: printf("\nInvalid choice");
        }
    }
}