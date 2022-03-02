package function;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        // swapnum(1,2);
        // /**swaping not happing bvoz of pass by value rule
        //  * before swap12
        //     after swap11       * 
        //  * * */

        int[] arr={10,20,30,40};
        change(arr);
        System.out.println(Arrays.toString(arr));
        /**
         * static void change(int[] arr){
        arr[3]=99;
         * here value is change bcoz value is pass in primitiv data type pass by value change value 
         * [10, 20, 30, 99]
         * why pass by referenc is not bcoz java dont have pointers
         * 
         * but in string its not possible
         * 
         */


            String name="krish";
            show(name);
    }

    static void change(int[] arr){
        arr[3]=99;
    }

    static void swapnum(int a, int b ){
        System.out.println("before swap"+a+""+b);
        int temp=a;
        a=b;
        temp=;
        System.out.println("after swap"+a+""+b);
    }
    
    static void show(String naam){
        naam="eric";
        System.out.println(naam);
    }
}
