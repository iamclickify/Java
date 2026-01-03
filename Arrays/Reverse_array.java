package Arrays;

public class Reverse_array {
    static void main() {
        int[] arr = {6,4,2,3,5,8};
        int i = 0;
        int n = arr.length;
        int j = n-1;

        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (int ele : arr){
            System.out.print(ele + " ");
        }

    }
}
