package Arrays;

public class LinearSearch {
    static void main() {
        int[] arr = {0,9,23,256,34,-1,29,-2};
        int target = 23;
        boolean flag = false;
        for (int i=0;i<arr.length;i++){
            if (arr[i] == target){
                flag = true;
                break;
            }

        }
        if (flag){
            System.out.println("Target exists");
        }
        else System.out.println("Target missing");
    }
}
