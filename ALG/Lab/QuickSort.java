import java.util.ArrayList;
import java.util.List;

public class QuickSort {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(10);
        nums.add(2);
        nums.add(33);
        nums.add(4);
        nums.add(20);
        nums.add(22);
        nums.add(63);
        nums.add(40);
        sort(nums, 0, nums.size() - 1);
        System.out.println(nums);

    }

    public static void sort(List<Integer> list, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(list, left, right);
            sort(list, left, pivotIndex - 1);
            sort(list, pivotIndex + 1, right);

        }

    }

    public static void swap(List<Integer> list, int left, int right) {
        Integer temp = list.get(right);
        list.set(right, list.get(left));
        list.set(left, temp);
    }

    public static int partition(List<Integer> list, int left, int right) {
        int pivot = list.get(right);
        int i = left;
        int j = right - 1;

        while (i <= j) {
            while (i <= j && list.get(i) < pivot) {
                i++;
            }
            while (i <= j && list.get(j) > pivot) {
                j--;
            }
            if (i <= j) {
                swap(list, i, j);
                i++;
                j--;
            }
        }
        // swap j with pivot
        swap(list, i, right);
        return i;

    }
}