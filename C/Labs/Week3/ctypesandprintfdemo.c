/*
This program will demonstrate the use of types,
printf(), and format specifier in C programs
*/
#include <stdio.h> //standard input and output library

int main(void)
{
    //printf is a library function which is used to send information(variables) to standard output
    printf("This program will demonstrate the use of types\n");
    printf("and printf() in \"C programs\"\n");

    int a = 5;
    //% notation is called a format specifier.%d tells printf() to print an integer.
    printf("The variable a is of type int and has value %d\n", a);

    /* int type represent an integer i.e a number without decimal value. float is used to represent
     numbers with decimal value, char is keyword used to declare character type and it is basically 
    an integer but not used to store int as it has restricted size.
    */
    float b = 5.5;
    char c = 'T';
    //% notation is called a format specifier.%f tells printf() to print a float value.
    printf("The variable b is of type float and has value %.2f\n", b);
    //%c tells printf() to print a char value.
    printf("The variable c is of type char and has value %c\n", c);

    printf("%d + %.2f = %.2f\n", a, b, a + b);
    printf("%d - %.2f = %.2f\n", a, b, a - b);
    printf("%d * %.2f = %.2f\n", a, b, a * b);
    printf("%d / %.2f = %.2f\n", a, b, a / b);

    int d = 6;
    b = b + a / d;
    /* operator '/' has precedence over + , so  a / d is calculated first,
    which is an integer operation and results in 0. 0 + b gives b.*/
    //printf("The valud of b is now %.2f \n", b);

    //type casting to float
    b = b + (float)a / d;
    /* explicit type case of int to float forces compiler
    to perform float operation between a and d.*/
    printf("The value of b is now %f \n", b);

    return 0;
}