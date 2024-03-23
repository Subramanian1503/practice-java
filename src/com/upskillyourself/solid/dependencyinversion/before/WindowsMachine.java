package com.upskillyourself.solid.dependencyinversion.before;

public class WindowsMachine {

    private final Mouse electronicMouse;

    private final Keyboard electronicKeyboard;

    public WindowsMachine(ElectronicMouse electronicMouse, ElectronicKeyboard electronicKeyboard) {
        // tight coupling the object
        this.electronicMouse = electronicMouse;
        this.electronicKeyboard = electronicKeyboard;
    }
}
