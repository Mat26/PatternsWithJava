package com.pattern.creational.abstractFactory.impl;

import com.pattern.creational.abstractFactory.interfaces.Button;

public class WindowsButton implements Button {

    @Override
    public void paint() {
        System.out.println("YOU HAVE CREATED WINDOWSBUTTON");
    }
}