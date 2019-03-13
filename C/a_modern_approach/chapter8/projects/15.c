#include <stdio.h>
int main(void)
{
    int mLength=0, shiftAmount=0, i=0;
    char message[80],c ;
    printf("Enter message to be encrypter:\n");
    while((c=getchar()) != '\n' && mLength < 80)
    {
        message[mLength++] = c;
    }
    printf("Enter shift amount(1-25):\n");
    scanf("%d",&shiftAmount);

    for(i=0; i<mLength ; i++)
    {
        int charVal = message[i];
        if(charVal>= 65 && charVal <= 90)
        {
            charVal = (charVal+shiftAmount > 90)?(charVal+shiftAmount-26):charVal+shiftAmount;
            printf("%c",charVal);
        }else if (charVal>= 97 && charVal <= 122){
            charVal = (charVal+shiftAmount > 122)?(charVal+shiftAmount-26):charVal+shiftAmount;
            printf("%c",charVal);
        }else{
            printf("%c",charVal);
        }
    }
    return 0;
}