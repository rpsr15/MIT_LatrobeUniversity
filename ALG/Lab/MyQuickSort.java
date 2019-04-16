
public class MyQuickSort {

    private int array[];
    private int length;

    public void sort(int[] inputArr) {

        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        this.array = inputArr;
        length = inputArr.length;
        quickSort(0, length - 1);
    }

    private void quickSort(int lowerIndex, int higherIndex) {
        System.out.println("lower is" + lowerIndex + "higer is" + higherIndex);

        int i = lowerIndex;
        int j = higherIndex;
        // calculate pivot number, I am taking pivot as middle index number
        int pivot = array[lowerIndex + (higherIndex - lowerIndex) / 2];
        System.out.println("Pivot is:" + pivot);
        // Divide into two arrays
        while (i <= j) {
            System.out.println("i: " + i + " j:" + j);
            /**
             * In each iteration, we will identify a number from left side which is greater
             * then the pivot value, and also we will identify a number from right side
             * which is less then the pivot value. Once the search is done, then we exchange
             * both numbers.
             */
            while (array[i] < pivot) {
                System.out.println("array[" + i + "]:" + array[i] + " < " + pivot);
                i++;
                System.out.println("increased i:" + i);
            }
            while (array[j] > pivot) {
                System.out.println("array[" + j + "]" + array[j] + " > " + pivot);
                j--;
                System.out.println("decresed j:" + j);
            }
            if (i <= j) {
                System.out.println("swapping i and j" + i + " " + j);
                exchangeNumbers(i, j);
                // move index to next position on both sides
                i++;
                j--;
            }
        }
        System.out.println("exiting while i:" + i + " j:" + j);
        // call quickSort() method recursively
        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);
    }

    private void exchangeNumbers(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String a[]) {

        MyQuickSort sorter = new MyQuickSort();
        int[] input = { 24, 2, 45, 20, 56 };
        sorter.sort(input);
        for (int i : input) {
            System.out.print(i);
            System.out.print(" ");
        }
    }
}