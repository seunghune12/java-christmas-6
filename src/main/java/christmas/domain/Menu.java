package christmas.domain;

import christmas.util.MenuSplitor;
import christmas.view.InputView;
import java.util.Map;

public class Menu {

    Map<String,Integer> menus;

    public void saveOrder(){
        String order = InputView.inputMenu();
        this.menus = MenuSplitor.splitMenus(order);
    }






    // 일~목 디저트, 금토 메인 2023원 할인


}
