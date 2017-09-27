package com.liambda;

/**
 * Created by admin on 27.09.2017.
 */
public class StartPoint {
    public static void main(String[] args) {
        System.out.println("Start point");

        Lamp lamp = new Lamp();
        Radio radio = new Radio();
        Switcher switcher = new Switcher();

        switcher.addElectrCostomer(lamp);
        switcher.addElectrCostomer(radio);

        switcher.addElectrCostomer(new ElectrCostomer() {
            @Override
            public void elcrtOn() {
                System.out.println("fire!!!");
            }
        });

        switcher.addElectrCostomer(() -> {
            System.out.println("fire !!!");
        });

        switcher.switcherOn();

    }
}
