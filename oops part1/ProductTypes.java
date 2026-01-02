/* Create classes to store details for two different types of Products,
   a) ImportedProducts which have import duty.
   b) DiscountedProducts which have a discount rate.
All products have name and base_price.Create required Constructors and following methods: print(), getNetPrice(), setPrice(), setImportDuty(), setDiscountRate() also experiment with upcasting and downcasting. */

class Products
{
    protected String name;
    protected int baseprice;
    public Products(String name,int baseprice) 
    
    {
        this.name=name;
        this.baseprice=baseprice;
    }

    public void print()
    {
        System.out.println("product name is "+name+" price is "+baseprice);
    }

    public void setPrice(int price)
    {
        baseprice=price;
    }

    public int getNetPrice() {
        return baseprice;
    }
}

class ImportedProducts extends Products
{
    private int importduty;

    public ImportedProducts(String name, int baseprice,int importduty) {
        super(name, baseprice);
        this.importduty=importduty;
    }
    public void setImportDuty(int importduty)
    {
        this.importduty=importduty;
    }

    public int getNetPrice()
    {
        return (int)super.baseprice+(super.baseprice*importduty/100);
    }
    public void print()
    {
        System.out.println(super.name+" "+super.baseprice+" "+getNetPrice());
    }
}

class DiscountedProduct extends Products {
    private int discountRate;   

    public DiscountedProduct(String name, int baseprice, int discountRate) {
        super(name,baseprice);
        this.discountRate = discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    
    public int getNetPrice() {
        return baseprice - (baseprice * discountRate / 100);
    }

    
    public void print() {
     
        System.out.println("Discount Rate: " + discountRate + "%");
        System.out.println("Net Price: " + getNetPrice());
    }
}
public class ProductTypes {
    public static void main(String[] args) {
        Products p = new Products("laptop",1000);
        System.out.println(p.getNetPrice());
        ImportedProducts ip=new ImportedProducts("laptop mac", 100000, 10);
        System.out.println(ip.getNetPrice());
        DiscountedProduct dp = new DiscountedProduct("mobile", 2003, 12);
        System.out.println(dp.getNetPrice());
    }
    
}
