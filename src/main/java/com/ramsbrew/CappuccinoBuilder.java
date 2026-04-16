package com.ramsbrew;
public class CappuccinoBuilder implements BeverageBuilder {
    private Cappuccino cappuccino;
    public CappuccinoBuilder() { this.cappuccino = new Cappuccino(); }
    @Override
    public BeverageBuilder setSize(String size) { cappuccino.setSize(size); return this; }
    @Override
    public BeverageBuilder setMilk(String milk) { cappuccino.setMilk(milk); return this; }
    @Override
    public BeverageBuilder setShots(int shots) { cappuccino.setShots(shots); return this; }
    @Override
    public BeverageBuilder setSweetener(String sweetener) { cappuccino.setSweetener(sweetener); return this; }
    @Override
    public BeverageBuilder setIced(boolean iced) { cappuccino.setIced(iced); return this; }
    @Override
    public Beverage build() { return cappuccino; }
}
