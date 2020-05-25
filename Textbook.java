// package testtextbooks;
public abstract class Textbook {
    String title;
    String author;
    int pages;
    // Constructor with no argument
    public Textbook() {
    }
    // Constructor with title, author and pages arguments
    public Textbook(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
    // accessor and mutator methods for all 3 data set.
    // get title value
    public String getTitle() {
        return title;
    }
    // set title value
    public void setTitle(String title) {
        this.title = title;
    }
    // get author value
    public String getAuthor() {
        return author;
    }
    // set author value
    public void setAuthor(String author) {
        this.author = author;
    }
    // get pages value
    public int getPages() {
        return pages;
    }
    // set pages value
    public void setPages(int pages) {
        this.pages = pages;
    }
     
    // Overridding toString default Function to our designed string function to display title, author and pages
    @Override
    public String toString() {
        return "Textbook{" + "title=" + title + ", author=" + author + ", pages=" + pages + '}';
    }
            
}
