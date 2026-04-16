package com.ramsbrew;
public class CoffeeBuilder implements BeverageBuilder {
    private Coffee coffee;
    public CoffeeBuilder() { this.coffee = new Coffee(); }
    @Override
    public BeverageBuilder setSize(String size) { coffee.setSize(size); return this; }
    @Override
    public BeverageBuilder setMilk(String milk) { coffee.setMilk(milk); return this; }
    @Override
    public BeverageBuilder setShots(int shots) { coffee.setShots(shots); return this; }
    @Override
    public BeverageBuilder setSweetener(String sweetener) { coffee.setSweetener(sweetener); return this; }
    @Override
    public BeverageBuilder setIced(boolean iced) { coffee.setIced(iced); return this; }
    @Override
    public Beverage build() { return coffee; }
}
