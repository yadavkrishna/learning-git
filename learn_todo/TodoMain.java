package learn_todo;

import learn_todo.Todo;
import java.util.ArrayList;
import java.util.Date;
public class TodoMain {
    public static void main(String[] args) {
        //Create todo class obj
        // Todo t1=new Todo("to learn Dsa", new Date());

        // Todo t2=new Todo("Learn theory ", new Date());

        //creating a list of todo  
        ArrayList<Todo> al=new ArrayList<>();
        Todo t1=new Todo("learn todo ", new Date());
        Todo t2=new Todo("almost done in todo", new Date());
        al.add(t1);
        al.add(t2);
        System.out.println("Size of arraylist is: "+al.size());
        System.out.println("Content in TODO Arraylist:\n"+al);
    }
}
