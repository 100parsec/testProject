package de.oliver.hamiko.test.test.project.daycounter.service;

import de.oliver.hamiko.test.test.project.daycounter.Model.DaycounterModel;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Service
public class DaycounterService {

    static DaycounterModel daycounterModel = new DaycounterModel();

    public static DaycounterModel getDaycounterModel(LocalDate date) {
        daycounterModel.setEnteredDate(date);
        daycounterModel.setCurrentDate(LocalDate.now());
        countDays();
        return daycounterModel;
    }

    private static void countDays(){
        long difference = ChronoUnit.DAYS.between(daycounterModel.getEnteredDate(), daycounterModel.getCurrentDate());
        daycounterModel.setDifference(difference);
    }
}
