/*
Author: Ravi Rathore
This program demonstrates calucation of resistance of different length wires. We have 
given cross sectional area, length and resistivity of nichrome, silver and tungsten.
Resistance = resistivity*(length/area)
Resistance has unit ohms, length in meters, area in m^2 and resistitvy in ohms meter
*/
#include <stdio.h>
/*
 * Function:  calculate_resistance 
 * takes cross sectional area, length and resistivity constant 
 *  returns: the resistance 
 */
double calculate_resistance(float, float, double);

int main()
{
    float area = 1E-6; // divide by 1000000 to convert mm^2 to m^2
    int length[10];
    double resistances[30];
    double resistivity_nichrome = 1.50E-6, resistivity_silver = 1.59E-8, resistivity_tungsten = 5.6E-8; // store double values in scientific notation
    int i = 0;

    for (i = 0; i < 10; i++)
    {
        length[i] = i + 1;
    }
    for (i = 0; i < 30; i = i + 3) // starting from index 0, every 3rd element belongs to nichrome
    {
        int index = i / 3; // it gives index from 0 to 9, since 30 pairs divided among 10 lengths
        resistances[i] = calculate_resistance(length[index], area, resistivity_nichrome);
    }
    for (i = 1; i < 30; i = i + 3) // starting from index 1, every 3rd element belongs to silver
    {
        int index = i / 3; // it gives index from 0 to 9, since 30 pairs divided among 10 lengths
        resistances[i] = calculate_resistance(length[index], area, resistivity_silver);
    }
    for (i = 2; i < 30; i = i + 3) // starting from index 2, every 3rd element belongs to tungsten
    {
        int index = i / 3; // it gives index from 0 to 9, since 30 pairs divided among 10 lengths
        resistances[i] = calculate_resistance(length[index], area, resistivity_tungsten);
    }
    printf(" Length |       Nichrome |        Silver |       Tungsten \n");
    for (i = 0; i < 30; i += 3)
    {
        printf("%7d | %.3e ohms | %.3eohms | %.3e ohms \n", length[i / 3], resistances[i], resistances[i + 1], resistances[i + 2]);
    }
    return 0;
}

double calculate_resistance(float length, float area, double resistivity)
{
    return (length / area) * resistivity;
}