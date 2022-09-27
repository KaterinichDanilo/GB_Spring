package Hm1;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private int id;
    private String title;
    private double cost;

    public Product(int id, String title, double cost) {
        this.id = id;
        this.title = title;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "(" + id + ", " + title + ", " + cost + ")";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public static List<Product> createListProduct() {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Apple", 10));
        productList.add(new Product(2, "Pineapple", 30));
        productList.add(new Product(3, "Potato", 15));
        productList.add(new Product(4, "Cucumber", 25));
        productList.add(new Product(5, "Tomato", 40));
        productList.add(new Product(6, "Carrot", 20));
        productList.add(new Product(7, "Pepper", 30));
        productList.add(new Product(8, "Eggplant", 50));
        productList.add(new Product(9, "Garlic", 25));
        productList.add(new Product(10, "Radish", 30));

        return productList;
    }
}
