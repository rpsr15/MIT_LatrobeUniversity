#include <stdio.h>
int main()
{
    int myArray[7] = {1, 2, 8, 7};
    printf("test %d\n", myArray[4]);
    int num[4] = {0};
    int count = 0;
    while (count < 8)
    {
        char ch = getchar();
        if (ch >= 'A' && ch <= 'D')
        {
            num[ch - 'A']++;
        }
        else
        {
            break;
        }
        ++count;
    }
    int i;
    for (i = 0; i < 4; ++i)
    {
        num[i] *= 2;
    }
    printf("%d %d %d %d", num[0], num[1], num[2], num[3]);
    return 0;
}