package Arrays;

public class Second_maximum {
    static void main() {
        int[] arr = {4,10,10,6,3,8};
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;

        // Maximum value
        for (int i=0;i<arr.length;i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);

        // Second maximum value
        for (int i=0;i<arr.length;i++){
            if (arr[i] > smax && arr[i] != max){
                smax = arr[i];
            }
        }
        System.out.println(smax);
    }
}
