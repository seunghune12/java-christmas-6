package christmas.domain;

import christmas.view.InputView;

public class Date {
    String date;

    public void requestDate(String date){
        this.date = date;
    }

    public void saveDate(){
        this.date = InputView.inputDate();
    }
}
