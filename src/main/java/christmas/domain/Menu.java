package christmas.domain;

import christmas.view.InputView;

public class Menu {
    String menu;

    public void requestMenu(String menu){
        this.menu = menu;
    }

    public void saveMenu(){
        this.menu = InputView.inputMenu();
    }
}
