#include<stdio.h>
int main(void)
{
    int int_value, num;
    float float_value;
    num = scanf("%d%f", &int_value, &float_value);
    printf("num=%d, int_value=%d, float_value=%f\n",num,int_value,float_value);
    return 0;
}