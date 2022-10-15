package com.dsoumaila.solildprinciple.OCP;

public class Addition implements CalculatorOperation {
    private double left;
    private double right;
    private double result = 0.0;

    public Addition(double left, double right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public void perform() {
        this.result = this.left + this.right;
    }
}
