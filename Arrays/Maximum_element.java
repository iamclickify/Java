package Arrays;

public class Maximum_element {
    static void main() {
        int[] arr = {-2,52,3,242,23,-52,67,53};
        int max = Integer.MIN_VALUE;
        for (int i =0;i<arr.length;i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
