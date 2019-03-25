/*
Author: Ravi Rathore
Purpose: The program demonstrates the equivalent resistance when two resistors are either places in series
or parallel. The value is mesaured in Ohms. In series, values are summed while in parallel the resultant
resistance value is ratio of product of two resistor and sum of two resistors
*/
#include <stdio.h> // standar input output library

int main(void)
{
    long int resistor1, resistor2;
    float equivalent = -1.0f;
    char configuration;

    printf("Please enter the value of resistor 1 in ohms:");
    scanf("%ld", &resistor1); //%ld is a specifier to store long int
    printf("Please enter the value of resistor 1 in ohms:");
    scanf("%ld", &resistor2); //%ld is a specifier to store long int

    printf("Are the resistors in series (s) or parallel (p)? ");
    // getchar is <wrrite what is getchar>
    // clear the input buffer. getchar returns the last value from the
    //input buffer that is in this case \n
    getchar();
    configuration = getchar();

    // checkif configuration is p or P if not go to next else if block
    if (configuration == 'p' || configuration == 'P')
    {
        // using formula for equivalent resistor in paralle, r_equivalent = (R1*R2)/(R1+R2)
        equivalent = (float)(resistor1 * resistor2) / (resistor1 + resistor2);
        printf("The equivalent resistor valur for the given in parallel is %.3f ohms\n", equivalent);
    }
    // check if configuration is s or S if not move to else block
    else if (configuration == 's' || configuration == 'S')
    {
        //equivalent resistor value in series is sum of two resistors
        equivalent = resistor1 + resistor2;
        printf("The equivalent resistor value for the given in series is %.3f ohms\n", equivalent);
    }
    else
    {
        //Display error message when invalid value of configutaion is provided
        printf("Input is incorrect\n");
    }

    return 0;
}