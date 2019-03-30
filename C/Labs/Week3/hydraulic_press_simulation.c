/*
    Author: Ravi Rathore, 19539061
    Purpose: This program demonstrates the simulation of hydraulic press which has two pistons, one smaller than
    the other one. Force appiled to piston with smaller area generates significantly larger force in proportion
    to the ratio of area(area_output/area_input). Thereby making sure that pressure at both ends is same. 
*/

#include <stdio.h> // standard input and output library

int main(void)
{
    int force_input = 2, radius_input = 1, radius_output = 5, force_output;
    double pi = 3.14159265;
    float distance_input = 2.5f, distance_output, pressure_input, pressure_output, area_input, area_output;

    //calculate area of the input and output using formual area = Pi * radius * radius
    area_input = pi * radius_input * radius_input;
    area_output = pi * radius_output * radius_output;

    //calculating pressure_input using formual  p = F / A in milliPa(multiply by 1000)
    //where F is force_input and A is area_input
    pressure_input = (force_input / area_input) * 1000;

    //calculating force_output  using formula force_output = (area_output/area_input)*force_input
    force_output = (area_output / area_input) * force_input;

    //calculating pressure_output in milli Pacal(multiply by 1000)
    //using formual pressure_output = force_output/area_output
    pressure_output = (force_output / area_output) * 1000;

    //calculating distance_output using formula
    //distance_output = distance_input*force_input/force_output
    distance_output = distance_input * force_input / force_output;

    printf("Input\nF = %dN, A = %.3lfm^2, P = %.3fmPa, d = %.3fm\n", force_input, area_input, pressure_input, distance_input);
    printf("Output\nF = %dN, A = %.3lfm^2, P = %.3fmPa, d = %.3fm\n", force_output, area_output, pressure_output, distance_output);

    return 0;
}