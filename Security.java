package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Security extends Portfolio{

    @Id
    @GeneratedValue()
    private long secuirtyID;

    @Column(nullable = false)
    private long portfolioId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private String purchasePrice;

    @Column(nullable = false)
    private String purchaseDate;

    @Column(nullable = false)
    private String quantity;

    protected Security() {

    }

    public Security(long portfolioId, String name, String category, String purchasePrice, String purchaseDate, String quantity) {
        this.portfolioId = getPortfolioId();
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
    }
    public long getSecuirtyID() {
        return secuirtyID;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPurchasePrice(String purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getPurchasePrice() {
        return purchasePrice;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public String getQuantity() {
        return quantity;
    }
}
