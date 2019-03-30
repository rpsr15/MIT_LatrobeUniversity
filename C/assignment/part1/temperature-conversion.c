/*
Author: Ravi Rathore
Purpose:
//how it is implemented
*/
#include <stdio.h>

int main(void)
{
    printf("**19539061 Ravi Rathore Assignment 1**");
    printf("\nJo4#XnM4\n");
    //printf("Please select the table you would like to create\n1. Celsius to Fahrenheit OR 2. Fahrenheit to celsius :");
    int input = 0;
    while (input != 1 && input != 2)
    {
        printf("Please select the table you would like to create\n1. Celsius to Fahrenheit OR 2. Fahrenheit to celsius :");
        scanf("%d", &input);
    }
    int start_temperature, end_temperature, step_size;

    printf("Please enter the starting temperture in Degree celsius: ");
    scanf("%d", &start_temperature);
    printf("Please enter the starting temperture in Degree celsius: ");
    scanf("%d", &end_temperature);
    printf("Please enter the step size of the table (1-99)");
    scanf("%d", &step_size);

    int temperature = start_temperature;
    float temperature_fahrenheit;
    while (temperature <= end_temperature)
    {

        temperature_fahrenheit = temperature * ((float)9 / 5) + 32;
        printf("%2d in degrees Celsius | %.2f degrees in Fahrenhiet\n", temperature, temperature_fahrenheit);
        temperature += step_size;
    }

    return 0;
}