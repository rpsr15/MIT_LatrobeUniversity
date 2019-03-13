#include<stdio.h>

int main(void)
{
    int int_value, second_int;
    float float_value, second_float;
    scanf("%d%f",&int_value, &float_value);
    printf("int_value:%d, float_value:%f",int_value, float_value);
    scanf("%d%f",&second_int,&second_float);
    printf("second_int:%d, second_float:%f",second_int, second_float);
    
    return 0;
}