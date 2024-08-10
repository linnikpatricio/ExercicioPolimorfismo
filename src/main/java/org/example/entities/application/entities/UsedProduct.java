package org.example.entities.application.entities;

import org.example.entities.application.entities.Product;

import java.time.LocalDate;



public class UsedProduct extends Product {
    private LocalDate manufactureDate;

    public UsedProduct(){
        super();
    }

    public UsedProduct(String name, double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
    @Override
    public String priceTag(){
        return getName()
                +" (Used) $ "
                +String.format("%.2f",getPrice())
                +"(Manufacture date: "
                +manufactureDate
                +")";
    }
}
