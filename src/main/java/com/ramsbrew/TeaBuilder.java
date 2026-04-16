package com.ramsbrew;
public class TeaBuilder implements BeverageBuilder {
    private Tea tea;
    public TeaBuilder() { this.tea = new Tea(); }
    @Override
    public BeverageBuilder setSize(String size) { tea.setSize(size); return this; }
    @Override
    public BeverageBuilder setMilk(String milk) { tea.setMilk(milk); return this; }
    @Override
    public BeverageBuilder setShots(int shots) { return this; }
    @Override
    public BeverageBuilder setSweetener(String sweetener) { tea.setSweetener(sweetener); return this; }
    @Override
    public BeverageBuilder setIced(boolean iced) { tea.setIced(iced); return this; }
    @Override
    public Beverage build() { return tea; }
}
