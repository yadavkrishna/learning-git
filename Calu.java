import java.util.Scanner;

public class Calu {
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
        int ans=0;
        System.out.println("Calulator");
        while(true){
            System.out.println("***********************************");
            System.out.println("\nEnter operation you want to do");
            System.out.println(" + - * / % ");
            System.out.println("Enter x to exit\n");
            System.out.println("Enter operator:");
            char op=sc.next().trim().charAt(0);
            if(op=='+'|| op=='-' || op=='*' || op=='/' || op=='%'){
                //int nums
                System.out.println("Enter num1");
                int n1=sc.nextInt();
                System.out.println("Enter num 2");
                int n2=sc.nextInt();

                if(op=='+'){
                    ans=n1+n2;
                }
                if(op=='-'){
                    ans=n1-n2;
                }
                if(op=='*'){
                    ans=n1*n2;
                }
                if(op=='/'){
                    if(n2<1){
                        System.out.println("no not divisible by 0");
                        continue;
                    }
                    ans=n1/n2;
                }
                if(op=='%'){
                    ans=n1%n2;
                }
                
                

            }else if(op=='x' || op=='X'){
                System.out.println("thanks for using calu");
                break;
            }else{
                System.out.println("Invalld operation");
            }
            System.out.println("Ans is: "+ans+"\n\n");
            


            
        }
    }
}
