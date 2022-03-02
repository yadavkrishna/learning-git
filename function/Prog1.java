package function;

public class Prog1 {
    public static void main(String[] args) {
     String name="krish";
     change(name);  /*//output is krishna not krish bcoz of pass by value 
     change (name ) name is refrence to naam thats why*/
    }

    // static void swap(int a, int b){
    //     System.out.println("before swap"+a+ " "+b);
    //     int temp=a;
    //     b=a;
    //     b=temp;
        
    //     System.out.println("after swap "+a+ " "+b);
    // }

    // java is pass by value only as u can see 
    static void change(String naam){

        naam="krishna";
        System.out.println(naam);
    }
    
}
