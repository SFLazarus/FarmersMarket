package com.lazarus.farmersmarket;

public class Product {

    public String name,cost,quantity,desc,farmerName,expiry, rating;

    private int thumbnail;

    public Product(){}

    public Product(String Name,String Cost, String Quantity, String Desc, String FarmerName, String Rating,String Expiry, int Thumbnail)
    {
     name=Name;
     cost=Cost;
     quantity=Quantity;
     desc=Desc;
     farmerName=FarmerName;
     rating=Rating;
     expiry=Expiry;
     thumbnail=Thumbnail;
    }

    public String getName() {
        return name;
    }

    public String getExpiry() {
        return expiry;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    public String getCost() {
        return cost;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getDesc() {
        return desc;
    }

    public String getFarmerName() {
        return farmerName;
    }

    public String getRating() {
        return rating;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setFarmerName(String farmerName) {
        this.farmerName = farmerName;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
}
