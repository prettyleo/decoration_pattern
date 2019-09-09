package com.example.teas;

import com.example.MilkTea;

/**
 * FileName: GreenMilkTea
 * DESCRIPTION: 抹茶
 *
 * @author: SLY
 * @create: 2019/9/9
 */
public class GreenMilkTea extends MilkTea {

    public GreenMilkTea() {
        super.setPrice(16.0f);
        super.setDescription("抹茶");
    }

    @Override
    public float cost() {
        return 16.0f;
    }
}
