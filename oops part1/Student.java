/*Create a class Student that stores the details like admin_no, stu_name, course_joined and fees_paid.
—> Courses are: JAVA, PYTHON.
—> The total fees for java is 10k and for python is 7.5k.
—> Provide a constructor to take required details.The default course is JAVA. 
 Provide the following methods: getTotalFee(), getDue(), getFeePaid(), payment(amount).*/
public class Student {
    private int admin_no;
    private String stu_name;
    String course="Java";
    private boolean fees_paid;
    private int fee;


    public Student(int admin_no,String stu_name,String course,boolean fees_paid)
    {
        this.admin_no=admin_no;
        this.stu_name=stu_name;
        this.course=course;
        if(this.course=="Java")
            fee=10000;
        else
            fee=7500;
        this.fees_paid=fees_paid;
    }

    public void getDetails()
    {
        System.out.println("The Student of id "+admin_no+" named "+stu_name+" taken course "+course);
    }

    public String feeDue()
    {
        if(fees_paid)
        {
            return "there is no fee pending";
        }
        else
            return "you have fee pending of"+fee;
    }

    public void getTotalFee()
    {
        System.out.println("The total fee is "+fee);
    }

    public void payment(int amount)
    {
        if (amount==fee)
        {
            System.out.println("Payment succesful");
            fees_paid=true;
        }
        else
            System.out.println("payment not succesful");
    }

    public static void main(String[] args) {

        Student[] students=new Student[3];

        students[0]=new Student(200063,"Akash","Python",false);

        

        System.out.println(students[0].feeDue());
        students[0].getDetails();
        students[0].payment(7500);
    }


    
}
