package bg.sofia.uni.fmi.mjt.shopping.item;

import java.util.Objects;

public class Chocolate implements Item {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chocolate chocolate = (Chocolate) o;
        return Double.compare(chocolate.price, price) == 0 &&
                name.equals(chocolate.name) &&
                description.equals(chocolate.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, price);
    }

    private String name = "";
    private String description = "";
    private double price = 0;

    public Chocolate(String name, String desc, double price) {
        this.name = name;
        this.description = desc;
        this.price = price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

}