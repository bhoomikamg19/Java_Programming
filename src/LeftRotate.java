public class LeftRotate {
    static void main(String[] args) {
        int[] arr = {5,1,2,3,4};
        doLeftRotate(arr);
    }

    private static void doLeftRotate(int[] arr) {
        int first = arr[0];
        for (int i=0; i<arr.length-1;i++){
                arr[i] = arr[i+1];
        }
        arr[arr.length-1] = first;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
