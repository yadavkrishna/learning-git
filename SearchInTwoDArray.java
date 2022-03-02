import java.util.Arrays;

public class SearchInTwoDArray {
    public static void main(String[] args) {
        int[][] arr={
                        {54,2,67,8,76,12},
                        {23,45,68,9},
                        {11,5,98,24,83}
                    };

        int target=12;
        int[] ans=search(arr,target);
       
        System.out.println("Target element is at: "+Arrays.toString(ans));
    }

    static int[] search(int[][]ar, int target){
        
        for(int row=0; row<ar.length; row++)
        {
            for(int col=0;col<ar[row].length;col++)
            {
                if(ar[row][col]==target)
                {
                    return new int[] {row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
