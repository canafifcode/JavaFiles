public class Department {
    static final int max_employee_dept = 50 ;
    private final int dept_ID;
    private int emp_cnt;
    private final Employee [] employees;

    public Department(int deptId) {
        dept_ID = deptId;
        employees = new Employee[max_employee_dept];
        emp_cnt=0;
    }

    public void Add_Employee(Employee E){
        if(emp_cnt>=max_employee_dept)
        {
            System.out.println("Department Full");
            return;
        }
        employees[emp_cnt++]=E;
    }

    public Employee find_emp(int Search_ID)
    {
        for(int i=0; i< emp_cnt; i++)
        {
            if(employees[i].getID()==Search_ID)
            {
                return employees[i];
            }
        }
        return null;
    }

    public int getEmp_cnt() {
        return emp_cnt;
    }

    public void display()
    {
        System.out.println("Dept ID : " + dept_ID);
        for(int i=0; i<emp_cnt; i++)
        {
            employees[i].display();
        }
        if(emp_cnt == 0)
        {
            System.out.println("No employees registered.");
        }
    }

}

