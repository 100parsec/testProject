package de.oliver.hamiko.test.test.project.calculator.model;

public class CalculatorModel {
    Double constValue = Double.valueOf(5);
    Double muliplicator;
    Double result;

    public CalculatorModel() {
    }

    public CalculatorModel(Double muliplicator, Double result) {
        this.muliplicator = muliplicator;
        this.result = result;
    }

    public Double getMuliplicator() {
        return muliplicator;
    }

    public void setMuliplicator(Double muliplicator) {
        this.muliplicator = muliplicator;
    }

    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }

    public Double getConstValue() {
        return constValue;
    }
}
