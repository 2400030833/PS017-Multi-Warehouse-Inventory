package com.example.ps017_.reconciliation.service;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Reconciliation {

    @Id
    private int id;

    private int productId;
    private int warehouseId;
    private int systemQuantity;
    private int actualQuantity;
    private String status;

    public Reconciliation() {
    }

    public Reconciliation(int id, int productId, int warehouseId,
            int systemQuantity, int actualQuantity, String status) {
        this.id = id;
        this.productId = productId;
        this.warehouseId = warehouseId;
        this.systemQuantity = systemQuantity;
        this.actualQuantity = actualQuantity;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(int warehouseId) {
        this.warehouseId = warehouseId;
    }

    public int getSystemQuantity() {
        return systemQuantity;
    }

    public void setSystemQuantity(int systemQuantity) {
        this.systemQuantity = systemQuantity;
    }

    public int getActualQuantity() {
        return actualQuantity;
    }

    public void setActualQuantity(int actualQuantity) {
        this.actualQuantity = actualQuantity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}