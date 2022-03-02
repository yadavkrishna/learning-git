import java.util.Date;

//model or bean class or entity
public class TodoEg{
     
        //data members for class todo
        String todo;
        Date created_on;

        
        //construstor to initalise obj wehne needed
        TodoEg(String s, Date time){
            this.todo=s;
            this.created_on=time;
        }

        // setters
        public void set_todo(String todo){
            this.todo=todo;
        }
        public void set_time(Date time){
            this.created_on=time;
        }

        //getter
        public String get_todo(){
            return todo;
        }
        public Date get_time(){
            return created_on;
        }
        


        //to display data we need toString method
        public String toString(){
            
           return  " Todo : "+todo+" , created on: "+created_on+"\n";
        }


    
}