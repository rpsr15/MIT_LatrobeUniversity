/*
Author: Ravi Rathore
This program demonstrates the velocity and pressure at the ends of water pipe system. it uses equation 
of continuity to calculate velocity i.e v2 = (A1/A2)*v1
the pressure at the ends is calculated using bernolli's theorem
*/
#include <stdio.h>

/*
 * Function:  calculate_velocity 
 * takes previous velocity and diameters of the both ends
 *  returns: the velocity at the other end of pipe
 */
float calculate_velocity(float, int, int);

/*
 * Function:  calculate_pressure 
 * take previous pressure and height sof the both ends
 *  returns: the pressure at the other end of pipe
 */
float calculate_pressure(float, float, float, int, int);

int main()
{
    int diameters[7];
    int heights[7];
    printf("Enter the diameters of the 7 segments of the pipe (cm):\n");
    int i = 0;
    for (i = 0; i < 7; i++)
    {
        scanf("%d", &diameters[i]);
    }
    printf("Enter the heights of the 7 segments of the pipe (m):\n");
    for (i = 0; i < 7; i++)
    {
        scanf("%d", &heights[i]);
    }

    float initial_velocity, initial_pressure;
    printf("Enter the waters speed into the first segment (m/s):\n");

    scanf("%f", &initial_velocity);
    printf("Enter the waters gauge pressure in the first segment (kPa):\n");
    scanf("%f", &initial_pressure);

    float current_velocity, current_pressure;
    float previous_velocity = initial_velocity, previous_pressure = initial_pressure;
    i = 0;
    if (previous_pressure > 0)
        printf("segment %d: %-6.3fm/s, %6.3f kPa\n", i + 1, previous_velocity, previous_pressure);
    else
    {
        printf("Invalid segment\n");
        i = 7;
    }

    for (i = 1; i < 7; i++)
    {
        current_velocity = calculate_velocity(previous_velocity, diameters[i - 1], diameters[i]);
        current_pressure = calculate_pressure(previous_pressure, previous_velocity, current_velocity, heights[i - 1], heights[i]);
        if (current_pressure <= 0)
        {
            printf("segment %d is invalid\n", i + 1);
            i = 7;
        }
        else
        {
            printf("segment %d: %-6.3fm/s, %6.3f kPa\n", i + 1, current_velocity, current_pressure);
            previous_velocity = current_velocity;
            previous_pressure = current_pressure;
        }
    }

    return 0;
}

float calculate_velocity(float previous_velocity, int previous_diameter, int current_diameter)
{
    float previous_radius = ((float)previous_diameter / 2) / 100; // divide by 100 to convert into meters
    float current_radius = ((float)current_diameter / 2) / 100;   // dividee by 100 to convert into meters

    float previous_radius_squared = previous_radius * previous_radius;
    float current_radius_squared = current_radius * current_radius;
    float current_velocity = (previous_radius_squared / current_radius_squared) * previous_velocity; //using continuity formula mentioned on top
    return current_velocity;
}

float calculate_pressure(float previous_pressure, float previous_velocity, float current_velocity, int previous_height, int current_height)
{
    previous_pressure = previous_pressure * 1000 + 101325; // convert  to acrual pressure i.e 1 atm = 101325Pa
    float current_pressure = previous_pressure;
    current_pressure += 0.5 * 1000 * (previous_velocity * previous_velocity - current_velocity * current_velocity); // density of water 1000 kg/m^3
    current_pressure += 1000 * 9.8 * (previous_height - current_height);                                            // g = 9.8m/s^2
    current_pressure = (current_pressure - 101325) / 1000;                                                          // change back tp gauge pressure and to Kilo so divide by 1000                                                       //subtract 1 atmosphere pressure and convert to kPa
    return current_pressure;
}