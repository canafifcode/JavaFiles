public class Book {
    private int bookID;
    private String Name;
    private boolean checker;

    public Book(int bookID, String Name, boolean checker){
        this.bookID= bookID;
        this.Name=Name;
        this.checker =checker;
    }

    public String getName(){
        return this.Name;
    }
    public int getBookID(){
        return this.bookID;
    }


    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public void setName(String name) {
        Name = name;
    }

    public void book_borrow(){
        if(!checker){
            System.out.println("Book not available");
            return;
        }
        checker=false;
    }

    public void book_return(){
        if(checker)
        {
            System.out.println("Book already available.");
            return;
        }
        checker = true;
    }

    public void display_book()
    {
        System.out.println("Book ID : " + bookID);
        System.out.println("Book Name : " + Name);
        System.out.println("Book Availability : " + checker);
    }
}
