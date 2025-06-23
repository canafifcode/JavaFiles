import java.util.Scanner;

public class Main{
    static final int MAX_BRANCH = 10;
    static final int MAX_BOOKS = 20;
    public static void main(String[] args) {
        if(args.length<1)
        {
            System.out.println("Enter Branch Number in argument.");
            return;
        }
        int branch_num;
        branch_num = Integer.parseInt(args[0]);
        if(branch_num > MAX_BRANCH)
        {
            System.out.println("Max number of branch is " + MAX_BRANCH);
            return;
        }
        Scanner sc = new Scanner(System.in);
        LibraryBranch [] branches = new LibraryBranch[branch_num];
        for(int i=0; i < branch_num; i++)
        {
            System.out.println("Enter the number of books in branch " + (i+1));
            int num_books = sc.nextInt();
            if(num_books > MAX_BOOKS || num_books< 0)
            {
                System.out.println("Invalid Input.Max books is "+MAX_BOOKS+".Moving to next branch.");
                num_books = 0;
                branches[i]= new LibraryBranch(i+1,num_books);
                continue;
            }
            branches[i] = new LibraryBranch(i+1,num_books);
            for(int j=0; j<num_books; j++)
            {
                System.out.println("Enter Book ID : ");
                int x = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter Book Name : ");
                String name = sc.nextLine();
                System.out.println("Enter Book Availability : ");
                Boolean y = sc.nextBoolean();
                sc.nextLine();
                Book temp2 = new Book(x,name,y);
                branches[i].addBook(temp2);
            }
        }
        while(true)
        {
            System.out.println("1.Borrow Book");
            System.out.println("2.Return Book");
            System.out.println("3.Show Branches Details");
            System.out.println("4.Quit");
            int choice = sc.nextInt();
            if(choice == 1)
            {
                System.out.println("Enter Branch ID : ");
                int x = sc.nextInt();
                System.out.println("Enter Book ID : ");
                int y = sc.nextInt();
                Book temp = branches[x-1].find_book(y);
                if(temp == null)
                {
                    System.out.println("Invaild Input");
                    continue;
                }
                temp.book_borrow();
            }
            else if(choice == 2)
            {
                System.out.println("Enter Branch ID : ");
                int x = sc.nextInt();
                System.out.println("Enter Book ID : ");
                int y = sc.nextInt();
                Book temp = branches[x-1].find_book(y);
                if(temp == null)
                {
                    System.out.println("Invaild Input");
                    continue;
                }
                temp.book_return();
            }
            else if(choice == 3)
            {
                for(int i=0; i < branch_num; i++)
                {
                    branches[i].display_branch();
                }
            }
            else if(choice == 4)
            {
                break;
            }
            else
            {
                System.out.println("Invalid Input");
            }
        }
        sc.close();
    }
}
