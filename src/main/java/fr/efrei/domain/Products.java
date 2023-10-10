package fr.efrei.domain;

public class Products {
    private String id; //create class because if a package is empty, its not pushed in Git
    private String description;
    private double price;

    private Products ()
    {
        //constructor
    }

    private Product (Builder builder){
        this.id = builder.id;
        this.description = builder.description;
        this.price = builder.price;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }

    public Builder setPrice(double price){
        this.price = price;
        return this;
    }

    public Builder copy (Products product){
        this.id = product.id;
        this.description = product.description;
        this.price = product.price;
        return builder;
    }

    public Product build (){
        return new Product(this);
    }
}
