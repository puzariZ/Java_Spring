package com.pujariz.SimpleWebApp.model;

//import lombok.AllArgsConstructor;
//import lombok.Data;
import org.springframework.stereotype.Component;

//@Data
//@AllArgsConstructor
@Component
public class Product {

    private int prodID;
    private String prodName;

    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" +
                "prodID=" + prodID +
                ", prodName='" + prodName + '\'' +
                ", prodPrice=" + prodPrice +
                '}';
    }

    public Product(int prodID, String prodName, int prodPrice) {
        this.prodID = prodID;
        this.prodName = prodName;
        this.prodPrice = prodPrice;
    }

    public int getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(int prodPrice) {
        this.prodPrice = prodPrice;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getProdID() {
        return prodID;
    }

    public void setProdID(int prodID) {
        this.prodID = prodID;
    }

    private int prodPrice;
}
