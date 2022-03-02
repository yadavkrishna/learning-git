import java.util.Scanner;

public class IsArmstrongNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        if(isArmstrongNum(n)){
            System.out.println("Entered num is Armstrong number");
        }else{
            System.out.println("Entered num is not Armstrong number");
        }
       
        
    }
    static boolean isArmstrongNum(int m)
    {
        int original=m;
        int sum=0;
        while(m>0)
        {
            int rem=m%10;
            sum=sum+(rem*rem*rem);
            m=m/10;


        }
        // if(original==sum){
        //     return true;
        // }else{
        //     return false;
        // }
        return original==sum;
        
    }
}
