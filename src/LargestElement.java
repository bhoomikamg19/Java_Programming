public class LargestElement {
    static void main(String[] args) {
        int[] arr = {2,5,1,0,2};
        isLargestElement(arr);
    }

    private static void isLargestElement(int[] arr) {
        int max = arr[0];
        for (int i = 1; i <=arr.length-1 ; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
