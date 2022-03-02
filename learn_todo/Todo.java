package learn_todo;
import java.util.Date;
public class Todo {
    //variables
    String todo;
    Date created_on;

    //constructor
    public Todo(String text, Date time){
        this.todo=text;
        this.created_on=time;
    }

    // setters to set data
    public void set_todo_text(String text){
        this.todo=text;
    }
    public void set_created_on(Date time){
        this.created_on=time;
    }
    //getters to get data 
    public String get_todo_text(){
        return todo;
    }
    public Date get_created_time(){
        return created_on;
    }

    //to ToString to display data
    public String toString(){
        return "Todo:"+todo+ ", created on:  "+created_on+" \n";
    } 
}
