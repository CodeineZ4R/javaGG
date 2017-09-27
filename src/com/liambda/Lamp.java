package com.liambda;

/**
 * Created by admin on 27.09.2017.
 */
public class Lamp implements ElectrCostomer{
    private void lampOn() {
        System.out.println("Lamp on");
    }

    @Override
    public void elcrtOn() {
        lampOn();
    }
}
