import java.util.Arrays;

public class kthMinAndMaxElement03 {
    public static void main(String[] args) {

        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;

        Arrays.sort(arr);

        int kthMin = arr[k - 1];
        int kthMax = arr[arr.length - k];

        System.out.println("Kth Minimum = " + kthMin);
        System.out.println("Kth Maximum = " + kthMax);
    }
}
    

