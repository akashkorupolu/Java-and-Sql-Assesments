public record Student(String Name,int id) {
    public Student
    {
        if(id<0)
        {
            throw new IllegalArgumentException("Employee id cannot below 0");
        }
        if(Name==null)
    {
        Name="hiii";
    }
    }



}
