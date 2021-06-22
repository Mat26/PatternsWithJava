package com.pattern.structural.adapter.connectableImpl;

public class englishLamp {

    private boolean isOn;

    public boolean isOn(){
        return isOn;
    }

    public void on(){
        isOn = true;
    }

    public void off(){
        isOn = false;
    }
}
