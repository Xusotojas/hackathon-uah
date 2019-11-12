package es.jimenezhidalgo.products.service;

import es.jimenezhidalgo.products.model.Product;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private final String DNI1 = "000000000T";
    private final String DNI2 = "123456789B";

    private Product mPizza;
    private Product mColdDrink;
    private Product mSandwich;
    private Product mMenu;
    private Product mDessert;
    private Product mCoffee;

    private List<Product> mProductsBought;

    public List<Product> getUserProducts(String dni) {
        mProductsBought = new ArrayList<>();
        if (!userExist(dni)) {
            return mProductsBought;
        } else {
            createProductsBought();
            if (dni.equals(DNI1)){
                mProductsBought.add(mPizza);
                mProductsBought.add(mCoffee);
                mProductsBought.add(mDessert);
            } else if (dni.equals(DNI2)) {
                mProductsBought.add(mMenu);
                mProductsBought.add(mColdDrink);
                mProductsBought.add(mSandwich);
            }
            return mProductsBought;
        }
    }

    private boolean userExist(String dni) {
        if (dni.equals(DNI1) || dni.equals(DNI2)) {
            return true;
        }
        return false;
    }

    private void createProductsBought() {
        mPizza = new Product("Pizza", "3.5", new Timestamp(System.currentTimeMillis()));
        mCoffee = new Product("Café", "0.75", new Timestamp(System.currentTimeMillis()));
        mSandwich = new Product("Bocata", "1.5", new Timestamp(System.currentTimeMillis()));
        mMenu = new Product("Menú del Día", "5.5", new Timestamp(System.currentTimeMillis()));
        mDessert = new Product("Postre", "1.5", new Timestamp(System.currentTimeMillis()));
        mColdDrink = new Product("Refresco", "0.75", new Timestamp(System.currentTimeMillis()));
    }
}
