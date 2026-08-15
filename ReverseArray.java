public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = { 10,20,30,40,50};
        int l = 0;
        int r = arr.length-1;
        while(l<r){
            int x = arr[l];
            arr[l] = arr[r];
            arr[r] = x;

            l++;
            r--;
        }
        System.out.println("Reverse Array");
        

        for(int i = 0;i<arr.length-1;i++){
            System.out.println(arr[i] + "");
        }
        
    }
}
    

       
    


    
