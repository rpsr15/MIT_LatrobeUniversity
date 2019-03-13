#include<stdio.h>
#define SIZE 99

int main(void)
{
    int size = 0,x=0,y=0,i=0,j=0,number=1;
    printf("Enter size of magic square");
    scanf("%d", &size);
    int square[SIZE][SIZE]={0};
    
    y= size / 2;
    square[x][y]= number++;
    while(number<=size*size)
    {
        int nextX = ((x-1)>=0)?x-1:size-1;
        int nextY = ((y+1 <= size - 1))?y+1:0;
        if(square[nextX][nextY] == 0){//not occupied
            square[nextX][nextY] = number++;
            x = nextX;
            y = nextY;
        }else{// occupied so put just below
            int nextX = (x+1 <= size-1)?x+1:0;
            square[nextX][y]=number++;
            x = nextX;
        }
        
    }

    for(i=0; i < size;i++)
    {
        for(j=0;j<size;j++)
        {
            printf("%d ",square[i][j]);
        }
        printf("\n");
    }
    return 0;
}