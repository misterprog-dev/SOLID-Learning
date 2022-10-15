package com.dsoumaila.solildprinciple.SOLID;

public class Windows98Machine {
    private final Keyboard keyboard;
    private final Monitor monitor;

    /*private final StandardKeyboard keyboard;
    private final Monitor monitor;

    public Windows98Machine() {
        monitor = new Monitor();
        keyboard = new StandardKeyboard();
    }
    // These two class create un link/couple with our class, that's violation of dependecy inversion
    */

    public Windows98Machine(Keyboard keyboard, Monitor monitor) {
        this.monitor = monitor;
        this.keyboard = keyboard;
    }
}
