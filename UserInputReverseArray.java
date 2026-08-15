import java.util.Scanner;

public class UserInputReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("enter array elements:");
        for(int k=0;k<arr.length;k++){
            arr[k]=sc.nextInt();
        }
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            int index = arr[i];
            arr[i] = arr[j];
            arr[j] = index;
            i++;
            j--;
        }
        System.out.println("reverse array");
        for(int k =0;k<arr.length-1;k++){
            System.out.println(arr[k] + " ");
              }
        
    }
    
}
