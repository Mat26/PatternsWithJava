package com.pattern.structural.adapter;

import com.pattern.structural.adapter.connectable.Connectable;
import com.pattern.structural.adapter.connectableImpl.computer;
import com.pattern.structural.adapter.connectableImpl.lamp;

public class FactoryDevice {
    public static Connectable factoryDevice(Devices device){
        if(device == Devices.LAMP){
            return new lamp();
        }
        if(device == Devices.COMPUTER){
            return new computer();
        }
        if(device == Devices.ENGLISHLAMP){
            return new computer();
        }
        return null;
    }

    public enum Devices{
        LAMP,COMPUTER,ENGLISHLAMP;
    }
}
