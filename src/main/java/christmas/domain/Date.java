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
        if(25 < date){
            return 0;
        }else if(1 <= date && date <= 25){
            return 900 + date * 100 ;
            //christmas 이벤트 할인 값 구하는 식
        }
        return 0;
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
