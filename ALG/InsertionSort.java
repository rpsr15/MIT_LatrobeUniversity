public class InsertionSort{

    
    public static void main(String[] args)
    {
        System.out.println("Insertion sort");

        int[] a = {31, 41, 59, 26, 41, 58};
        for(int i = 0 ; i < a.length;i++)
        {
            int key = a[i];
            int j = i -1;
            while( j >= 0 && key < a[j])
            {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = key;
        }

        System.out.println("Sorted array");
        for(int i = 0 ; i < a.length; i++)
        {
            System.out.println(a[i]);
        }
    }
}