package com.example.teas;

import com.example.MilkTea;

/**
 * FileName: DoubleQMilkTea
 * DESCRIPTION: 双Q奶茶
 *
 * @author: SLY
 * @create: 2019/9/9
 */
public class DoubleQMilkTea extends MilkTea {

    public DoubleQMilkTea() {
        super.setPrice(14.0f);
        super.setDescription("双Q奶茶");
    }

    @Override
    public float cost() {
        return 14.0f;
    }
}
