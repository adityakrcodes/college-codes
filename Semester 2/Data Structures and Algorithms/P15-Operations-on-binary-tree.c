#include <stdio.h>
#include <stdlib.h>

struct node{
    int data;
    struct node *left;
    struct node *right;
};
struct node *newNode(int data){
    struct node *node=(struct node*)malloc(sizeof(struct node));
    node -> data = data;
    node -> left = NULL;
    node -> right = NULL;
    return(node);
};

void PREORDER(struct node *node){
    if(node == NULL)
        return;
    printf("%d ",node -> data);
    PREORDER(node -> left);
    PREORDER(node -> right);
}

void INORDER(struct node *node){
    if(node == NULL)
        return;
    INORDER(node -> left);
    printf("%d ",node -> data);
    INORDER(node -> right);
}

void POSTORDER(struct node *node){
    if(node == NULL)
        return;
    POSTORDER(node -> left);
    POSTORDER(node -> right);
    printf("%d ",node -> data);
}

void main(){
    struct node *root = newNode(1);
    root -> left = newNode(2);
    root -> right = newNode(3);
    root -> left -> left = newNode(4);
    root -> left -> right = newNode(5);

    printf("\n Preorder traversal of binary tree is \n");
    PREORDER(root);
    printf("\n Inorder traversal of binary tree is \n");
    INORDER(root);
    printf("\n Postorder traversal of binary tree is \n");
    POSTORDER(root);
}