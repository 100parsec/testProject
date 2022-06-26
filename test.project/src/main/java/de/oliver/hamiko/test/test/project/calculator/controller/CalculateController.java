package de.oliver.hamiko.test.test.project.calculator.controller;

import de.oliver.hamiko.test.test.project.calculator.model.CalculatorModel;
import de.oliver.hamiko.test.test.project.calculator.service.CalculateService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculation/{value}")
public class CalculateController {

    private final CalculateService calculateService;

    public CalculateController(CalculateService calculateService) {
        this.calculateService = calculateService;
    }

    @GetMapping
    public ResponseEntity<Double> getCalculation(@PathVariable Double value){
        CalculatorModel calculationModel = calculateService.getCalculatorModel(value);
        return new ResponseEntity<>(calculationModel.getResult(), HttpStatus.OK);
    }
}
