package com.ramsbrew;

/**
 * Abstract base class for all beverages at Ram's Brew Coffee Shop.
   * Part of the Builder design pattern as the Product.
   */
public abstract class Beverage {
      protected String name;
    protected String size;       // Small, Medium, Large
    protected String milk;       // Whole, Skim, Almond, Oat, Soy
    protected int shots;         // 1, 2, 3 (espresso drinks only)
    protected String sweetener;  // Sugar, Honey, Stevia, None
    protected boolean isIced;    // Hot or Iced

    public String getName() {
              return name;
    }

    public String getSize() {
              return size;
    }

    public void setSize(String size) {
              this.size = size;
    }

    public String getMilk() {
              return milk;
    }

    public void setMilk(String milk) {
              this.milk = milk;
    }

    public int getShots() {
              return shots;
    }

    public void setShots(int shots) {
              this.shots = shots;
    }

    public String getSweetener() {
              return sweetener;
    }

    public void setSweetener(String sweetener) {
              this.sweetener = sweetener;
    }

    public boolean isIced() {
              return isIced;
    }

    public void setIced(boolean iced) {
              this.isIced = iced;
    }

    /**
     * Returns a description of the beverage with all customizations.
           */
    public abstract String getDescription();

    @Override
    public String toString() {
        return getDescription();
    }
}
