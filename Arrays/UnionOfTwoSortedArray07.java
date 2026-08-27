public class UnionOfTwoSortedArray07 {
    public static void main(String[] args) {
        int[]a = {1,2,3,4,5};
        int[]b = {2,3,4,5,8};

        int i = 0;
        int j =0;

        while(i<a.length && j<b.length){

            if(a[i]<b[j]){
                System.out.print(a[i] +" ");
                i++;
                

            }else if(a[i]>b[j]){
                System.out.print(b[j] + " ");
                j++;
            }
            else
                {
                    System.out.print(a[i] + " ");
                    i++;
                    j++;

                }
            }
        

                while(i<a.length){
                    System.out.print(a[i] + " ");
                    i++;
                }
                while(j<b.length){
                    System.out.print(b[j] + " ");
                    j++;
                }
            }
        




        
    }
    
    

