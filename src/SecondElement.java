public class SecondElement {
    static void main(String[] args) {
        int[] arr = {2,4,6,1,13,5};
        int small = isSecondSmall(arr);
        int large = isSecondLarge(arr);
        System.out.println("Second Smallest: " + small);
        System.out.println("Largest Smallest: " + large);
    }

    private static int isSecondLarge(int[] arr) {
        int large = Integer.MIN_VALUE;
        int s_large = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>large){
                s_large = large;
                large = arr[i];
            } else if (arr[i] > s_large) {
                s_large = arr[i];
            }
        }
        return s_large;
    }

    private static int isSecondSmall(int[] arr) {
        int small = Integer.MAX_VALUE;
        int s_small = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<small){
                s_small = small;
                small = arr[i];
            } else if (arr[i]<s_small) {
                s_small = arr[i];
            }
        }
        return s_small;
    }
}
