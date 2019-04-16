public class Test {
    public static void main(String[] args) {
        int[] input = { 78, 89, 41, 77, 84, 65, 98, 63, 30, 98, 46, 16, 71, 10, 27, 50, 93, 97, 47, 49 };
        int pivot = input[0];
        int left = 0, right = input.length - 1;
        System.out.println("this is");
        while (left < right) {
            // System.out.println("here");
            System.out.println(input[left] + " " + input[right]);
            // System.out.println("here");
            while (input[left] <= pivot) {
                left++;
            }
            while (input[right] >= pivot) {
                right--;
            }
            // swap
            if (left < right && input[left] > input[right]) {
                int temp = input[left];
                input[left] = input[right];
                input[right] = temp;
                right--;
            }
            System.out.println("loop");

            for (int i = 0; i < input.length; i++) {
                System.out.print(input[i] + " ");
            }

        }
        System.out.println("final");
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
    }
}