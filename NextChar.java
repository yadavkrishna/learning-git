import java.util.Arrays;

public class NextChar {
    public static void main(String[] args) {
        char[] ar={'k','r','i','s','h'};

        char target='k';
        char ans=nextChar(ar,target);
        System.out.println(ans);
    }
    static char nextChar(char[] a, char target){
        int start=0;
        int end=a.length-1;

        while(start<=end)
        {
            int mid=start+(end-start)/2;
             if(target< a[mid])
            {
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return a[start%a.length];
    }

}
