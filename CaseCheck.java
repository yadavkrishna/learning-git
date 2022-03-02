import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        // char ch=sc.next().trim().charAt(0);

        // if(ch>='a' && ch<='z'){
        //     System.out.println("Char is LowrCase: "+ch);
        // }else{
        //     System.out.println("Char is UpperCase:"+ch);
        // }

        //febonaic series
        

        // int n=sc.nextInt();
        // int prev=0;
        // int i=1;
        // int count=2;
        // while(count<=n){
        //     int temp=i;
        //     i=i+prev;
        //     System.out.print(i);
        //     System.out.println();
        //     prev=temp;
        //     System.out.print(prev);
        //     count++;
        // }
        // System.out.println("Index or nth num of series is:"+i);
    
        //find reoccurence count nums
        // System.out.println("Enter any number series:");
        // int n=sc.nextInt();
        // System.out.println("Enter no to find :");
        // int fn=sc.nextInt();
        // int tempN=n;

        // int count=0;
        // while(tempN>0){
        //     int rem=tempN%10;
        //     if(rem==fn){
        //         count++;
        //     }
        //     tempN=tempN/10;
        // }
        // System.out.println("Number is:"+n);
        // System.out.println("occurence of num is: "+count);


        /******reverse number****** */

        System.out.println();

        int n=123456;
        // String rn="";
        // while(n>0){
        //     int rem=n%10;
        //     rn=rn+rem;
        //     n=n/10;
        // }
        // System.out.println("reverse of num is: "+rn);

        int rn=0;
            while(n>0){
                int rem=n%10;
                rn=rn*10+rem;
                n=n/10;
            }
            System.out.println("reverse of num is: "+rn);

    }
    
}
