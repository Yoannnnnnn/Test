package fr.efrei.domain;

public class Products {
    private String id;
    private String description;
    private double price;

    private Products() {
        // Default constructor is private
    }

    private Products(Builder builder) {
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
        return "Product{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }

    public static class Builder {
        private String id;
        private String description;
        private double price;

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Products build() {
            return new Products(this);
        }
    }
}
