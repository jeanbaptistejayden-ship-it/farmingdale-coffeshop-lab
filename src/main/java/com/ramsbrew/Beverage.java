package com.ramsbrew;
public abstract class Beverage {
    protected String name;
    protected String size;
    protected String milk;
    protected int shots;
    protected String sweetener;
    protected boolean isIced;
    public String getName() { return name; }
    public String getSize() { return size; }
    public void setSize(String size) { this.size = size; }
    public String getMilk() { return milk; }
    public void setMilk(String milk) { this.milk = milk; }
    public int getShots() { return shots; }
    public void setShots(int shots) { this.shots = shots; }
    public String getSweetener() { return sweetener; }
    public void setSweetener(String sweetener) { this.sweetener = sweetener; }
    public boolean isIced() { return isIced; }
    public void setIced(boolean iced) { this.isIced = iced; }
    public abstract String getDescription();
    @Override
    public String toString() { return getDescription(); }
}
