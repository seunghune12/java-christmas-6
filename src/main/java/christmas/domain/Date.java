package christmas.domain;

import christmas.validator.DateValidator;
import christmas.view.InputView;

public class Date {
    int date;

    public void saveDate(){
        String input = InputView.inputDate();
        this.date = DateValidator.dalivateDate(input);
    }



//    public void calculateChristmasEvent() {
//        return 1000;
//    }

    // 날짜별 할인 최대 3400
    // 별이 있는 날짜 3, 10, 17, 24, 25, 31 1000원

    // 디저트 3,4,5,6,7
    //     10,11,12,13,14
    //     17,18,19,20,21
    //     24,25,26,27,28
    //     31 총 21일 디저트

    // 메인 1,2 / 8,9 / 15,16 / 22,23 / 29,30


}
