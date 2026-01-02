/*Create a class(Product) to store details of a product and provide required methods with the details prod_id, prod_name, price,quantity_on_hand
Methods are:  init(prod_id,prod_name, price)
                 getNetPrice() (returns the price after adding 12% tax)
                 purchase()
                sell() */



public class Product
{
    private int prod_id;
    private String prod_name;
    private int price;
    private int quantity_on_hand;
    
    public void init(int prod_id,String prod_name,int price)
    {


        this.prod_id=prod_id;
        this.prod_name=prod_name;
        this.price=price;

    }



    public double getNetPrice()
    {
        return price*(1+0.12*price);
    }

    public void purchase(int purchase_quantity)
    {
        quantity_on_hand+=purchase_quantity;
        
    }
    public void sell(int quantity)
    {
        if(quantity>quantity_on_hand)
        {
            System.out.println("Insufficient quantity");

        }
        else
        {
            System.out.println("purchased succesfully");
        }
    }
    public static void main(String[] args) {
        Product p = new Product();
        p.init(1,"laptop",100000);
        System.out.println(p.getNetPrice());
        p.purchase(1000);
        p.sell(10000);
    }

    
}