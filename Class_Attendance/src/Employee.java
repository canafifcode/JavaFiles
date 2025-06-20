public class Employee {
    private int ID;
    private String Name;
    private int Attendance;

    public Employee(int ID, String Name, int Attendance){
        this.ID = ID;
        this.Name = Name;
        this.Attendance = Attendance;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public int getAttendance() {
        return Attendance;
    }

    public void setAttendance(int attendance) {
        Attendance = attendance;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void MarkAttendance(){
        Attendance++;
    }

    public void CorrectAttendance(){
        if(Attendance == 0)
        {
            System.out.println("Already in zero attendance.");
            return;
        }
        Attendance--;
    }

    public void display(){
        System.out.println("Employee ID : " + ID);
        System.out.println("Employee Name : " + Name);
        System.out.println("Employee Attendance : " + Attendance);
    }
}
