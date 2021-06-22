package com.pattern.structural.adapter.connectableImpl;

import com.pattern.structural.adapter.connectable.Connectable;

public class englishLampAdapter implements Connectable {

    private englishLamp englishAdapter;

    public englishLampAdapter(englishLamp englishAdapter){
        this.englishAdapter = englishAdapter;
    }

    @Override
    public void turnOff() {
        englishAdapter.off();
    }

    @Override
    public void turnOn() {
        englishAdapter.on();
    }

    @Override
    public boolean isItOn() {
        return englishAdapter.isOn();
    }
}
