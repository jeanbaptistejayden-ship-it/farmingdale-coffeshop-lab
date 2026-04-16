package com.ramsbrew;
import java.util.ArrayList;
import java.util.List;
public class Order {
    private static int orderCounter = 0;
    private int orderId;
    private String customerName;
    private String serviceType;
    private List<Beverage> beverages;
    public Order(String customerName, String serviceType) {
        this.orderId = ++orderCounter;
        this.customerName = customerName;
        this.serviceType = serviceType;
        this.beverages = new ArrayList<>();
    }
    public void addBeverage(Beverage beverage) { beverages.add(beverage); }
    public int getOrderId() { return orderId; }
    public String getCustomerName() { return customerName; }
    public String getServiceType() { return serviceType; }
    public List<Beverage> getBeverages() { return beverages; }
    public String getOrderSummary() {
        StringBuilder sb = new StringBuilder();
        sb.append("===== ORDER #").append(orderId).append(" =====\n");
        sb.append("Customer: ").append(customerName).append("\n");
        sb.append("Service Type: ").append(serviceType).append("\n");
        sb.append("Items:\n");
        for (int i = 0; i < beverages.size(); i++) {
            sb.append("  ").append(i + 1).append(". ").append(beverages.get(i).getDescription()).append("\n");
        }
        sb.append("Total Items: ").append(beverages.size()).append("\n");
        sb.append("==========================\n");
        return sb.toString();
    }
    @Override
    public String toString() { return getOrderSummary(); }
}
