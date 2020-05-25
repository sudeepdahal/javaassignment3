
// package teststudent;
// Importing the necessary standard class for file handling, array and input/output
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

// Defining class TestStudent with its attributes and functions
public class TestStudent {
    // Creating ArrayList of Students
    static ArrayList<Student> studentList = new ArrayList<>();
    static Scanner input;
    // initializing list length to 0
    static int listLength = 0;

    // Starting the main class adding IOException as it may throw IO exceptions
    public static void main(String[] args) throws IOException {
        // Creating readText object of Scanner clas to read the file
        Scanner readText = new Scanner(new File("students.txt").toPath());
        // Reading the each line of the file
        while(readText.hasNext()){
            // adding the content id and name to studentList                        
            studentList.add(new Student(readText.next(),readText.next()));
            listLength++;
        }
        // Closing the file after reading 
        readText.close(); 
        
        // Promoting the end user for using the system. Taking input from user
        input = new Scanner(System.in);
        // Looping the menu until inclusive menu number is entered 
        while(true){
            // calling menu function where menu are displayed to user           
            menu();
            // Expected input from user
            switch(input.nextInt()){
                // when input is 1 call add function
                case 1:
                    add();
                    break;
                // when input is 2 display add function
                case 2:
                    display();
                    break;
                // when input is 3 call displayId function
                case 3:
                    displayId();
                    break;
                // when input is else exit the program
                default:
                    System.exit(0);
                    break;                   
            }
        }                           
    }
    
    // Displaying the menu
     public static void menu(){
        System.out.println("\n1. Add student deails in arraylist?");
        System.out.println("2. Display all list");
        System.out.println("3. Display Id");
        System.out.println("4. exit");
        System.out.println("enter choice");
    }
    // add function which may have IOException
    public static void add() throws IOException{
        while(true){
            // Creating new std object for Student class
            Student std =new Student();
            // Creating input object for handling user input
            input = new Scanner(System.in);
            System.out.println("\nenter id?");
            // taking id input and storing in id
            String id = input.next(); 
            // checking if the id is valid or not    
            if(std.isValidId(id)){
                System.out.println("enter name?");          
                String name = input.next(); 
                // checking if id preexist in file or not 
                if(std.idExists(id,studentList)){
                    // Displaying message for taken id
                    System.out.println("\nID already taken!");                    
                }
                else{
                    // adding new id and name to studentList and then call writeInFile function
                    studentList.add(new Student(id, name));
                    writeInFile(id,name);
                }
            }else{
                // message for invalid input id
                System.out.println("\nINVALID ID!");
            }
            // Asking the user to repeat addition of student
            System.out.println("\nAdd Again[Y/N]?");
            if(input.next().equalsIgnoreCase("n")){                
                break;
            }
        }
     } 
    // Creating writeInFile function with IOException class
    public static void writeInFile(String id, String name) throws IOException{
        // BufferedWriter with bw object to write on the file
        BufferedWriter bw = new BufferedWriter(new FileWriter("students.txt", true));
        // id and name is appended to the file student.txt        
        bw.append(id+" "+name+"\n");
        // Closing file after writing
        bw.close();
    }
    // Creating display function to display all student id and name
    public static void display(){          
        for(Student st:studentList){              
            System.out.println(st);            
        }
    }
    // Creating display function to display all student id only
    public static void displayId(){          
        for(Student st:studentList){              
            System.out.println(st.getId());            
        }
    }
}
