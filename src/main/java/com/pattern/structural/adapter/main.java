package com.pattern.structural.adapter;

import com.pattern.structural.adapter.connectable.Connectable;

public class main {

    public static void main(String[] args) {
        Connectable newLamp = FactoryDevice.factoryDevice(FactoryDevice.Devices.LAMP);
        newLamp.turnOn();
        System.out.println(newLamp.isItOn());
        Connectable newComputer = FactoryDevice.factoryDevice(FactoryDevice.Devices.COMPUTER);
        newComputer.turnOff();
        System.out.println(newComputer.isItOn());
        Connectable newEnglishLamp= FactoryDevice.factoryDevice(FactoryDevice.Devices.ENGLISHLAMP);
        newEnglishLamp.turnOff();
        System.out.println(newEnglishLamp.isItOn());
    }

}
