public class BinarySearch {
    public static void main(String[] args){
        int arr[]={10,20,30,40,50};
        int target = 30;
         int low = 0;
        int high = arr.length-1;
        int mid;
        while(low<=high){
            mid = (low+high)/2;
            if (arr[mid]== target) {
                System.out.println("element found at index" + mid);
                break;

            } else if (arr[mid]>target){
                high=mid-1;

            } else{ 
                low=mid+1;
            }
              
        }

    }
    
}
