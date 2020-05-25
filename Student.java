// package teststudent;
// Importing the necessary standard class for array and Iterator
import java.util.ArrayList;
import java.util.Iterator;

// Defining class Student with its attributes and functions
public class Student {
    // attributes id and name of the Student
    String id;
    String name;
    // Constructor with no argument
    public Student() {
    }
    // Constructor with id argument only
    public Student(String id){
        this.id = id;
    }
    // Constructor with id and name arguments
    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }        
    // accessor and mutator methods for all 2 data set.

    // get id value
    public String getId() {
        return id;
    }
    // set id value
    public void setId(String id) {
        this.id = id;
    }
    // get name value
    public String getName() {
        return name;
    }
    // set name value
    public void setName(String name) {
        this.name = name;
    }
    // Overridding toString default Function to our designed string returning Function
    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + '}';
    }
    // To validate the id with length 6 and contains only numeric
    public boolean isValidId(String stdId){
        if(stdId.length()==6 && stdId.matches("[0-9]+"))
            return true;
        return false;
    }
    // Check if the id already exists in the file
    public boolean idExists(String stdId, ArrayList<Student> list){ 
        Iterator<Student> itr = list.iterator();
        // check with each id present in the file
        while(itr.hasNext())  {                       
            Student stdObj = itr.next();
            if(stdObj.getId().equals(stdId)){
                // If the id is already in file it will return true value
                return true;
            }
        }
        // If the id is not in file it will return false value
        return false;
    }           
    
}
