import java.util.ArrayList;
import java.util.Date;

public class TodoMain {
    public static void main(String[] args) {
    System.out.println("*** Welcome to TODO ***\n");
    ArrayList<TodoEg> al=new ArrayList<>();

        //create todo
        TodoEg todo=new TodoEg("to complete todo App", new Date());
        TodoEg t1=new TodoEg("Also learn theory for exam", new Date());
        TodoEg t2=new TodoEg("Learning git", new Date());

    al.add(todo);
    al.add(t1);
    al.add(t2);

    //print data using simple sysout
    // System.out.println("Content of todo: \n"+al); 
    
    //using foreach loop
    for (TodoEg todoEg : al) {
        System.out.println(todoEg);
    }
   
    }
}
