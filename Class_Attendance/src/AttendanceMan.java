import java.util.Scanner;

public class AttendanceMan {
    static final int max_dept = 10;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of departments: ");
        int dept_cnt = sc.nextInt();

        //AttendanceMan am = new AttendanceMan();
        //int dept_cnt = Integer.parseInt(args[0]);
        if(dept_cnt > max_dept)
        {
            System.out.println("Max department number is " + max_dept);
            return;
        }
       // Scanner sc = new Scanner(System.in);
        Department [] departments = new Department[dept_cnt];
        for(int i=0; i<dept_cnt; i++)
        {
            departments[i]= new Department(i+1);
            int emp_cnt  = 0;
            while (true)
            {
                System.out.println("Enter the Employee number in dept " + (i+1) );
                emp_cnt = sc.nextInt();
                if(emp_cnt > Department.max_employee_dept)
                {
                    System.out.println("Max employee is " + Department.max_employee_dept);
                    continue;
                }
                break;
            }
            for(int j = 0; j < emp_cnt; j++)
            {
                System.out.println("Enter Employee ID : ");
                int x = sc.nextInt();
                sc.nextLine(); // consume the leftover newline
                System.out.println("Enter Employee Name : ");
                String name = sc.nextLine();
                System.out.println("Enter Employee Initial Attendance : ");
                int y = sc.nextInt();
                Employee temp = new Employee(x, name, y);
                departments[i].Add_Employee(temp);
            }
        }
        while(true)
        {
            System.out.println("Menu:");
            System.out.println("1. Mark Attendance");
            System.out.println("2. Correct Attendance");
            System.out.println("3. Display All Department Info ");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            if (choice == 4) break;
            if(choice == 1)
            {
                System.out.println("Enter Dept ID : ");
                int x = sc.nextInt();
                System.out.println("Enter Employee ID : ");
                int y = sc.nextInt();
                if(x>0 && x<= dept_cnt && y>0 && y<=departments[x-1].getEmp_cnt())
                {
                    Employee temp = departments[x-1].find_emp(y);
                    if (temp != null)
                    {
                        temp.MarkAttendance();
                        System.out.println("Attendance marked.");
                    }
                    else
                    {
                        System.out.println("Employee not found.");
                    }
                }
                else
                {
                    System.out.println("Invalid Department ID.");
                }
            }
            else if(choice == 2)
            {
                System.out.println("Enter Dept ID : ");
                int x = sc.nextInt();
                System.out.println("Enter Employee ID : ");
                int y = sc.nextInt();
                if(x>0 && x<= dept_cnt && y>0 && y<=departments[x-1].getEmp_cnt())
                {
                    Employee temp = departments[x-1].find_emp(y);
                    if (temp != null)
                    {
                        temp.CorrectAttendance();
                        System.out.println("Attendance corrected.");
                    }
                    else
                    {
                        System.out.println("Employee not found.");
                    }
                }
                else
                {
                    System.out.println("Invalid Department ID.");
                }
            }
            else if(choice ==3)
            {
                for (int i=0; i < dept_cnt; i++)
                {
                    departments[i].display();
                }
            }
            else
            {
                System.out.println("Invalid Option.");
            }
        }
        sc.close();

    }
}