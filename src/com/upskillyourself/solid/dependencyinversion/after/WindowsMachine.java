package com.upskillyourself.solid.dependencyinversion.after;

public class WindowsMachine {

    private final Mouse electronicMouse;

    private final Keyboard electronicKeyboard;

    public WindowsMachine(Mouse mouse, Keyboard keyboard) {
        // loose coupling the object
        this.electronicMouse = mouse;
        this.electronicKeyboard = keyboard;
    }
}
