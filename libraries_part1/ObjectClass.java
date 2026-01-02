public class ObjectClass {
    int id;

    public String toString()
    {
        return id+" ";
    } 
    
   

    public static void main(String[] args) {
        ObjectClass ob=new ObjectClass();
        ob.id=10;
        System.out.println(ob);
        

        //System.out.println(ob.toString());

        
    }
}
