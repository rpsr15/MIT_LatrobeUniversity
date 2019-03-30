#include <stdio.h>
int main(void)
{
    int a = 11, b = -20;
    a = (a < 0) ? -a : a;
    b = (b < 0) ? -b : b;
    int c = (a < b) ? a : b;
    printf("%d", c);
    return 0;
}