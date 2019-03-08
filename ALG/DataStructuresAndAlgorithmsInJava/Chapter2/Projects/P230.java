//Write a java program that inputs a document and then outputs a bar-chart plot of the frequencies of each alphabet character that appears within that document
import java.util.Scanner;
import java.io.File;

public class P230{
    public static void main(String[] args)
    {
        int[] counts=new int[26];
        String fileName = "";
        Scanner fileInput = null;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter filename:");
        fileName = input.nextLine();
        System.out.println("Opening file"+fileName);
        try
        {
            fileInput = new Scanner(new File(fileName));
            while(fileInput.hasNext()){
                //System.out.println(fileInput.next());
                char[] mychars = fileInput.next().toLowerCase().toCharArray();
                for(int i = 0 ; i < mychars.length; i++){
                    
                    int val = (mychars[i]-97);
                    if(val >=0)
                    {
                        counts[val]++;
                    }
                    
                }
            }
            for(int i = 0 ; i < counts.length; i++)
            {
                System.out.println((char)(i+97)+": "+counts[i]);
            }

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally{
            if(fileInput != null){
                fileInput.close();
            }
        }
    }

}