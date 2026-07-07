public class CheckSort {
    static void main(String[] args) {
        int[] arr = {2,4,5,6,1};
        boolean res = isSorted(arr);
        if (res){
            System.out.println("Array is Sorted");
        }
        else
            System.out.println("Array is Not Sorted");

    }

    private static boolean isSorted(int[] arr) {
        boolean ans = true;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                ans = false;
                break;
            }
        }
        return ans;
    }
}
