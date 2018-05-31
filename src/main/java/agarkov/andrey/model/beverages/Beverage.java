package agarkov.andrey.model.beverages;

import java.math.BigDecimal;

public abstract class Beverage {

    public enum Size { TALL, GRANDE, VENTI };
    protected static Size DEFAULT_SIZE = Size.TALL;

    public Size size = DEFAULT_SIZE;
    protected String description;

    public String getDescription() {
        return description;
    };

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public abstract BigDecimal cost();
}
