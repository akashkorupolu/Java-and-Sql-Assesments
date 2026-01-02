class Animal
{
    int x=10;
    public void show()
    {
        System.out.println("animal show");
    }
}

class Dog extends Animal{
    int x=20;

    

    public void show()
    {
        super.show();
        System.out.println("dog show");

    }

    public void fetch()
    {
        System.out.println("fetching");
    }
}




class Polymorph{
    public static void main(String[] args) {
        Dog d= new Dog();
        d.show();

        Animal a =new Dog();
        System.out.println(a.x);
        a.show();
        Dog dd =(Dog) a;

        System.out.println(dd.x);
        dd.fetch();
        dd.show();

        
    }
}