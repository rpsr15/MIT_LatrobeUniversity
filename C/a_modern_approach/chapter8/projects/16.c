#include<stdio.h>
int main(void)
{
    char word1[10],word2[10],c;
    int compW1[26]={0},compW2[26]={0};
    int size1 = 0, size2 = 0, i = 0, j = 0;
    printf("Enter first word:\n");
    while((c = getchar()) != '\n'){
        word1[size1++] = c;
    }
    

    printf("Enter second word:\n");
    while((c = getchar()) != '\n'){
        word2[size2++] = c;
    }
    if(size1 != size2)
    {
        printf("they have different length hence cannot be anagrams\n");
        
    }else{
        for(i=0;i<size1;i++)
        {
            int ch1 = ((word1[i]>=65 && word1[i]<= 90)?(word1[i]+32):word1[i]) - 97;
            int ch2 = ((word2[i]>=65 && word2[i]<= 90)?(word2[i]+32):word2[i]) - 97;
            compW1[ch1] = compW1[ch1] + 1;
            compW2[ch2] = compW2[ch2] + 1;
            //printf("ch1:%c, ch2:%c",ch1,ch2);
        }
    }
    int isAnagram = 1;
    for(i = 0 ; i < 26;i++)
    {
        //printf("(%d,%d)  ",compW1[i],compW2[i]);
        if(compW1[i]-compW2[i] != 0)
        {
            isAnagram = 0;
            break;
        }
    }
    if(isAnagram)
    {
        printf("it is anagram\n");
    }else {
        printf("it is not an anagram");
    }

    return 0;
}