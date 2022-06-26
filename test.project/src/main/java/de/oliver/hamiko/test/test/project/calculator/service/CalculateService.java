package de.oliver.hamiko.test.test.project.calculator.service;

import de.oliver.hamiko.test.test.project.calculator.model.CalculatorModel;
import org.springframework.stereotype.Service;

@Service
public class CalculateService {
    private CalculatorModel calculatorModel = new CalculatorModel();

    public CalculatorModel getCalculatorModel(Double value) {
        calculatorModel.setMuliplicator(value);
        calculate();
        return calculatorModel;
    }

    private void calculate(){
        calculatorModel.setResult(calculatorModel.getMuliplicator() * calculatorModel.getConstValue());
    }
}
