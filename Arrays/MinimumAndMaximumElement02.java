public class MinimumAndMaximumElement02 {
    public static void main(String[] args) {
        int[]arr={10,20,30,40,50};
        int min=arr[0];
        int max=arr[0];

        for(int i = 1;i<arr.length-1;i++){
            if(arr[i]<min){
                min =arr[i];

            }
            
                if(arr[i]>max){
                   max=arr[i];
                }
            }
            System.out.println("minimum =" + min);
            System.out.println("maximum =" + max);
            
            
        }
    }
    

