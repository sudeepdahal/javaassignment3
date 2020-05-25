// package testtextbooks;
// Defining ProgrammingTextbook with including or extending Textbook class
public class ProgrammingTextbook extends Textbook{
    String language;
    // accessor method for language data
    public String getLanguage() {
        return language;
    }
    // mutator method for language data
    public void setLanguage(String language) {
        this.language = language;
    }
    // Constructor with no argument
    public ProgrammingTextbook() {
    }
    // Constructor with language argument
    public ProgrammingTextbook(String language) {
        this.language = language;
    }
    // Overridding toString default Function to our designed string function to display language
    @Override
    public String toString() {
        return "ProgrammingTextbook{" + "language=" + language + '}';
    }
        
}
