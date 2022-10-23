public class array {
    public static void main(String[] args){
        //Creation and Implementation of 1D array
        System.out.println("1D Array");
        int[] a1 = new int[6];
        int count = 1;
        for(int i=0; i<a1.length; i++){
            a1[i]=count;
            count++;
        }
        for(int j=0; j<a1.length; j++){
            System.out.println(a1[j]+" ");
        }
        
        //Creation and Implementation of 2D array
        System.out.println("2D Array");
        count = 1;
        int[][] a2 = new int[3][4];
        for(int i=0; i<a2.length; i++){
            for(int j=0; j<a2[i].length; j++){
                a2[i][j]=count;
                count++;
            }
        }

        for(int i=0; i<a2.length; i++){
            for(int j=0; j<a2[i].length; j++){
                System.out.print(a2[i][j]+" ");
            }
            System.out.println();
        }
  }
}
