package christmas.domain;

import christmas.constant.FoodName;
import christmas.util.MenuSplitor;
import christmas.view.InputView;
import java.util.Map;

public class Menu {

    Map<String,Integer> menus;
    int price;

    public void saveOrder(){
        String order = InputView.inputMenu();
        this.menus = MenuSplitor.splitMenus(order);
    }


}
