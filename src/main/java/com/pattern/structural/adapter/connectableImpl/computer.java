package com.pattern.structural.adapter.connectableImpl;

import com.pattern.structural.adapter.connectable.Connectable;

public class computer implements Connectable {

    private boolean on;

    public boolean isItOn(){
        return on;
    }

    @Override
    public void turnOff() {
        on = false;
    }

    @Override
    public void turnOn() {
        on = true;
    }
}
