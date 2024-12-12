package com.pujariz.SimpleWebApp.service;

import com.pujariz.SimpleWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(new Product(101,"Samsung Galaxy S20 5g",59999),
            new Product(102,"MacBook Air M1",59999),
            new Product(103,"iPhone 15 Pro",54999)));

    public List<Product> getProducts(){
        return products;
    }

    public Product getProductByID(int prodID) {
        return products.stream()
                .filter(p -> p.getProdID() == prodID)
                .findFirst().orElse(new Product(100,"Rope and Stool",1499));
    }

    public void addProduct(Product prod) {
        products.add(prod);

    }

    public void updateProduct(Product prod) {
        int index=0;
        for(int i=0;i<products.size();i++)
            if(products.get(i).getProdID() == prod.getProdID())
                index=i;


        products.set(index,prod);
    }

    public void deleteProduct(int prodID) {
        int index=0;
        for(int i=0;i<products.size();i++)
            if(products.get(i).getProdID() == prodID)
                index=i;

        products.remove(index);
    }
}
