#include<stdio.h>
#include<string.h>
void main()
{
    char a[12][12]={"t=a+b","x=t"};
    char b;
    printf("MOV %c,R1\n",a[0][2]);
    printf("MOV %c,R2\n",a[0][4]);
    b=a[0][3];
    switch(b)
    {
        case '+':
            printf("ADD R1,R2\n");
            break;
        case '-':
            printf("SUB R1,R2");
            break;
        case '*':
            printf("MUL R1,R2");
            break;
        case '/':
            printf("DIV R1,R2");
            break;
        default:
            break;
    }
    printf("MOV R1,x");
}

// MOV a,R1
// MOV b,R2
// ADD R1,R2
// MOV R1,x