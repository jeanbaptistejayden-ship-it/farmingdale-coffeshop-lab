package com.ramsbrew;
public class LatteBuilder implements BeverageBuilder {
    private Latte latte;
    public LatteBuilder() { this.latte = new Latte(); }
    @Override
    public BeverageBuilder setSize(String size) { latte.setSize(size); return this; }
    @Override
    public BeverageBuilder setMilk(String milk) { latte.setMilk(milk); return this; }
    @Override
    public BeverageBuilder setShots(int shots) { latte.setShots(shots); return this; }
    @Override
    public BeverageBuilder setSweetener(String sweetener) { latte.setSweetener(sweetener); return this; }
    @Override
    public BeverageBuilder setIced(boolean iced) { latte.setIced(iced); return this; }
    @Override
    public Beverage build() { return latte; }
}
