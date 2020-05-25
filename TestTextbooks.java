//package testtextbooks;
import java.util.ArrayList;
public class TestTextbooks {
    // Starting the main function
    public static void main(String[] args) {
        // Creating programmingTextbookObj1 Object of ProgrammingTextbook class with no data
        ProgrammingTextbook programmingTextbookObj1 = new ProgrammingTextbook();
        // Creating programmingTextbookObj2 Object of ProgrammingTextbook class with java data as language
        ProgrammingTextbook programmingTextbookObj2 = new ProgrammingTextbook("java");
        
        // Creating engineeringTextbookObj1 Object of EngineeringTextbook class with no data
        EngineeringTextbook engineeringTextbookObj1 = new EngineeringTextbook();
        // Creating engineeringTextbookObj2 Object of EngineeringTextbook class with Applied Mechanics data as subject
        EngineeringTextbook engineeringTextbookObj2 = new EngineeringTextbook("Applied Mechanics");
        
        // Creating ArrayList to add all the objects
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add(programmingTextbookObj1);
        arrayList.add(programmingTextbookObj2);
        arrayList.add(engineeringTextbookObj1);
        arrayList.add(engineeringTextbookObj2);
        // Displaying class of this arrayList
        for(Object o : arrayList){            
            System.out.println(o.getClass());
        }
              
    }
    
}
