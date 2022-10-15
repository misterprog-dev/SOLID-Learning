package com.dsoumaila.solildprinciple.OCP;

import java.security.InvalidParameterException;

public class Calculator {
    public void calculate(CalculatorOperation operation) {
        if (operation == null) {
            throw new InvalidParameterException("Can not perform operation");
        }
        // Now we can add many operations with interface implementing in the operations.
        operation.perform();
    }

}
