package com.liambda;

import java.util.ArrayList;

/**
 * Created by admin on 27.09.2017.
 */
public class Switcher {

    private ArrayList<ElectrCostomer> electrCostomers = new ArrayList<>();

    public void addElectrCostomer(ElectrCostomer e){
        electrCostomers.add(e);
    }

    public void rmElectrCostomer(ElectrCostomer e){
        electrCostomers.remove(e);
    }

    void switcherOn() {
        System.out.println("switcherOn");
        if ( electrCostomers != null) {
            for (ElectrCostomer e : electrCostomers) {
                e.elcrtOn();
            }
        }
    }


}
