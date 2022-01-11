package com.manifestcorp.onsohiodc.domain;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;
import com.manifestcorp.onsdomain.Order;
//import com.microsoft.azure.spring.data.cosmosdb.core.mapping.Document;
//import com.microsoft.azure.spring.data.cosmosdb.core.mapping.PartitionKey;
import org.springframework.data.annotation.Id;

@Container(containerName = "orders")
public class CosmosOrder {


    private int shippingId;
    @Id
    private int orderId;
    private String line1;
    private String line2;
    private String city;
    @PartitionKey
    private String state;
    private String zip;
    private String productId;
    private int quantity;
    private String description;

    public CosmosOrder(){}

    public CosmosOrder(Order order) {

        shippingId = order.getShippingId();
        orderId = order.getOrderId();
        line1 = order.getLine1();
        line2 =order.getLine2();
        city =order.getCity();
        state =order.getState();
        zip = order.getZip();
        productId = order.getProductId();
        description =order.getDescription();
        quantity =order.getQuantity();
    }


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getShippingId() {
        return shippingId;
    }

    public void setShippingId(int shippingId) {
        this.shippingId = shippingId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
