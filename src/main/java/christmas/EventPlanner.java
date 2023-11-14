package christmas;

import christmas.view.InputView;

public class EventPlanner {

    public void startPlanning(){
        requestInformation();
    }

    private void requestInformation(){
        InputView.inputDate();
        InputView.inputMenu();
    }
}
