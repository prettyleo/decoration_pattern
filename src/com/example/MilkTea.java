package com.example;

/**
 * FileName: MilkTea
 * DESCRIPTION:
 *
 * @author: SLY
 * @create: 2019/9/9
 */
public abstract class MilkTea {

    private Float price = 0f;

    private String description;

    public abstract float cost();

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
