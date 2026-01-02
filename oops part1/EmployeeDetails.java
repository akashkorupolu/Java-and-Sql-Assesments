/*Create a subclass called FactoryEmployee, for all factory employees we need to store bus_no, emp_boards.Create a super class related to this subclass. */


class Employee{
    String name;
    int id;

    public void setDetails(String name,int id)
    {
        this.name=name;
        this.id=id;
    }

    public void getDetails()
    {
        System.out.println(name+" "+id);
    }


}

class FactoryEmployee extends Employee
{
    int bus_no;
    String emp_boards;

    public void setDetails(String name,int id,int bus_no,String emp_boards)
    {
        setDetails(name,id);
        this.bus_no=bus_no;
        this.emp_boards=emp_boards;
    }


    public void getDetails()
    {
        System.out.println("Employee name is "+name+" of id "+id+" bording bus no "+ bus_no+" at stop "+emp_boards);
    }

}

public class EmployeeDetails {
    public static void main(String[] args) {
        FactoryEmployee f=new FactoryEmployee();
        f.setDetails("Akash",200063,222,"vzm");
        f.getDetails();
    }
}
