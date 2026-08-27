public class MoveAllNegativeElementsToOneSideOfArray06 {
    public static void main(String[]args){
        int[]arr ={1,-2,3,-4,-5,6,7,-8};
        int j = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]<0){
                if(i!=j){
                int index=arr[i];
                arr[i]=arr[j];
                arr[j]=index;

                j++;
            }
        }
    }
        System.out.println("array after moving negative elements:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
    
    }
    
}
}
