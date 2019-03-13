#include<stdio.h>
#define SIZE 15
int main(void)
{
    char c, phoneNumber[SIZE]={0};
    printf("Enter phone number\n");
    int i = 0;
    while((c = getchar()) != '\n' && i < SIZE){
        //printf("%c\n",c);
        phoneNumber[i] = c;
        i++;
    }
    int j = 0;
    for(j=0; j < i ;j++ )
    {
        //printf("%c\n",phoneNumber[j]);
        switch (phoneNumber[j])
        {
            case 'A'...'C':
                printf("2");
                break;
            case 'D'...'F':
                printf("3");
                break;
            case 'G'...'I':
                printf("4");
                break;
            case 'J'...'L':
                printf("5");
                break;
            case 'M'...'O':
                printf("6");
                break;
            case 'P'...'S':
                printf("7");
                break;
            case 'T'...'V':
                printf("8");
                break;
            case 'W'...'Y':
                printf("9");
                break;
            default:
                printf("%c",phoneNumber[j]);
                break;
        }
    }
    return 0;
}