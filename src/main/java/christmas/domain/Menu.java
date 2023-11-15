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

    public void calculateTotalPrice() {
        for (Map.Entry<String, Integer> entry : menus.entrySet()) {
            String menuName = entry.getKey();
            int quantity = entry.getValue();

            // FoodName 열거형에서 해당 메뉴의 가격을 가져와서 총 가격에 더함
            int menuPrice = FoodName.valueOf(menuName).getPrice();
            price += menuPrice * quantity;
        }
    }
}
