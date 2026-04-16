package com.ramsbrew;
public interface BeverageBuilder {
    BeverageBuilder setSize(String size);
    BeverageBuilder setMilk(String milk);
    BeverageBuilder setShots(int shots);
    BeverageBuilder setSweetener(String sweetener);
    BeverageBuilder setIced(boolean iced);
    Beverage build();
}
