import java.util.Arrays;
import java.util.Random;

public class Ecosystem{
   private Tile[][] tiles;
   private int  size;
   public Ecosystem(int size)
   {
       this.size = size;
       this.tiles = new Tile[size][size];
      // initialize empty tiles
       for(int i = 0 ; i < size; i++)
       {
           for(int j = 0; j < size; j++)
           {
               tiles[i][j] = new Tile();
           }
       }

       //generate bear
       int count = 0;
       while(count < 3)
       {
           //generate bear
           String name = "Bear"+count;
           Random rn = new Random();
           int range = (size-1) - 0 + 1;
           int randomX = rn.nextInt(range) + 0;
           int randomY = rn.nextInt(range) + 0;
           System.out.println("randomX"+randomX+" randomY "+randomY);
           if(tiles[randomX][randomY].isEmpty()){
               Creature newBear = new Bear(name);
               tiles[randomX][randomY].setCreature(newBear);
               count++;
           }

       }

       //generate fishes
       count = 0;
       while(count < 3)
       {
           String name = "Fish"+count;
           Random rn = new Random();
           int range = (size-1) - 0 + 1;
           int randomX = rn.nextInt(range) + 0;
           int randomY = rn.nextInt(range) + 0;
            if(tiles[randomX][randomY].isEmpty()){
               Creature newFish = new Fish(name);
               tiles[randomX][randomY].setCreature(newFish);
               count++;
           }
          

       }
   } 

   public void move()
   {
       for(int i = 0 ; i < size; i++)
       {
           for(int j = 0 ; j < size ; j++)
           {
               if(!tiles[i][j].isEmpty()){
                   //System.out.println(String.format("x,y: (%d, %d) name:%s",i,j,tiles[i][j].getCreature()));
                   Coordinates newCoordinates = nextTile(i,j,size);
                   int newX = newCoordinates.getX();
                   int newY = newCoordinates.getY();
                   //System.out.println(newX+" "+newY);
                   if(tiles[newX][newY].isEmpty())// new tile is empty, move the animal
                   {
                       Creature creature = tiles[i][j].getCreature();
                       tiles[newX][newY].setCreature(creature);
                       tiles[i][j].removeCreature();
                   }
                   else// not empty
                   {
                       System.out.println("is empty");
                   }


               }
           }
       }
   }

   private Coordinates nextTile(int x, int y, int size){
       int nextX=x,nextY=y;
       Random rn = new Random();
       if(rn.nextBoolean())
       {
          // System.out.println("moving row");
           if(y == 0){
               // can only move forward
                nextY = ++y;

           } else if(y == (size-1))
           {
               nextY = --y;
           }
           else if(rn.nextBoolean())
           {
               nextY = ++y;
           }
           else {
               nextY = --y;
           }

       }
       else {
           //System.out.println("moving column");
           if(x == 0){
               // can only move forward
                nextX = ++x;

           } else if(x == (size-1))
           {
               nextX = --x;
           }
           else if(rn.nextBoolean())
           {
               nextX = ++x;
           }
           else {
               nextX = --x;
           }

       }
       //System.out.println(String.format("Previous:(x,y):(%d, %d), NewValue:(%d,%d) ",x,y,nextX,nextY));
       Coordinates newCoordinates = new Coordinates(nextX,nextY);
       return newCoordinates;
   }

   public void printEcosystem()
   {
       for(int i = 0 ; i < size ; i++)
       {
           for(int j = 0 ; j < size ; j++)
           {    if(tiles[i][j] != null)
               System.out.print(tiles[i][j].getCreatureName());
               else 
               System.out.println("is null");
           }
           System.out.println();
       }
   }
}