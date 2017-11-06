package Chapter4;



public class Library
{
    private String name;
    private Book [] books;
    private int index = 0;
    
    public Library(int size, String nm)
    {
        this.books= new Book[size];
        this.name=nm;
    }

    public String toString(){
        String output = "The library has ";
        for(Book b : books) {
            output += b + "\n";
        }
        return output;
    }
    public void addBook(Book b, int i) {
        books[i] = b;
    }
    
    public void addBook(Book b) {
        books[index] = b;
        index++;
    }
    
}
