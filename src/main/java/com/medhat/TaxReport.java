package com.medhat;

public class TaxReport {
    private TaxCalculator calculator;

    // This is a constructor injection inject the implementation without recompiling (mostly used)
    public TaxReport(TaxCalculator calculator) {
        this.calculator = calculator;
    }

    // This is a setter injection inject the implementation without recompiling through program lifetime if I need more than one injection in the future
    public void setCalculator(TaxCalculator calculator) {
        this.calculator = calculator;
    }
    public void show(){
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }
}
