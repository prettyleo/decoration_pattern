package com.example.decorator;

import com.example.MilkTea;

/**
 * FileName: Sugger
 * DESCRIPTION: 加糖
 *
 * @author: SLY
 * @create: 2019/9/9
 */
public class Sugger extends MilkTea {

    private MilkTea milkTea;

    public Sugger(MilkTea milkTea) {
        super.setDescription("加糖");
        super.setPrice(1.0f);
        this.milkTea = milkTea;
    }

    @Override
    public float cost() {
        System.out.println(super.getDescription() + "-" + super.getPrice() + "&" + milkTea.getDescription() + "-" + milkTea.getDescription());
        return super.getPrice() + milkTea.getPrice();
    }
}
