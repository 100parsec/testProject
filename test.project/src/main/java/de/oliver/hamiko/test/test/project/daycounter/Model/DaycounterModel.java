package de.oliver.hamiko.test.test.project.daycounter.Model;

import java.time.LocalDate;

public class DaycounterModel {

    LocalDate enteredDate;
    LocalDate currentDate;
    long difference;


    public DaycounterModel() {
    }

    public DaycounterModel(LocalDate enteredDate, LocalDate currentDate, long difference) {
        this.enteredDate = enteredDate;
        this.currentDate = currentDate;
        this.difference = difference;
    }

    public LocalDate getEnteredDate() {
        return enteredDate;
    }

    public void setEnteredDate(LocalDate enteredDate) {
        this.enteredDate = enteredDate;
    }

    public LocalDate getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(LocalDate currentDate) {
        this.currentDate = currentDate;
    }

    public long getDifference() {
        return difference;
    }

    public void setDifference(long difference) {
        this.difference = difference;
    }
}
