package com.example.decorator;

import com.example.MilkTea;

/**
 * FileName: Ice
 * DESCRIPTION: 加冰
 *
 * @author: SLY
 * @create: 2019/9/9
 */
public class Ice extends MilkTea {

    private MilkTea milkTea;

    public Ice(MilkTea milkTea) {
        super.setPrice(1.0f);
        super.setDescription("加冰");
        this.milkTea = milkTea;
    }

    @Override
    public float cost() {
        System.out.println(super.getDescription() + "-" + super.getPrice() + "&" + milkTea.getDescription() + "-" + milkTea.getPrice());
        return super.getPrice() + milkTea.getPrice();
    }
}
