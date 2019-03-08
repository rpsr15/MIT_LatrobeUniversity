public class InsertionSortV2{

    
    public static void main(String[] args)
    {
        int a[]= {31,41,59,26,41};
        for(int i=1 ; i < a.length ; i++)
        {
            int key = a[i];
            int j = i - 1;
            System.out.println(j+", a[j]"+a[j]+", a[j+1]"+a[j+1]);
            while ( j>= 0 && key > a[j] ){
                System.out.println("hello");
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = key;
        }

        for(int i = 0 ; i < a.length; i++)
        {
            System.out.println(a[i]);
        }
    }
}