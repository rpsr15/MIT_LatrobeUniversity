//fine closest departure time

#include <stdio.h>
int main(void)
{

    int times[8][2]={{8*60, 10*60+16}, {9*60+43, 11*60+52}, {11*60+19,13*60+31}, {12*60+47,15*60},{14*60,16*60+8},
    {15*60+45,17*60+55}, {19*60,21*60+20},{21*60+45,23*60+58} };
    
    int hour,minute;
    int i = 0 ;
    
    printf("Enter a 24-hour time:\n");
    //read 13:15
    scanf("%d:%d", &hour, &minute);
    int userTime = hour*60 + minute;

    int minIndex = -1;
    int minDiff = 9999;
    for(i = 0; i < 8; i++)
    {
        int diff = (times[i][0] - userTime < 0 )?-(times[i][0]-userTime):times[i][0]-userTime;
        printf("%d ",diff);
        if(diff < minDiff)
        {
            minIndex = i;
            minDiff = diff;
        }
    }
    printf("Closest departure time is %d:%d, arriving at %d:%d\n ",times[minIndex][0]/60,times[minIndex][0]%60,times[minIndex][1]/60,times[minIndex][1]%60);

    

    return 0;
}