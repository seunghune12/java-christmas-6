package christmas.domain;

import christmas.constant.Calendar;
import christmas.constant.FoodName;
import christmas.validator.DateValidator;
import christmas.view.InputView;
import christmas.view.OutputView;

public class Date {
    int date;

    public void saveDate(){
        String input = InputView.inputDate();
        this.date = DateValidator.dalivateDate(input);
    }



    public int calculateChristmasEvent() {
        return this.date * 100 - 100 + 1000;
    }

    public boolean checkStarEvent(){
        return Calendar.isStarByDate(this.date);
    }

    public String checkSaleSort(){
        return Calendar.getSaleSortByDate(this.date);
    }

    public void printStartResultLine(){
        OutputView.printResultStart(date);
    }


}
