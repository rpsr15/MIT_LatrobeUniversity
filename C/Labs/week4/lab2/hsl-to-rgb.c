/*
Author: Ravi Rathore
Purpose: This program converts HSL color representation into RGB representation.
*/
#include <stdio.h>
#include <math.h>

int main(void)
{
    unsigned int hue, saturation_in, lightness_in, red, blue, green;
    float saturation, lightness;
    printf("Please enter the hue (0 - 360 degrees: ");
    scanf("%u", &hue);
    printf("Please enter the saturation (0 - 100%%: ");
    scanf("%u", &saturation_in);
    printf("Please enter the lightness ( 0 - 100%%): ");
    scanf("%u", &lightness_in);

    //checking the values
    printf("CHECK: hue = %u, saturation_in = %u, lightness_in = %u\n", hue, saturation_in, lightness_in);
    //converting saturation and lightness into percentage
    saturation = saturation_in / 100.0F;
    lightness = lightness_in / 100.0F;
    printf("CHECK: saturation = %f, lightness = %f\n", saturation, lightness);

    float c, x, temp, m, red_dash, green_dash, blue_dash;
    //use mathematical formula to find 2*lightness - 1
    temp = 2 * lightness - 1;

    //find absolute value of temp
    temp = (temp > 0) ? temp : -temp;
    c = (1 - temp) * saturation;
    printf("CHECK: c = %f\n", c);

    temp = fmod(hue / 60.0, 2) - 1;
    //find absolute value of temp
    temp = (temp > 0) ? temp : -temp;

    x = c * (1 - temp);
    m = lightness - (c / 2);
    printf("CHECK: x = %f, m = %f\n", x, m);

    //red_dash, green_dash and blue_dash differs on value of hue(i.e every 60 degrees)
    // so we divide by 60 and find which range it belongs to
    int temp_hue = hue / 60;

    if (temp_hue == 0)
    {
        red_dash = c;
        green_dash = x;
        blue_dash = 0;
    }
    else if (temp_hue == 1)
    {
        red_dash = x;
        green_dash = c;
        blue_dash = 0;
    }
    else if (temp_hue == 2)
    {
        red_dash = 0;
        green_dash = c;
        blue_dash = x;
    }
    else if (temp_hue == 3)
    {
        red_dash = 0;
        green_dash = x;
        blue_dash = c;
    }
    else if (temp_hue == 4)
    {
        red_dash = x;
        green_dash = 0;
        blue_dash = c;
    }
    else if (temp_hue == 5)
    {
        red_dash = c;
        green_dash = 0;
        blue_dash = x;
    }

    printf("CHECK: red_dash = %f, green_dash = %f, blue_dash = %f\n", red_dash, green_dash, blue_dash);

    // round the float value to nearest unsigned int
    red = round((red_dash + m) * 255);
    blue = round((green_dash + m) * 255);
    green = round((blue_dash + m) * 255);
    printf("HSL= %d, %f, %f\n", hue, saturation, lightness);
    printf("RGB = %u %u %u\n", red, blue, green);
    return 0;
}