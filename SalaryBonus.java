import java.util.Scanner;

public class SalaryBonus{
    public static void main(String[] args) {
        System.out.println("Bonus calculator\n");

        int salary;
        System.out.println("Enter salary");
        Scanner sc= new Scanner(System.in);
        salary=sc.nextInt();
        if(salary<=1000){
            
            salary=salary+1500;
            
        }else{
            salary=salary+1000;
           
        }
        System.out.println("new salary is:"+salary);
        


    }
}