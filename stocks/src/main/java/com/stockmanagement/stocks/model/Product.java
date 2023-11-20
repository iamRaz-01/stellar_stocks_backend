package com.stockmanagement.stocks.model;
import com.stockmanagement.stocks.exception.InvalidDataException;
import com.stockmanagement.stocks.validation.DataValidation;
import jakarta.persistence.*;
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "product_name")
    private String productName;

    private String company;
    private String description;
    private int vehicle ;
    private int quantity;
    private int cost ;
    
    public void setVehicle(int vehicle)throws InvalidDataException{
       // DataValidation.vehicleValidation(vehicle);
        this.vehicle = vehicle;
    }
    
    public void setProductName(String productName) throws InvalidDataException {
       // DataValidation.stringValidation(productName,"product name",100);
        this.productName = productName;
    }
    
    public void setCompany(String company) throws InvalidDataException{
       // DataValidation.stringValidation(company,"company" , 30);
        this.company = company;
    }

    public void setQuantity(int quantity) throws InvalidDataException {
      //  DataValidation.quantityValidation(quantity);
        this.quantity = quantity;
    }

    public void setCost(int cost) throws InvalidDataException {
     //   DataValidation.costValidation(cost);
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getCompany() {
        return company;
    }
    public String getProductName() {
        return productName;
    }
    public int getVehicle() {
        return vehicle;
    }
    public int getId() {
        return id;
    }

    public int getCost() {
        return cost;
    }
}

