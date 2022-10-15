package com.dsoumaila.solildprinciple.OCP;

public class Division implements CalculatorOperation {
    private double left;
    private double right;
    private double result = 0.0;

    public Division(double left, double right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public void perform() {
        if(this.right == 0.0) throw new ArithmeticException("Impossible to do division with 0");
        this.result = this.left / this.right;
    }
}
