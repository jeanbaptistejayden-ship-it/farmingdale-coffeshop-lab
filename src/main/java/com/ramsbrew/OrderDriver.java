package com.ramsbrew;
public class OrderDriver {
    public static void main(String[] args) {
        System.out.println("=== Ram's Brew Coffee Shop Order System ===\n");
        // Order 1: Dine-in
        Order order1 = new Order("Alice", "Dine-in");
        order1.addBeverage(new LatteBuilder().setSize("Large").setMilk("Oat").setShots(3).setSweetener("Honey").setIced(true).build());
        order1.addBeverage(new CappuccinoBuilder().setSize("Medium").setMilk("Whole").setShots(2).setSweetener("Sugar").build());
        System.out.println(order1.getOrderSummary());
        // Order 2: Takeout
        Order order2 = new Order("Bob", "Takeout");
        order2.addBeverage(new CoffeeBuilder().setSize("Small").setMilk("Skim").setShots(1).setSweetener("Stevia").build());
        order2.addBeverage(new TeaBuilder().setSize("Large").setSweetener("Honey").setIced(true).build());
        System.out.println(order2.getOrderSummary());
        // Order 3: Delivery
        Order order3 = new Order("Charlie", "Delivery");
        order3.addBeverage(new CoffeeBuilder().setSize("Large").setMilk("Almond").setShots(2).setSweetener("None").setIced(true).build());
        System.out.println(order3.getOrderSummary());
    }
}
