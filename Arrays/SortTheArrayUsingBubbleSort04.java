import java.util.*;

public class SortTheArrayUsingBubbleSort04 {
    public static void main(String[] args){
        int[]arr={29,33,45,67,87,12};

        for(int i = 0;i<arr.length-1;i++){
            for(int j = 0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int index = arr[j];
                    arr[j+1] = arr[j];
                    arr[j+1] = index;
                }

            }
        }
        System.out.println(Arrays.toString(arr));

    }
    
}
