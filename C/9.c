#include <stdio.h>
#include <stdio.h>

#define SIZE 10



int main(void)
{
    char c='A', map[SIZE][SIZE];
    int i = 0,j = 0,up=0,down=0,right=0,left=0; 
    map[i][j] = c;

    for(i=0; i < SIZE; i++)
    {
        for(j=0 ; j<SIZE; j++)
        {
           map[i][j] = '.';
        }
        printf("\n");
    }
    map[0][0] = c;
    i = j = 0;
    srand((unsigned)time(NULL));
    for(c ='B' ; c <= 'Z' ; c++)
    {
        printf("printing %c\n",c);
        up = down = right = left = 0;
        //0 cant move , 1 can move
        printf("i:%d, i-1:%d,j:%d,map[i-1][j]:%c\n",i,i-1,j,map[i-1][j]);
        if(i-1 >= 0 && map[i-1][j] == '.')//check if you can move up
        {
            
            up = 1;
        }
        printf("i:%d,j+1:%d, map[i][j+1]:%c\n",i,j+1,map[i][j+1]);
        if(j+1 < SIZE && map[i][j+1] == '.')// check if you can move right
        {
            printf("can move right\n");
            right = 1;
        }
        if(i+1 < SIZE && map[i+1][j] == '.')// check if you can move down
        {
            down = 1;
        }
        printf("i:%d,j-1:%d, map[i][j-1]:%c\n",i,j-1,map[i][j-1]);
        if(j-1 >= 0 && map[i][j-1] == '.')//check if you can move left
        {
            printf("can move left\n");
            left = 1;
        }


        if(up+down+left+right == 0){
            //no place to move 
            printf("cant move breaking the loop\n");
            break;
        }
        printf("up:%d,right:%d,down:%d,left:%d\n",up,right,down,left);
        int randomMove = rand()%4;
        printf("random move %d\n",randomMove);


        switch(randomMove)
        {
            case 0:{
                if(up == 1)
                {
                    printf("going up\n");
                    map[i-1][j] = c;
                    i = i - 1;
                    break;
                }
            }
            case 1:
            {   if(right == 1){
                printf("goin right\n");
                map[i][j+1] = c;
                j = j +1 ;
                break;
                }
            }
            case 2:
            {
                if(down == 1)
                {
                    printf("goin down\n");
                    map[i+1][j] = c;
                    i = i +1;
                    break;
                }
            }
            case 3:
            {   if(left == 1)
                {
                    printf("goin left\n");
                map[i][j-1] = c;
                j = j - 1;
                break;
                }
                
            }
            default:
            printf("error default case selected\n");
            
        }
        // if(up == 1)
        // {
        //     printf("going up\n");
        //     map[i-1][j] = c;
        //     i = i - 1;
        //     continue;
        // }
        // if(right == 1)
        // {
        //     printf("goin right\n");
        //     map[i][j+1] = c;
        //     j = j +1 ;
        //     continue;
        // }
        // if( down == 1)
        // {
        //     printf("goin down\n");
        //     map[i+1][j] = c;
        //     i = i +1;
        //     continue;
        // }
        // if(left == 1){
        //     printf("goin left\n");
        //     map[i][j-1] = c;
        //     j = j - 1;
        //     continue;
        // }
        


        
    }

    for(i=0; i < SIZE; i++)
    {
        for(j=0 ; j<SIZE; j++)
        {
            printf("%c",map[i][j]);
        }
        printf("\n");
    }

    
    return 0;
}