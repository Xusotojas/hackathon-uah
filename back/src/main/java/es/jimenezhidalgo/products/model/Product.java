package es.jimenezhidalgo.products.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Timestamp;
import java.util.UUID;

public class Product {

    private UUID id;
    private String product;
    private String price;
    private Timestamp date;

    public Product(
            @J
            @JsonProperty("product") String product,
            @JsonProperty("price") String price,
            @JsonProperty("date") Timestamp date) {
        this.id = UUID.randomUUID();
        this.product = product;
        this.price = price;
        this.date = date;
    }

    public UUID getId() {
        return id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }
}
