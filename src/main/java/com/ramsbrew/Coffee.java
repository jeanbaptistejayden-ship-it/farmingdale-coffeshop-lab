package com.ramsbrew;

public class Coffee extends Beverage {

    public Coffee() {
              this.name = "Coffee";
              this.size = "Medium";
              this.milk = "Whole";
              this.shots = 1;
              this.sweetener = "None";
              this.isIced = false;
    }

    @Override
      public String getDescription() {
                StringBuilder sb = new StringBuilder();
                sb.append(size).append(" ");
                if (isIced) sb.append("Iced ");
                sb.append(name);
                sb.append(" | Milk: ").append(milk);
                sb.append(" | Shots: ").append(shots);
                sb.append(" | Sweetener: ").append(sweetener);
                return sb.toString();
      }
}
