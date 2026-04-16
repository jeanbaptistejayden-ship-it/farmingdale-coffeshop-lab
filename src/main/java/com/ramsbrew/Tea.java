package com.ramsbrew;
public class Tea extends Beverage {
    public Tea() {
        this.name = "Tea";
        this.size = "Medium";
        this.milk = "None";
        this.shots = 0;
        this.sweetener = "None";
        this.isIced = false;
    }
    @Override
    public String getDescription() {
        StringBuilder sb = new StringBuilder();
        sb.append(size).append(" ");
        if (isIced) sb.append("Iced ");
        sb.append(name);
        if (!milk.equals("None")) sb.append(" | Milk: ").append(milk);
        sb.append(" | Sweetener: ").append(sweetener);
        return sb.toString();
    }
}
