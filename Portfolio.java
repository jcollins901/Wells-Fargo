package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Portfolio extends Client{

    @Id
    @GeneratedValue()
    private long portfolioId;
    @Column(nullable = false)
    private long clientId;
    @Column(nullable = false)
    private String creationDate;

    protected Portfolio() {

    }
    public Portfolio(long clientId, String creationDate) {
        this.clientId = getClientId();
        this.creationDate = creationDate;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }
}
