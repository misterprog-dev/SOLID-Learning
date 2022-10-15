package com.dsoumaila.solildprinciple;

public class BearCarer implements BearCleaner, BearFeeder {
    @Override
    public void washTheBear() {
        //
    }

    @Override
    public void feedTheBear() {
        //
    }

    // With interface segregation, we're free to implement only the methods that matter.
}
