package christmas.domain;

import christmas.constant.Calendar;
import christmas.constant.FoodName;
import christmas.validator.DateValidator;
import christmas.view.InputView;

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

    // 디저트 3,4,5,6,7
    //     10,11,12,13,14
    //     17,18,19,20,21
    //     24,25,26,27,28
    //     31 총 21일 디저트

    // 메인 1,2 / 8,9 / 15,16 / 22,23 / 29,30


}
