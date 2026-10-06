package uk.ac.westminster.products_api;

public class Product {

    private Long id;
    private String name;
    private double price;

    public Product() {}

    public Product(Long id, String name, double price){
        this.id=id;
        this.name=name;
        this.price=price;
    }

    public Long getId() {return id; }

    public String getName() {return name; }

    public double getPrice() {return price; }

//  When the getters are commented out, the JSON will be empty but doesn't produce any error. This happens because, Jackson looks for a public getX() method for each private field. if there's none, then the field is skipped. So in a coursework with multiple methods, should always look out for the getters for the relevant fields.
}
