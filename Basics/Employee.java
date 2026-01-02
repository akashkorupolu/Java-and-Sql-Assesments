public class Employee {
    private String name;
    private int salary;
    public void init(String s,int sal)
    {
        name=s;
        salary=sal;
    }
    public void display()
    {
        System.out.println(name);
        System.out.println(salary);
    }
    public void setSalary(int salary)
    {
        this.salary=salary;
    }
    public int getSalary()
    {
        return salary;
    }

}
