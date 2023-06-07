package ra;

public class Cars {
   private String type;
   private String name;
   private String product;

   // các constructor
    public Cars() {
    }

    public Cars(String type, String name, String product) {
        this.type = type;
        this.name = name;
        this.product = product;
    }
    // getter / setter


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", product='" + product + '\'' +
                '}';
    }
    public void makeSound(){
        System.out.println(this.name +" kêu bíp bips");
    }
}
