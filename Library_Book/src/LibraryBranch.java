public class LibraryBranch {
    static final int MAX_BRANCH = 10;
    static final int MAX_BOOKS = 20;
    private int BranchID;
    private Book[] books;
    private int bookCount;
    private int curr_book;

   public LibraryBranch(int id, int num){
       BranchID=id;
       bookCount=num;
       books=new Book[bookCount];
       curr_book=0;
   }

   public void addBook(Book b){
       if(bookCount>=MAX_BOOKS){
           System.out.println("Branch full");
           return;
       }
       books[curr_book++]=b;
   }

    public Book find_book(int ID)
    {
        for(int i = 0; i< bookCount; i++)
        {
            if(books[i].getBookID() == ID)
            {
                return books[i];
            }
        }
        return null;
    }

    public void display_branch()
    {
        if(bookCount==0)
        {
            System.out.println("NO BOOKS HERE");
            return;
        }
        System.out.println("Branch ID : " + BranchID);
        System.out.println("Branch Books : " + curr_book);
        System.out.println("Book Details :");
        for(int i=0; i<bookCount; i++)
        {
            books[i].display_book();
        }
    }

}
