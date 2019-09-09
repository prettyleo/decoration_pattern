package com.example;

import com.example.decorator.Ice;
import com.example.decorator.Sugger;
import com.example.teas.GreenMilkTea;

/**
 * FileName: MilkTeaTest
 * DESCRIPTION:
 *
 * @author: SLY
 * @create: 2019/9/9
 */
public class MilkTeaTest {

    public static void main(String[] args) {
        MilkTea greenTea = new GreenMilkTea();
        Ice ice = new Ice(greenTea);
        Sugger sugger = new Sugger(ice);
        Float price = sugger.getPrice();
        System.out.println("总价格:" + price);
    }

}
