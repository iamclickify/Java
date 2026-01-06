package L3_Arrays;

public class MergeTwoSortedArrays {

    public static void main(String[] args) {
        int[] a = {1, 2, 7, 8};
        int[] b = {3, 5, 6, 9, 10};
        int[] c = new int[a.length + b.length];

        merge(c, a, b);

        for (int ele : c) {
            System.out.print(ele + " ");
        }
    }

    public static void merge(int[] c, int[] a, int[] b) {
        int i = 0, j = 0, k = 0;

        // merge while both arrays have elements
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
            k++;
        }

        // copy remaining elements of a
        while (i < a.length) {
            c[k] = a[i];
            i++;
            k++;
        }

        // copy remaining elements of b
        while (j < b.length) {
            c[k] = b[j];
            j++;
            k++;
        }
    }
}
