package Chapter4;


public class Book
{
    private Author bookAuthor;
    private String title;
    public Book(Author aut, String titl)
    {
        this.bookAuthor= aut;
        this.title= titl;
    }
    
    
    public String toString(){
        return "the author's name is " + bookAuthor + "The Title of the book is " + title;
    }
}
