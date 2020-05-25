// package testtextbooks;
// Defining EngineeringTextbook with including or extending Textbook class
public class EngineeringTextbook extends  Textbook{
    String subject;
    // accessor method for subject data
    public String getSubject() {
        return subject;
    }
    // mutator method for subject data
    public void setSubject(String subject) {
        this.subject = subject;
    }
    // Constructor with no argument
    public EngineeringTextbook() {
    }
    // Constructor with subject arguments
    public EngineeringTextbook(String subject) {
        this.subject = subject;
    }
    // Overridding toString default Function to our designed string function to display subject
    @Override
    public String toString() {
        return "EngineeringTextbook{" + "subject=" + subject + '}';
    }
        
}
