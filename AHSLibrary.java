package Chapter4;



public class AHSLibrary
{
        public static void main (String [] args){
            Library ahs = new Library(10, "Acalanes");
            Author a = new Author ("Jim", 23);
            Book b = new Book (a, "Java book");
            ahs.addBook(b);
            System.out.println(ahs);
            
            
        }
    
}

   

