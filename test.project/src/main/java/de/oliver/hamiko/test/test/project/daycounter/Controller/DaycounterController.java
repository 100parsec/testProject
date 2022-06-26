package de.oliver.hamiko.test.test.project.daycounter.Controller;

import de.oliver.hamiko.test.test.project.daycounter.Model.DaycounterModel;
import de.oliver.hamiko.test.test.project.daycounter.service.DaycounterService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/daycounter/{dateString}")
public class DaycounterController {
    private final DaycounterService daycounterService;

    public DaycounterController(DaycounterService daycounterService) {
        this.daycounterService = daycounterService;
    }

    @GetMapping
    public ResponseEntity<Long> getDifference(@PathVariable String dateString){
        LocalDate date = LocalDate.parse(dateString);
        DaycounterModel daycounterModel = DaycounterService.getDaycounterModel(date);
        return new ResponseEntity<>(daycounterModel.getDifference(), HttpStatus.OK);
    }
}
