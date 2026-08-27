public class IntersectionOfTwoSortedArray08 {
    public static void main(String[]args){
        int[]a = {1,2,3,4,5,8};
        int[]b = {2,3,4,5,8};

        int i = 0;
        int j = 0;

        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                i++;
            }
            else if 
                (a[i]>b[j]){
                    j++;

                }else{
                    System.out.print(a[i] + " ");
                    i++;
                    j++;
                }
                
            }
        }
    }
    

