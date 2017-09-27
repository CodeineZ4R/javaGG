package com.liambda;

/**
 * Created by admin on 27.09.2017.
 */
public class Radio implements ElectrCostomer {

    private void radioOn() {
        System.out.println("Radio on");
    }

    @Override
    public void elcrtOn() {
        radioOn();
    }
}
