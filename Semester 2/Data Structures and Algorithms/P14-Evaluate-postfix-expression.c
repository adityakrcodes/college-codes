// Program 14 - Evaluate postfix expression
#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <ctype.h>
#include <math.h>
#include <string.h>
#define max 50
int s[max], top=0;
void push(int elem){
    ++top;
    s[top]=elem;
}
int pop(){
    int elem;
    elem = s[top];
    --top;
    return elem;
}
int main(){
    char postfix[max], ch;
    int i, op1, op2, res;
    clrscr();
    printf("Program to evaluate postfix expression \n");
    printf("Enter the postfix expression: \n");
    scanf("%s", postfix);
    for(i=0;i<strlen(postfix);i++){
        ch = postfix[i];
        if(isdigit(ch)){
            push(ch-'0');
        }else{
            op2 = pop();
            op1 = pop();
            switch (ch){
                case '+': res = op1 + op2; break;
                case '-': res = op1 - op2; break;
                case '*': res = op1 * op2; break;
                case '/': res = op1 / op2; break;
                case '^': res = op1 ^ op2; break;
                default : printf("Invalid \n");
            }
            push(res);
        }
    }
    printf("Result of the above expression = %d", pop());
    return 0;
}