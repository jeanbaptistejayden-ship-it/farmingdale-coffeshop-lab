package com.ramsbrew;
public class Cappuccino extends Beverage {
    public Cappuccino() {
        this.name = "Cappuccino";
        this.size = "Medium";
        this.milk = "Whole";
        this.shots = 2;
        this.sweetener = "None";
        this.isIced = false;
    }
    @Override
    public String getDescription() {
        StringBuilder sb = new StringBuilder();
        sb.append(size).append(" ").append(name);
        sb.append(" | Milk: ").append(milk);
        sb.append(" | Shots: ").append(shots);
        sb.append(" | Sweetener: ").append(sweetener);
        return sb.toString();
    }
}
