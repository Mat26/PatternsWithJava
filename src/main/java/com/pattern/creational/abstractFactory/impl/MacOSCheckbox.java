package com.pattern.creational.abstractFactory.impl;

import com.pattern.creational.abstractFactory.interfaces.Checkbox;

public class MacOSCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("YOU HAVE CREATED MACOSCHECKBOX");
    }
}
