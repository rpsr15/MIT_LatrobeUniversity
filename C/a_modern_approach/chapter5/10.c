#include <stdio.h>

int main(void)
{
    printf("Enter numerical grade");
    int grade = 0;
    scanf("%d", &grade);

    switch(grade){
        case 90 ... 100:
        printf("A");
        break;
        case 80 ... 89:
        printf("B");
        break;
        case 70 ... 79:
        printf("C");
        break;
        case 60 ... 69:
        printf("D");
        break;
        case 0 ... 59:
        printf("E");
        break;
        default:
        printf("invalied");
        break;
    }

    return 0;
}